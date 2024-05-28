package com.tubewiki.home.activity.jizhang

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.apkdv.mvvmfast.base.ViewModelActivity
import com.jmbon.middleware.utils.init
import com.qmuiteam.qmui.kotlin.onClick
import com.tubewiki.home.R
import com.tubewiki.home.adapter.jizhang.CycleAdapter
import com.tubewiki.home.bean.jizhang.ChangeCycleEvent
import com.tubewiki.home.databinding.ActivityCycleSwitchBinding
import com.tubewiki.home.router.HomeRouter
import com.tubewiki.home.viewmodel.CycleViewModel
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

/**
 * 切换周期
 * @author MilkCoder
 * @date 2023/11/21
 * @copyright All copyrights reserved to ManTang.
 */
@Route(path = "/home/cycle/switch/activity")
class CycleSwitchActivity : ViewModelActivity<CycleViewModel, ActivityCycleSwitchBinding>() {

    override fun beforeViewInit() {
        super.beforeViewInit()
        EventBus.getDefault().register(this)
    }

    override fun onDestroy() {
        EventBus.getDefault().unregister(this)
        super.onDestroy()
    }

    private val cycleAdapter by lazy {
        CycleAdapter()
    }

    override fun initView(savedInstanceState: Bundle?) {
        initStateLayout(binding.stateLayout)
        titleBarView.centerTextView.setSingleLine()
        titleBarView.centerTextView.ellipsize = TextUtils.TruncateAt.END
        setTitleName("切换周期")
        titleBarView.setRightView(R.layout.layout_cycle_right)
        //点击加号
        titleBarView.rightCustomView.findViewById<View>(R.id.fl_add).setOnClickListener {
            HomeRouter.toCycleSettingPage(fromSwitch = true)
        }
        binding.recyclerView.init(
            cycleAdapter,
            dividerHeight = 10f,
            vertical = false
        )

        cycleAdapter.setOnItemChildClickListener { adapter, view, position ->
            when (view.id) {
                R.id.iv_bg -> {
                    cycleAdapter.data.forEachIndexed { index, cycle ->
                        if (cycle.isSelected == 1 && index != position) {
                            cycle.isSelected = 0
                        }
                        if (index == position) {
                            cycle.isSelected = 1
                        }
                        cycleAdapter.notifyItemChanged(index)
                    }
                }

                R.id.tv_content -> {
                    val data = cycleAdapter.data[position]
                    HomeRouter.toCycleSettingPage(data.id)
                }
            }

        }

        binding.saveAndBack.onClick {
            viewModel.changeCycleSelected {
                finish()
                EventBus.getDefault().post(ChangeCycleEvent(true))
            }
        }
    }

    override fun initViewModel() {
        super.initViewModel()
        viewModel.myCycleListLiveData.observe(this) {
            if (it == null) {
                showErrorState()
                return@observe
            }
            showContentState()
            cycleAdapter.setNewInstance(it.cycles)
        }

    }


    override fun getData() {
        super.getData()
        viewModel.myCycleListFlow()

    }

    override fun refreshDataWhenError() {
        super.refreshDataWhenError()
        viewModel.myCycleListFlow()
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEvent(event: ChangeCycleEvent) {
        if (event.re) {
            viewModel.myCycleListFlow()
        }
    }
}