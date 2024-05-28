package com.tubewiki.home.bean.jizhang

import android.os.Parcelable

import kotlinx.parcelize.Parcelize

import androidx.annotation.Keep

import com.google.gson.annotations.SerializedName
import com.tubewiki.home.R


@Keep
@Parcelize
data class ProvinceListBean(
    @SerializedName("provinces")
    val provinces: MutableList<Province> = mutableListOf()
) : Parcelable

@Keep
@Parcelize
data class Province(
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("name")
    var name: String = "",
    var isChecked: Boolean = false,
    var showTip: Boolean = true
) : Parcelable {

    val cityName: String
        get() = name.ifEmpty { "当前未定位" }

    val locationName: String
        get() = if (id == 0) "点击定位" else "重新定位"

    val textBg: Int
        get() = if (isChecked) R.drawable.bg_province_selected else R.drawable.bg_province_unselected
}