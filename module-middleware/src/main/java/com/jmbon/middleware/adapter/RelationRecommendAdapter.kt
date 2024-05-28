package com.jmbon.middleware.adapter

import com.jmbon.middleware.bean.TubeArticleDetail
import com.jmbon.middleware.bean.event.CircleChangedEvent
import com.jmbon.middleware.databinding.ItemRelatedToRecommendBinding
import com.jmbon.middleware.utils.*

/**
 * @author : leimg
 * time   : 2021/4/13
 * desc   :
 * version: 1.0
 */
class RelationRecommendAdapter :
    EventAdapter<CircleChangedEvent, TubeArticleDetail.Circle, ItemRelatedToRecommendBinding>() {

    override fun convert(holder: BaseBindingHolder, item: TubeArticleDetail.Circle) {

        holder.getViewBinding<ItemRelatedToRecommendBinding>()
            .apply {
                title.text = ""


                root.setOnSingleClickListener({

                })
            }
    }

    override fun setEventData(
        it: CircleChangedEvent,
        item: TubeArticleDetail.Circle,
        viewBinding: ItemRelatedToRecommendBinding,
    ) {

    }
}
