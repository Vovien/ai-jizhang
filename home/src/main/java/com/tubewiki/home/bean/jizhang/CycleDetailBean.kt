package com.tubewiki.home.bean.jizhang

import android.os.Parcelable

import kotlinx.parcelize.Parcelize

import androidx.annotation.Keep

import com.google.gson.annotations.SerializedName


@Keep
@Parcelize
data class CycleDetailBean(
    @SerializedName("hospital")
    val hospital: Hospital = Hospital(),
    @SerializedName("physicals")
    val physicals: List<Physical> = listOf()
) : Parcelable