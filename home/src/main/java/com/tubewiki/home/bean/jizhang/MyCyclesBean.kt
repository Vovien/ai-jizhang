package com.tubewiki.home.bean.jizhang

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Keep
@Parcelize
data class MyCyclesBean(
    @SerializedName("cycles")
    val cycles: MutableList<Cycle>? = mutableListOf()
) : Parcelable

@Keep
@Parcelize
data class Cycle(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("is_selected")
    var isSelected: Int = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("uid")
    val uid: Int = 0
) : Parcelable