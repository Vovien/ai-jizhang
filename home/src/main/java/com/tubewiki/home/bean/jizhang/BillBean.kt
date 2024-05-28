package com.tubewiki.home.bean.jizhang

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Keep
@Parcelize
data class BillBean(
    @SerializedName("bill")
    val bill: Bill = Bill()
) : Parcelable

@Keep
@Parcelize
data class Bill(
    @SerializedName("cost")
    val cost: Double = 0.0,
    var input: String = "",
    @SerializedName("cycle_id")
    val cycleId: Int = 0,
    @SerializedName("date")
    val date: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("time")
    val time: Int = 0,
    @SerializedName("type")
    val type: Int = 0
) : Parcelable