package com.tubewiki.home.bean.jizhang

import android.os.Parcelable

import kotlinx.parcelize.Parcelize

import androidx.annotation.Keep

import com.google.gson.annotations.SerializedName
import com.tubewiki.home.R


@Keep
@Parcelize
data class PhysicalStatusBean(
    @SerializedName("physicals")
    val physicals: MutableList<Physical> = mutableListOf(),
    @SerializedName("hospital")
    val hospital: Hospital? = null
) : Parcelable

@Keep
@Parcelize
data class Physical(
    @SerializedName("items")
    val items: MutableList<Item> = mutableListOf(),
    @SerializedName("title")
    val title: String = ""
) : Parcelable

@Keep
@Parcelize
data class Item(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("is_checked")
    var isChecked: Boolean = false,
    @SerializedName("name")
    val name: String = ""
) : Parcelable {
    val textBg: Int
        get() = if (isChecked) R.drawable.bg_body_unselected else R.drawable.bg_body_selected
}