package com.tubewiki.home.bean

import android.os.Parcelable
import androidx.annotation.Keep
import com.chad.library.adapter.base.entity.MultiItemEntity
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
data class ItemExperienceBean(
    val id: Int = 0,
    val title: String = "",
    val content: String = "",
    val cover_width: Int = 0,
    val cover_height: Int = 0,
    val cover: String = "",
    val views: Int = 0,
    val user: User = User(),
    val common_tags: List<String>? = listOf(),
    val hospital_name: String = "",
    val cost: Int = 0,
    val type: String = ""
) : Parcelable

@Keep
@Parcelize
data class User(
    val uid: Int = 0,
    val user_name: String = "",
    val avatar_file: String = ""
) : Parcelable