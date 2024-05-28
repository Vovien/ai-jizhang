package com.tubewiki.home.bean.jizhang
import android.os.Parcelable

import kotlinx.parcelize.Parcelize

import androidx.annotation.Keep

import com.google.gson.annotations.SerializedName


/**
 *
 * @author MilkCoder
 * @date 2023/11/21
 * @copyright All copyrights reserved to ManTang.
 */
@Keep
@Parcelize
data class CategoryBillBean(
    @SerializedName("list")
    val list: MutableList<Bills> = mutableListOf(),
    @SerializedName("page")
    val page: Int = 0,
    @SerializedName("page_size")
    val pageSize: Int = 0,
    @SerializedName("total_count")
    val totalCount: Int = 0,
    @SerializedName("total_page")
    val totalPage: Int = 0
) : Parcelable
