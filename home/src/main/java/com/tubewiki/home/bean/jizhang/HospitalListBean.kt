package com.tubewiki.home.bean.jizhang

import android.os.Parcelable

import kotlinx.parcelize.Parcelize

import androidx.annotation.Keep

import com.google.gson.annotations.SerializedName


@Keep
@Parcelize
data class HospitalListBean(
    @SerializedName("hospitals")
    val hospitals: MutableList<Hospital> = mutableListOf(),
    @SerializedName("location_hospitals")
    val locationHospitals: List<String> = listOf(),
    @SerializedName("page_count")
    val pageCount: Int = 0,
    @SerializedName("total")
    val total: Int = 0
) : Parcelable

@Keep
@Parcelize
data class Hospital(
    @SerializedName("hospital_name")
    val hospitalName: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("province_id")
    val provinceId: Int = 0,
    var isChecked: Boolean = false
) : Parcelable