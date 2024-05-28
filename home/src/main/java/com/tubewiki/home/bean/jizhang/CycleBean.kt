package com.tubewiki.home.bean.jizhang

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
data class CycleBean(
    @SerializedName("cycle")
    val cycle: Cycle? = null
): Parcelable
