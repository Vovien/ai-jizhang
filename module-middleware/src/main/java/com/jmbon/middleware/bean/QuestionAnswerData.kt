package com.jmbon.middleware.bean

import android.annotation.SuppressLint
import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

/**
 * 问题列表返回数据
 */
@SuppressLint("ParcelCreator")
@Parcelize
@Keep
data class QuestionAnswerData(
    @SerializedName("question")
    var question: Question = Question(),
    @SerializedName("answer")
    var answer: AnswerBean = AnswerBean(),
) : Parcelable