package com.tubewiki.home.activity.jizhang

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.apkdv.mvvmfast.base.ViewModelActivity
import com.apkdv.mvvmfast.ktx.showToast
import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.ColorUtils
import com.jmbon.middleware.utils.init
import com.qmuiteam.qmui.kotlin.onClick
import com.tubewiki.home.R
import com.tubewiki.home.adapter.jizhang.BodySateAdapter
import com.tubewiki.home.bean.jizhang.ChangeCycleEvent
import com.tubewiki.home.bean.jizhang.Hospital
import com.tubewiki.home.databinding.ActivityCycleSettingBinding
import com.tubewiki.home.databinding.HeaderCycleSettingBinding
import com.tubewiki.home.router.HomeRouter
import com.tubewiki.home.viewmodel.CycleViewModel
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

/**
 * 设置周期
 * @author MilkCoder
 * @date 2023/11/17
 * @copyright All copyrights reserved to ManTang.
 */
@Route(path = "/home/cycle/setting/activity")
class CycleSettingActivity : ViewModelActivity<CycleViewModel, ActivityCycleSettingBinding>() {

    @JvmField
    @Autowired
    var cycleId: Int = 0

    @JvmField
    @Autowired
    var fromSwitch: Boolean = false

    private val headerBinding by lazy {
        HeaderCycleSettingBinding.inflate(layoutInflater)
    }

    private val bodySateAdapter by lazy {
        BodySateAdapter().apply {
            addHeaderView(headerBinding.root)
        }
    }

    override fun beforeViewInit() {
        super.beforeViewInit()
        EventBus.getDefault().register(this)
    }

    override fun onDestroy() {
        EventBus.getDefault().unregister(this)
        super.onDestroy()
    }

    override fun initView(savedInstanceState: Bundle?) {
        initStateLayout(binding.stateLayout)
        setTitleName("设置周期")
        JiZhangUtil.provinceId = 0
        binding.apply {
            recyclerView.init(bodySateAdapter)
        }
        headerBinding.tvHospital.onClick {
            val hospitalId = viewModel.physicalsLiveData.value?.hospital?.id ?: 0
            HomeRouter.toChooseHospitalPage(this, hospitalId = hospitalId)
        }
        if (cycleId != 0) {
            binding.tvDel.isVisible = true
        }
        binding.tvDel.onClick {
            viewModel.delBill(id = cycleId) {
                EventBus.getDefault().post(ChangeCycleEvent(true))
                "删除成功".showToast()
                finish()
            }
        }
        binding.saveAndBack.onClick {
            viewModel.saveCycle(id = cycleId) {
                "保存成功".showToast()
                if (cycleId == 0 && !fromSwitch) {
                    EventBus.getDefault().post(ChangeCycleEvent(true))
                }
                if (fromSwitch) {
                    EventBus.getDefault().post(ChangeCycleEvent(true))
                }
                finish()
            }
        }
    }

    override fun initViewModel() {
        ARouter.getInstance().inject(this)
        super.initViewModel()
        viewModel.physicalsLiveData.observe(this) {
            if (it == null) {
                showErrorState()
                return@observe
            }
            showContentState()
            if (it.hospital != null) {
                headerBinding.tvHospital.text = it.hospital.hospitalName
                headerBinding.tvHospital.setTextColor(ColorUtils.getColor(R.color.color_262626))
            }
            bodySateAdapter.setNewInstance(it.physicals)
        }

    }

    override fun getData() {
        super.getData()
        viewModel.getBodySateList(cycleId)

    }

    override fun refreshDataWhenError() {
        super.refreshDataWhenError()
        viewModel.getBodySateList(cycleId)
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEvent(event: ChangeCycleEvent) {
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            ChooseHospitalActivity.CHOOSE_FINISH_CODE -> {
                val hospital: Hospital? = data?.getParcelableExtra("hospital")
                if (hospital != null) {
                    viewModel.setHospitalId(hospital)
                    headerBinding.tvHospital.text = hospital.hospitalName
                    headerBinding.tvHospital.setTextColor(ColorUtils.getColor(R.color.color_262626))
                }
            }
        }
    }

}