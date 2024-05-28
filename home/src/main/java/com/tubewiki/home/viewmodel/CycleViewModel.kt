package com.tubewiki.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.apkdv.mvvmfast.ktx.showToast
import com.jmbon.middleware.common.CommonViewModel
import com.tubewiki.home.api.JiZhangApi
import com.tubewiki.home.bean.jizhang.Cycle
import com.tubewiki.home.bean.jizhang.Hospital
import com.tubewiki.home.bean.jizhang.MyCyclesBean
import com.tubewiki.home.bean.jizhang.PhysicalStatusBean
import kotlinx.coroutines.flow.MutableStateFlow

/**
 *
 * @author MilkCoder
 * @date 2023/11/21
 * @copyright All copyrights reserved to ManTang.
 */
class CycleViewModel : CommonViewModel() {

    private val _physicalsLiveData = MutableLiveData<PhysicalStatusBean?>()
    val physicalsLiveData: LiveData<PhysicalStatusBean?> = _physicalsLiveData

    private val _myCycleListLiveData = MutableLiveData<MyCyclesBean?>()
    val myCycleListLiveData = _myCycleListLiveData

    fun myCycleListFlow() {
        launchOnlyResult({
            JiZhangApi.getMyCycles()
        }, { bean ->
            _myCycleListLiveData.postValue(bean)
        })
    }

    fun changeCycleSelected(onSaveSuccess: () -> Unit) {
        val myCycle = _myCycleListLiveData.value ?: return
        val id = myCycle.cycles?.find { it.isSelected == 1 }?.id ?: 0
        launchOnlyResult({
            JiZhangApi.changeCycleSelected(
                id = id
            )
        }, {
            onSaveSuccess()
        }, {
            it.message.showToast()
        }, isShowDialog = true)
    }

    fun delBill(id: Int, onSaveSuccess: () -> Unit) {
        launchOnlyResult({
            JiZhangApi.deleteCycle(id = id)
        }, {
            onSaveSuccess()
        }, {
            it.message.showToast()
        }, isShowDialog = true, handleError = false)
    }


    fun saveCycle(id: Int = 0, onSaveSuccess: (cycle: Cycle?) -> Unit) {
        val physicalsLiveData = _physicalsLiveData.value ?: return
        val physicalStatusList: MutableList<String> = mutableListOf()
        physicalsLiveData.physicals.forEach {
            it.items.forEach { sItem ->
                if (sItem.isChecked) {
                    physicalStatusList.add(sItem.id.toString())
                }
            }
        }
        if (physicalsLiveData.hospital == null || physicalsLiveData.hospital.id == 0) {
            return "请选择医院！".showToast()
        }
        if (physicalStatusList.isEmpty()) {
            return "请设置身体状况！".showToast()
        }
        launchOnlyResult({
            JiZhangApi.saveCycle(
                id = id,
                physical_status = physicalStatusList.joinToString(","),
                hospital_id = physicalsLiveData.hospital.id
            )
        }, {
            onSaveSuccess(it.cycle)
        }, {
            it.message.showToast()
        }, isShowDialog = true)
    }

    fun setHospitalId(hospital: Hospital) {
        val physicalsLiveData = _physicalsLiveData.value ?: return
        _physicalsLiveData.value = physicalsLiveData.copy(hospital = hospital)
    }

    fun getBodySateList(cycleId: Int = 0) {
        launchOnlyResult({
            if (cycleId == 0) {
                JiZhangApi.getPhysicalStatus()
            } else {
                JiZhangApi.getCycleDetail(cycleId)
            }
        }, {
            _physicalsLiveData.postValue(it)
        }, {
            _physicalsLiveData.postValue(null)
            it.message.showToast()
        }, isShowDialog = false, handleError = false)
    }
}