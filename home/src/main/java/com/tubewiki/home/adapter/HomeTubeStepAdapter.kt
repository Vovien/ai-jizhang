package com.tubewiki.home.adapter

import com.apkdv.mvvmfast.glide.GlideUtil
import com.apkdv.mvvmfast.ktx.BindingQuickAdapter
import com.jmbon.middleware.utils.loadCircle
import com.tubewiki.home.R
import com.tubewiki.home.bean.HomeBean
import com.tubewiki.home.databinding.ItemHomeTubeStepLayoutBinding

class HomeTubeStepAdapter :
    BindingQuickAdapter<HomeBean.Tube, ItemHomeTubeStepLayoutBinding>() {

    override fun convert(holder: BaseBindingHolder, item: HomeBean.Tube) {
        holder.getViewBinding<ItemHomeTubeStepLayoutBinding>().apply {

            var posIcon = 0
            when (holder.adapterPosition) {
                0 -> posIcon = R.drawable.icon_tube_pos1
                1 -> posIcon = R.drawable.icon_tube_pos2
                2 -> posIcon = R.drawable.icon_tube_pos3
                3 -> posIcon = R.drawable.icon_tube_pos4
                4 -> posIcon = R.drawable.icon_tube_pos5
                5 -> posIcon = R.drawable.icon_tube_pos6
                else -> {
                    posIcon = R.drawable.icon_tube_placeholder
                }
            }

            ivCover.loadCircle(
                item.icon,
                R.drawable.icon_tube_placeholder
            )
            GlideUtil.getInstance().loadUrl(ivBg, posIcon)

            tvTitle.text = item.title
            tvDesc.text = item.subTitle

        }
    }
}