package com.tubewiki.home.bean


import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import com.jmbon.middleware.bean.TubeArticleDetail
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
data class HomeBean(
    @SerializedName("guideList")
    var guideList: MutableList<Guide> = mutableListOf(),
    @SerializedName("oneLetter")
    var oneLetter: OneLetter = OneLetter(),
    @SerializedName("recommendList")
    var recommendList: MutableList<TubeArticleDetail> = mutableListOf(),
    @SerializedName("topicList")
    var topicList: MutableList<Topic> = mutableListOf(),
    @SerializedName("tubeList")
    var tubeList: MutableList<Tube> = mutableListOf(),
    @SerializedName("helperGroupList")
    var helperGroupList: HelperGroupTypeBean? = null,
    @SerializedName("runningHelpers")
    val groupList: List<HomeGroupItemBean>? = null
) : Parcelable {
    @Keep
    @Parcelize
    data class Guide(
        @SerializedName("articleNum")
        var articleNum: Int = 0,
        @SerializedName("articles")
        var articles: MutableList<TubeArticleDetail> = mutableListOf(),
        @SerializedName("guideDescription")
        var guideDescription: MutableList<String> = mutableListOf(),
        @SerializedName("cover")
        var cover: String = "",
        @SerializedName("customDescription")
        var customDescription: String = "",
        @SerializedName("customTitle")
        var customTitle: String = "",
        @SerializedName("description")
        var description: String = "",
        @SerializedName("icon")
        var icon: String = "",
        @SerializedName("id")
        var id: Int = 0,
        @SerializedName("indexCover")
        var indexCover: String = "",
        @SerializedName("topicName")
        var topicName: String = ""
    ) : Parcelable

    @Keep
    @Parcelize
    data class OneLetter(
        @SerializedName("article_id")
        var articleId: String = "",
        @SerializedName("cover")
        var cover: String = "",
        @SerializedName("content")
        var content: String = "",
        @SerializedName("token")
        var token: String = ""
    ) : Parcelable


    @Keep
    @Parcelize
    data class Topic(
        @SerializedName("articleNum")
        var articleNum: Int = 0,
        @SerializedName("cover")
        var cover: String = "",
        @SerializedName("customDescription")
        var customDescription: String = "",
        @SerializedName("customTitle")
        var customTitle: String = "",
        @SerializedName("description")
        var description: String = "",
        @SerializedName("icon")
        var icon: String = "",
        @SerializedName("id")
        var id: Int = 0,
        @SerializedName("indexCover")
        var indexCover: String = "",
        @SerializedName("iconName")
        var iconName: String = ""
    ) : Parcelable

    @Keep
    @Parcelize
    data class Tube(
        @SerializedName("icon")
        var icon: String = "",
        @SerializedName("id")
        var id: Int = 0,
        @SerializedName("subTitle")
        var subTitle: String = "",
        @SerializedName("title")
        var title: String = ""
    ) : Parcelable

    @Keep
    @Parcelize
    data class HelperGroupTypeBean(
        @SerializedName("title")
        val title: String = "",
        @SerializedName("items")
        val items: List<Item>? = listOf(),
    ) : Parcelable

    @Keep
    @Parcelize
    data class Item(
        @SerializedName("subTitle")
        val subTitle: String = "",
        @SerializedName("type")
        val type: Int = 0
    ) : Parcelable

    @Keep
    @Parcelize
    data class HomeGroupItemBean(
        val name: String = "",
        val txt: String = "",
        val cover: String = "",
        val item_type: String = "",
        val identity: String = ""
    ) : Parcelable
}