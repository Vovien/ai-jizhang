package com.tubewiki.home.bean

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
data class TagBean(
    val id: Int = 0,
    val name: String = "",
    var isSelected: Boolean = false
) : Parcelable