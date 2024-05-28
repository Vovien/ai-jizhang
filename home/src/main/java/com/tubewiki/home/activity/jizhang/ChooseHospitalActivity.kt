package com.tubewiki.home.activity.jizhang

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import androidx.core.view.isVisible
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.apkdv.mvvmfast.base.DataBindingActivity
import com.apkdv.mvvmfast.base.ViewModelActivity
import com.apkdv.mvvmfast.ktx.launch
import com.apkdv.mvvmfast.ktx.next
import com.apkdv.mvvmfast.ktx.showToast
import com.jmbon.middleware.config.Constant
import com.jmbon.middleware.extention.dealPage
import com.jmbon.middleware.utils.LocationHelper
import com.jmbon.middleware.utils.init
import com.qmuiteam.qmui.kotlin.onClick
import com.tubewiki.home.activity.jizhang.JiZhangUtil.provinceId
import com.tubewiki.home.adapter.jizhang.BodySateAdapter
import com.tubewiki.home.adapter.jizhang.HospitalAdapter
import com.tubewiki.home.adapter.jizhang.ProvinceAdapter
import com.tubewiki.home.bean.jizhang.Province
import com.tubewiki.home.databinding.ActivityChooseHospitalBinding
import com.tubewiki.home.router.HomeRouter
import com.tubewiki.home.viewmodel.ChooseHospitalViewModel
import okhttp3.internal.notify

/**
 * 选择医院
 * @author MilkCoder
 * @date 2023/11/20
 * @copyright All copyrights reserved to ManTang.
 */
@Route(path = "/home/choose/hospital/activity")
class ChooseHospitalActivity :
    DataBindingActivity<ChooseHospitalViewModel, ActivityChooseHospitalBinding>() {

    @JvmField
    @Autowired
    var hospitalId: Int = 0

    private val hospitalAdapter by lazy {
        HospitalAdapter()
    }

    private val provinceAdapter by lazy {
        ProvinceAdapter()
    }

    override fun initView(savedInstanceState: Bundle?) {
        setTitleName("选择医院")
        binding.recyclerView.init(provinceAdapter)
        binding.recyclerViewSub.init(hospitalAdapter)
        binding.tvLocation.onClick {
            LocationHelper.getLocationCoordinate(this) { _, _ ->
                viewModel.getLocation(this, onCityChangeListener = { _, _, _ ->
                    "定位成功".showToast()
                }, onDisEnabledGPS = {

                })
            }
        }

        binding.srlRefresh.apply {
            setOnLoadMoreListener {
                viewModel.currentPage++
                val id = provinceAdapter.data.find { it.isChecked }?.id ?: 0
                viewModel.getHospitalByProvince1(id)
            }
        }

        provinceAdapter.setOnItemClickListener { _, _, position ->
            val data = provinceAdapter.data[position]
            provinceAdapter.data.forEachIndexed { index, province ->
                if (province.isChecked && index != position) {
                    province.isChecked = false
                }
                if (index == position) {
                    province.isChecked = true
                }
                provinceAdapter.notifyItemChanged(index)
            }
            if (position == 0) {
                viewModel.setShowTip(true)
            } else {
                viewModel.setShowTip(false)
            }
            viewModel.currentPage = 1
            viewModel.getHospitalByProvince1(data.id)
            provinceId = data.id
        }

        hospitalAdapter.setOnItemClickListener { _, _, position ->
            val data = hospitalAdapter.data[position]
            data.isChecked = !data.isChecked
            hospitalAdapter.notifyItemChanged(position)
            val intent = Intent()
            intent.putExtra("hospital", data)
            setResult(CHOOSE_FINISH_CODE, intent)
            finish()
        }
    }

    override fun initViewModel() {
        super.initViewModel()
        ARouter.getInstance().inject(this)
        viewModel.provinceLiveData.observe(this) {
            if (it?.provinces.isNullOrEmpty()) return@observe
            provinceAdapter.setNewInstance(it?.provinces)
            val id = it?.provinces?.find(Province::isChecked)?.id ?: 0
            viewModel.currentPage = 1
            viewModel.getHospitalByProvince1(id)
        }

        viewModel.hospitalListLiveData.observe(this) {
            if (hospitalId != 0) {
                it?.hospitals?.forEach { hospital ->
                    if (hospital.id == hospitalId) {
                        hospital.isChecked = true
                    }
                }
            }
            binding.srlRefresh.dealPage(viewModel.currentPage, it?.hospitals, hospitalAdapter)
        }

        launch {
            viewModel.cuProvinceFlow.next {
                binding.province = this
                binding.executePendingBindings()
            }
        }
    }

    override fun getData() {
        super.getData()
        viewModel.getAllProvince(provinceId)
    }

    companion object {
        const val CHOOSE_FINISH_CODE = 1222

    }
}