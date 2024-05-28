package com.tubewiki.home.bean

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
data class HomeHeaderBean(
    @SerializedName("navs")
    val topic_list: List<TopicCategoryBean>? = listOf(),
) : Parcelable

@Keep
@Parcelize
data class Bank(
    val topic_id: Int = 0,
    val icon: String = "",
    val en_name: String = "",
    val zh_name: String = ""
) : Parcelable

@Keep
@Parcelize
data class TopicCategoryBean(
    val icon: String = "",
    val name: String = "",
    @SerializedName("item_type")
    val itemType: String = "",
    @SerializedName("identity")
    val identity:String = "",
    val topic_id: Int = 0
) : Parcelable