package com.tubewiki.home.viewmodel

import android.Manifest
import android.content.Context
import android.location.Location
import android.os.Bundle
import android.view.KeyEvent
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.apkdv.mvvmfast.ktx.showToast
import com.apkdv.mvvmfast.utils.getString
import com.apkdv.mvvmfast.utils.saveToMMKV
import com.blankj.utilcode.util.GsonUtils
import com.jmbon.middleware.common.CommonViewModel
import com.jmbon.middleware.config.MMKVKey.PROVINCE_LOCATION
import com.jmbon.middleware.location.DLocationTools
import com.jmbon.middleware.location.DLocationUtils
import com.jmbon.middleware.location.DLocationWhat
import com.jmbon.middleware.location.OnLocationChangeListener
import com.jmbon.middleware.utils.PermissionUtils
import com.tubewiki.home.api.JiZhangApi
import com.tubewiki.home.bean.jizhang.HospitalListBean
import com.tubewiki.home.bean.jizhang.Province
import com.tubewiki.home.bean.jizhang.ProvinceListBean
import kotlinx.coroutines.flow.MutableStateFlow


class ChooseHospitalViewModel : CommonViewModel() {

    private val _cuProvinceFlow = MutableStateFlow(Province())
    val cuProvinceFlow = _cuProvinceFlow

    private val _provinceLiveData = MutableLiveData<ProvinceListBean?>()
    val provinceLiveData: LiveData<ProvinceListBean?> = _provinceLiveData

    private val _hospitalListLiveData = MutableLiveData<HospitalListBean?>()
    val hospitalListLiveData: LiveData<HospitalListBean?> = _hospitalListLiveData

    fun setShowTip(isShow: Boolean) {
        val province = _cuProvinceFlow.value
        if (province.id == 0) {
            _cuProvinceFlow.value = province.copy(showTip = isShow)
        }
    }

    /**
     * 通过省份获取医院
     * @date 2023/11/20 10:02
     * @param id 身份Id
     */
    fun getHospitalByProvince(id: Int) {
        launchOnlyResult({
            JiZhangApi.getHospitalByProvince(id)
        }, {
            _hospitalListLiveData.postValue(it)
        }, {
            _hospitalListLiveData.postValue(null)
            it.message.showToast()
        }, isShowDialog = false)
    }

    /**
     * 通过省份获取医院
     * @date 2023/11/20 10:02
     * @param id 身份Id
     */
    fun getHospitalByProvince1(id: Int) {
        launchOnlyResult({
            JiZhangApi.getHospitalByProvince(id, currentPage)
        }, {
            _hospitalListLiveData.postValue(it)
        }, {
            _hospitalListLiveData.postValue(null)
            it.message.showToast()
        }, isShowDialog = false)

    }

    /**
     * 获取全部身份
     * @date 2023/11/20 10:02
     */
    fun getAllProvince(provinceId: Int = 0) {
        launchOnlyResult({
            JiZhangApi.getAllProvince()
        }, {
            val locationInfo = PROVINCE_LOCATION.getString()
            if (!locationInfo.isNullOrBlank()) {
                GsonUtils.getGson().fromJson(locationInfo, Province::class.java)
                    ?.let { province ->
                        _cuProvinceFlow.value = province
                        if (provinceId == 0) {
                            it.provinces.add(
                                0,
                                Province(name = "当前", isChecked = true, id = province.id)
                            )
                        } else {
                            it.provinces.add(
                                0,
                                Province(name = "当前", isChecked = false, id = province.id)
                            )
                            it.provinces.forEach { p ->
                                if (p.id == provinceId) {
                                    p.isChecked = true
                                }
                            }
                        }
                        _provinceLiveData.postValue(it)
                    }
            } else {
                if (provinceId == 0) {
                    it.provinces.add(0, Province(name = "当前", isChecked = true))
                } else {
                    it.provinces.add(0, Province(name = "当前", isChecked = false))
                    it.provinces.forEach { p ->
                        if (p.id == provinceId) {
                            p.isChecked = true
                        }
                    }
                }
                _provinceLiveData.postValue(it)
            }
        }, {
            _provinceLiveData.postValue(null)
            it.message.showToast()
        }, isShowDialog = false)
    }

    fun getLocation(
        context: Context,
        onCityChangeListener: (city: String, latitude: Double, longitude: Double) -> Unit,
        onDisEnabledGPS: () -> Unit = {}
    ) {

        val arrayList: java.util.ArrayList<String> = java.util.ArrayList()
        arrayList.add(Manifest.permission.ACCESS_COARSE_LOCATION)
        arrayList.add(Manifest.permission.ACCESS_FINE_LOCATION)
        PermissionUtils.doNeedPermissionAction2(
            context, arrayList, {
                //开始定位
                getGpsLocation(context, onCityChangeListener, onDisEnabledGPS)
            }, {
                onDisEnabledGPS()
            }, "位置",
            "定位", false
        )
    }

    private fun getGpsLocation(
        context: Context,
        onCityChangeListener: (city: String, latitude: Double, longitude: Double) -> Unit,
        onDisEnabledGPS: () -> Unit = {}
    ) {
        DLocationUtils.init(context)
        val state = DLocationUtils.getInstance().register(object : OnLocationChangeListener {
            override fun getLastKnownLocation(location: Location?) {
                location?.let {
                    val city = DLocationTools.getLocalProvince(
                        context,
                        location.latitude,
                        location.longitude
                    )
                    val province =
                        _provinceLiveData.value?.provinces?.find { city.contains(it.name) }
                    if (province != null) {
                        GsonUtils.getGson().toJson(province.copy(showTip = false))
                            .saveToMMKV(PROVINCE_LOCATION)
                        _cuProvinceFlow.value = province.copy(showTip = false)
                        val newProvinceLiveData = _provinceLiveData.value
                        if (newProvinceLiveData != null) {
                            val provinces = newProvinceLiveData.provinces.toMutableList()
                            provinces.mapIndexed { index, _province ->
                                if (index == 0) {
                                    _province.id = province.id
                                }
                            }
                            _provinceLiveData.postValue(newProvinceLiveData)
                        }

                    }
                    onCityChangeListener(city, location.latitude, location.longitude)
                }
            }

            override fun onLocationChanged(location: Location?) {
                location?.let {

                }

            }

            override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {
            }

        })
        if (state == DLocationWhat.NO_PROVIDER || state == DLocationWhat.NO_LOCATIONMANAGER) {
            "请打开系统定位功能".showToast()
            onDisEnabledGPS()
        }
    }
}