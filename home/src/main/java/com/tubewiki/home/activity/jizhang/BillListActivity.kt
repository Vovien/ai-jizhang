package com.tubewiki.home.activity.jizhang

import android.os.Bundle
import android.view.LayoutInflater
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.apkdv.mvvmfast.base.ViewModelActivity
import com.apkdv.mvvmfast.databinding.DefaultViewstatusBoxEmpty4Binding
import com.apkdv.mvvmfast.ktx.launch
import com.apkdv.mvvmfast.ktx.netCatch
import com.apkdv.mvvmfast.ktx.next
import com.apkdv.mvvmfast.ktx.showToast
import com.blankj.utilcode.util.ScreenUtils
import com.jmbon.middleware.config.Constant
import com.jmbon.middleware.utils.dp
import com.jmbon.middleware.utils.init
import com.scwang.smart.refresh.layout.api.RefreshLayout
import com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener
import com.tubewiki.home.adapter.jizhang.BillDetailAdapter
import com.tubewiki.home.bean.jizhang.BillEvent
import com.tubewiki.home.databinding.ActivityBillListBinding
import com.tubewiki.home.viewmodel.JiZhangModel
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

/**
 * 账单分类
 * @author MilkCoder
 * @date 2023/11/21
 * @copyright All copyrights reserved to ManTang.
 */
@Route(path = "/home/bill/list/activity")
class BillListActivity : ViewModelActivity<JiZhangModel, ActivityBillListBinding>(),
    OnRefreshLoadMoreListener {

    @JvmField
    @Autowired
    var cycleId: Int = 0

    @JvmField
    @Autowired
    var type: Int = 0

    private var mPage = 1

    private val billDetailAdapter by lazy { BillDetailAdapter() }

    override fun beforeViewInit() {
        super.beforeViewInit()
        EventBus.getDefault().register(this)
    }

    override fun onDestroy() {
        EventBus.getDefault().unregister(this)
        super.onDestroy()
    }

    override fun initView(savedInstanceState: Bundle?) {
        setTitleName("账单分类")
        initPageState()
        binding.smartRefresh.setOnRefreshLoadMoreListener(this)
        binding.recyclerView.init(billDetailAdapter)
    }

    override fun initViewModel() {
        super.initViewModel()
        ARouter.getInstance().inject(this)
    }

    override fun getData() {
        super.getData()
        launch {
            viewModel.getCategoryBillList(cycleId, type, mPage).netCatch {
                showErrorState()
                message.showToast()
            }.next {
                showContentState()
                if (mPage == 1) {
                    billDetailAdapter.setNewInstance(list)
                    if (list.isEmpty()) {
                        val viewBinding =
                            DefaultViewstatusBoxEmpty4Binding.inflate(LayoutInflater.from(this@BillListActivity))
                        billDetailAdapter.setFooterView(viewBinding.root)
                        val params = viewBinding.root.layoutParams
                        params.height = ScreenUtils.getScreenHeight() - 200f.dp()
                        viewBinding.root.layoutParams = params
                        binding.smartRefresh.finishRefresh()
                        binding.smartRefresh.setEnableLoadMore(false)
                    }
                } else {
                    list.let { billDetailAdapter.addData(it) }
                }

                mPage++
                binding.smartRefresh.finishLoadMore()

                if (list.size < Constant.PAGE_SIZE) {
                    binding.smartRefresh.finishLoadMoreWithNoMoreData()
                }
            }
        }
    }

    override fun onRefresh(refreshLayout: RefreshLayout) {
        mPage = 1
        getData()
    }

    override fun onLoadMore(refreshLayout: RefreshLayout) {
        getData()
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEvent(event: BillEvent) {
        if (event.isResh) {
            mPage = 1
            getData()
        }
    }
}