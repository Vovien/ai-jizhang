package com.tubewiki.home.activity.jizhang

import android.view.View
import com.apkdv.mvvmfast.base.DataBindingFragment
import com.apkdv.mvvmfast.ktx.launch
import com.apkdv.mvvmfast.ktx.next
import com.apkdv.mvvmfast.ktx.showToast
import com.jmbon.middleware.extention.dealPage
import com.jmbon.middleware.utils.LocationHelper
import com.jmbon.middleware.utils.init
import com.qmuiteam.qmui.kotlin.onClick
import com.tubewiki.home.adapter.jizhang.HospitalAdapter
import com.tubewiki.home.adapter.jizhang.ProvinceAdapter
import com.tubewiki.home.bean.jizhang.Hospital
import com.tubewiki.home.databinding.ActivityChooseHospitalBinding
import com.tubewiki.home.viewmodel.ChooseHospitalViewModel

/**
 * 选择医院
 * @author MilkCoder
 * @date 2023/11/20
 * @copyright All copyrights reserved to ManTang.
 */
class ChooseHospitalFragment :
    DataBindingFragment<ChooseHospitalViewModel, ActivityChooseHospitalBinding>() {

    private lateinit var back: Back

    private val hospitalAdapter by lazy {
        HospitalAdapter()
    }

    private val provinceAdapter by lazy {
        ProvinceAdapter()
    }

    override fun initView(view: View) {
//        setTitleName("选择医院")
        binding.recyclerView.init(provinceAdapter)
        binding.recyclerViewSub.init(hospitalAdapter)
        binding.tvLocation.onClick {
            LocationHelper.getLocationCoordinate(requireContext()) { _, _ ->
                viewModel.getLocation(requireContext(), onCityChangeListener = { _, _, _ ->
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
        }

        hospitalAdapter.setOnItemClickListener { _, _, position ->
            val data = hospitalAdapter.data[position]
            hospitalAdapter.data.forEachIndexed { index, province ->
                if (province.isChecked && index != position) {
                    province.isChecked = false
                }
                if (index == position) {
                    province.isChecked = true
                }
                hospitalAdapter.notifyItemChanged(index)
            }
            back.setHospital(data)
        }
    }

    override fun initViewModel() {
        super.initViewModel()
        viewModel.provinceLiveData.observe(this) {
            if (it?.provinces.isNullOrEmpty()) return@observe
            provinceAdapter.setNewInstance(it?.provinces)
            if (it?.provinces?.get(0)?.isChecked == true) {
                viewModel.currentPage = 1
                viewModel.getHospitalByProvince1(it.provinces[0].id)
            }
        }

        viewModel.hospitalListLiveData.observe(this) {
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
        viewModel.getAllProvince()
    }

    companion object {
        operator fun invoke(back: Back): ChooseHospitalFragment {
            val fragment = ChooseHospitalFragment()
            fragment.back = back
            return fragment
        }
    }

    fun interface Back {
        fun setHospital(data: Hospital)
    }
}