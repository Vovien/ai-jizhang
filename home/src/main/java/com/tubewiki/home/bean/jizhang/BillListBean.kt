package com.tubewiki.home.bean.jizhang

import android.os.Parcelable

import kotlinx.parcelize.Parcelize

import androidx.annotation.Keep

import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.IgnoredOnParcel
import java.text.DecimalFormat

val decimalFormat = DecimalFormat("0.00")

@Keep
@Parcelize
data class BillListBean(
    @SerializedName("bills")
    val bills: MutableList<Bills> = mutableListOf(),
    @SerializedName("page")
    val page: String = "",
    @SerializedName("page_count")
    val pageCount: Int = 0,
    @SerializedName("statistics")
    val statistics: Statistics = Statistics(),
    @SerializedName("total")
    val total: Int = 0,
    @SerializedName("total_cost")
    val totalCost: Double = 0.0
) : Parcelable {

    val costStr: String
        get() = " ${decimalFormat.format(totalCost)}"

    val isEmptyBill: Boolean
        get() = bills.isEmpty()
}

@Parcelize
data class Bills(
    @SerializedName("cost")
    val cost: Double = 0.0,
    @SerializedName("create_time")
    val createTime: Int = 0,
    @SerializedName("cycle_id")
    val cycleId: Int = 0,
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("time")
    val time: Int = 0,
    @SerializedName("title")
    val title: String = "",
    @SerializedName("type")
    val type: Int = 0,
    @SerializedName("uid")
    val uid: Int = 0
) : Parcelable

@Parcelize
data class Statistics(
    @SerializedName("check")
    val check: Check = Check(),
    @SerializedName("embryo")
    val embryo: Embryo = Embryo(),
    @SerializedName("medicine")
    val medicine: Medicine = Medicine(),
    @SerializedName("other")
    val other: Other = Other()
) : Parcelable

@Parcelize
data class Check(
    @SerializedName("cost")
    val cost: Double = 0.0,
    @SerializedName("percentage")
    val percentage: String = "",
    @SerializedName("title")
    val title: String = "检查",
    @SerializedName("image")
    val image: String = ""
) : Parcelable {
    val costStr: String
        get() = " ${decimalFormat.format(cost)}"
}

@Parcelize
data class Embryo(
    @SerializedName("cost")
    val cost: Double = 0.0,
    @SerializedName("percentage")
    val percentage: String = "",
    @SerializedName("title")
    val title: String = "胚胎",
    @SerializedName("image")
    val image: String = ""
) : Parcelable {
    val costStr: String
        get() = " ${decimalFormat.format(cost)}"
}

@Parcelize
data class Medicine(
    @SerializedName("cost")
    val cost: Double = 0.0,
    @SerializedName("percentage")
    val percentage: String = "",
    @SerializedName("title")
    val title: String = "用药",
    @SerializedName("image")
    val image: String = ""
) : Parcelable {
    val costStr: String
        get() = " ${decimalFormat.format(cost)}"
}

@Parcelize
data class Other(
    @SerializedName("cost")
    val cost: Double = 0.0,
    @SerializedName("percentage")
    val percentage: String = "",
    @SerializedName("title")
    val title: String = "其他",
    @SerializedName("image")
    val image: String = ""
) : Parcelable {
    val costStr: String
        get() = " ${decimalFormat.format(cost)}"
}