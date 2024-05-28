package com.tubewiki.home.bean

import android.os.Parcelable

import kotlinx.parcelize.Parcelize

import androidx.annotation.Keep

import com.google.gson.annotations.SerializedName
import com.jmbon.middleware.bean.HelpGroupItemBean


/**
 * 好孕求助数据
 * @author MilkCoder
 * @date 2023/9/11
 * @version 6.2.1
 * @copyright All copyrights reserved to ManTang.
 */
@Keep
@Parcelize
data class HelperGroupItemBean(
    @SerializedName("code")
    val code: Int = 0,
    val data: List<HelpGroupItemBean> = listOf(),
    @SerializedName("msg")
    val msg: String = ""
) : Parcelable
