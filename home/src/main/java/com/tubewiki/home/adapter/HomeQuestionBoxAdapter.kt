package com.tubewiki.home.adapter

import com.apkdv.mvvmfast.ktx.BindingQuickAdapter
import com.jmbon.middleware.bean.VideoDetail
import com.jmbon.middleware.utils.*
import com.tubewiki.home.bean.HomeBean
import com.tubewiki.home.databinding.ItemHomeQuestionBoxLayoutBinding

class HomeQuestionBoxAdapter :
    BindingQuickAdapter<HomeBean.Topic, ItemHomeQuestionBoxLayoutBinding>() {

    override fun convert(holder: BaseBindingHolder, item: HomeBean.Topic) {
        holder.getViewBinding<ItemHomeQuestionBoxLayoutBinding>().apply {
            ivCover.loadCircle(item.icon)
            tvTitle.text = item.iconName

        }
    }
}