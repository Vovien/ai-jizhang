package com.tubewiki.home.fragment

import android.graphics.Typeface
import android.view.View
import androidx.core.view.isVisible
import com.alibaba.android.arouter.facade.annotation.Route
import com.apkdv.mvvmfast.base.DataBindingFragment
import com.apkdv.mvvmfast.ktx.launch
import com.apkdv.mvvmfast.ktx.netCatch
import com.apkdv.mvvmfast.ktx.next
import com.blankj.utilcode.util.ActivityUtils
import com.jmbon.middleware.bean.event.UserLoginEvent
import com.jmbon.middleware.common.CommonViewModel.Companion.popupImageFlow
import com.jmbon.middleware.config.Constant
import com.jmbon.middleware.utils.init
import com.jmbon.middleware.utils.logInToIntercept
import com.jmbon.middleware.valid.action.Action
import com.qmuiteam.qmui.kotlin.onClick
import com.scwang.smart.refresh.layout.api.RefreshLayout
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener
import com.tubewiki.home.R
import com.tubewiki.home.adapter.HomeCategoryAdapter
import com.tubewiki.home.adapter.jizhang.BillDetailAdapter
import com.tubewiki.home.bean.jizhang.BillEvent
import com.tubewiki.home.bean.jizhang.Bills
import com.tubewiki.home.bean.jizhang.ChangeCycleEvent
import com.tubewiki.home.databinding.FragmentAccountBinding
import com.tubewiki.home.dialog.WeChatDialog
import com.tubewiki.home.router.HomeRouter
import com.tubewiki.home.viewmodel.AccountViewModel
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

@Route(path = "/home/account/fragment")
class AccountFragment : DataBindingFragment<AccountViewModel, FragmentAccountBinding>(), OnLoadMoreListener {

    private val billDetailAdapter by lazy { BillDetailAdapter() }

    private val categoryAdapter by lazy {
        HomeCategoryAdapter()
    }

    override fun beforeViewInit() {
        super.beforeViewInit()
        EventBus.getDefault().register(this)
    }

    override fun onDestroy() {
        EventBus.getDefault().unregister(this)
        super.onDestroy()
    }

    override fun initView(view: View) {
        binding.apply {
            initStateLayout(binding.llContent)

            val typeface =
                Typeface.createFromAsset(requireContext().assets, "fonts/roboto_black.ttf")
            tvHintAllAmount.typeface = typeface
            tvAllAmount.typeface = typeface

            recyclerView.apply { init(billDetailAdapter) }

            rvCategory.adapter = categoryAdapter

            billDetailAdapter.setEmptyView(R.layout.default_viewstatus_box_empty3)

            cycleRadioGroup.setOnCheckedChangeListener { _, checkId ->
                when (checkId) {
                    R.id.current_cycle_radio_button -> {
                        viewModel.checkCurrentCycle(true)
                    }

                    R.id.all_cycle_radio_button -> {
                        viewModel.checkCurrentCycle(false)
                    }
                }
            }
            clCheck.onClick {
                Action {
                    viewModel.toBillListPage(1)
                }.logInToIntercept()
            }
            clMedicine.onClick {
                Action {
                    viewModel.toBillListPage(2)
                }.logInToIntercept()
            }
            clEmbryo.onClick {
                Action {
                    viewModel.toBillListPage(3)
                }.logInToIntercept()
            }
            clOther.onClick {
                Action {
                    viewModel.toBillListPage(4)
                }.logInToIntercept()
            }
            tvSwitch.onClick {
                Action {
                    HomeRouter.toCycleSwitchPage()
                }.logInToIntercept()
            }
            srlRefresh.setOnLoadMoreListener(this@AccountFragment)
        }
    }

    override fun initViewModel() {
        super.initViewModel()
        getCycleList()
    }

    override fun getData() {
        viewModel.homeHeaderBean.observe(this) {
            it?.apply {
                categoryAdapter.setList(it.topic_list)
                binding.rvCategory.isVisible = !it.topic_list.isNullOrEmpty()
            }
        }
        launch {
            popupImageFlow.next {
                if (this == null) return@next
                if (viewModel.firstShowFlow.value) {
                    val popupImage = popupImageFlow.value?.popup_adv
                    if (popupImage?.popupImg?.isNotEmpty() == true) {
                        val dialog = WeChatDialog(ActivityUtils.getTopActivity(), popupImage)
                        dialog.showDialog()
                        viewModel.firstShowFlow.value = false
                    } else {
                        viewModel.firstShowFlow.value = false
                    }
                }
            }
        }

        launch {
            viewModel.isCurrentFlow.next {
                binding.isCurrent = this
                binding.executePendingBindings()
            }
        }

        launch {
            viewModel.billsFlow.next {
                this.apply {
                    binding.bill = this
                    setAdapter(bills)
                    binding.executePendingBindings()
                }
            }
        }

        viewModel.getPopupImage()
    }

    private fun getCycleList() {
        viewModel.getHeaderInfo()
        launch {
            viewModel.myCycleListFlow().netCatch {
                if (this.code.toInt() == 401) {
                    showContentState()
                } else {
                    showErrorState()
                }
                viewModel.firstPage = false
                binding.tvSwitch.text = "您还未记录账单"
                binding.tvSwitch.isEnabled = false
            }.next {
                showContentState()
                if (this == null) {
                    binding.tvSwitch.text = "您还未记录账单"
                    binding.tvSwitch.isEnabled = false
                } else {
                    binding.tvSwitch.text = "${this?.name}费用"
                    binding.tvSwitch.isEnabled = true
                }
                viewModel.curPage = 1
                viewModel.allPage = 1
                viewModel.firstPage = false
                if (viewModel.isCurrentFlow.value) {
                    viewModel.getCurrentBillDetail()
                } else {
                    viewModel.getAllBillDetail(0)
                }
            }
        }
    }

    private fun setAdapter(bills: MutableList<Bills>) {
        if (viewModel.isCurrentFlow.value) {
            if (viewModel.curPage == 1) {
                billDetailAdapter.setNewInstance(bills)
                if (bills.isEmpty()) {
                    binding.srlRefresh.finishRefresh()
                    binding.srlRefresh.setEnableLoadMore(false)
                }
            } else {
                billDetailAdapter.addData(bills)
            }

            viewModel.curPage++

            binding.srlRefresh.finishLoadMore()

            if (bills.size < Constant.PAGE_SIZE) {
                binding.srlRefresh.finishLoadMoreWithNoMoreData()
            }

        } else {
            if (viewModel.allPage == 1) {
                billDetailAdapter.setNewInstance(bills)
                if (bills.isEmpty()) {
                    binding.srlRefresh.finishRefresh()
                    binding.srlRefresh.setEnableLoadMore(false)
                }
            } else {
                billDetailAdapter.addData(bills)
            }

            viewModel.allPage++

            binding.srlRefresh.finishLoadMore()

            if (bills.size < Constant.PAGE_SIZE) {
                binding.srlRefresh.finishLoadMoreWithNoMoreData()
            }
        }
    }

    override fun refreshDataWhenError() {
        super.refreshDataWhenError()
        getCycleList()
        viewModel.getPopupImage()
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEvent(event: BillEvent) {
        if (event.isResh) {
            getCycleList()
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEvent(event: ChangeCycleEvent) {
        if (event.re) {
            getCycleList()
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun loginEvent(event: UserLoginEvent) {
        if (event.login) {
            getCycleList()
        } else {
            binding.tvSwitch.text = "您还未记录账单"
            binding.tvSwitch.isEnabled = false
            viewModel.resetPage()
        }

    }

    override fun onLoadMore(refreshLayout: RefreshLayout) {
        if (viewModel.isCurrentFlow.value) {
            viewModel.getCurrentBillDetail()
        } else {
            viewModel.getAllBillDetail(0)
        }
    }
}
