package com.tubewiki.home.adapter

import androidx.recyclerview.widget.RecyclerView
import com.apkdv.mvvmfast.ktx.DataBindingQuickAdapter
import com.jmbon.middleware.bean.CommonBanner
import com.jmbon.middleware.utils.BannerHelper
import com.jmbon.middleware.utils.dp
import com.jmbon.middleware.utils.loadRadius
import com.tubewiki.home.bean.HomeBean
import com.tubewiki.home.databinding.ItemHomeHelpGruopLayoutBinding

class HomeHelpGroupAdapter :
    DataBindingQuickAdapter<HomeBean.HomeGroupItemBean, ItemHomeHelpGruopLayoutBinding>() {
    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        setOnItemClickListener { _, _, position ->
            data[position].apply {
                BannerHelper.onClick(CommonBanner(item_type = item_type, identity = identity))
            }
        }
    }

    override fun convert(
        holder: AutomaticDataBindingHolder<ItemHomeHelpGruopLayoutBinding>,
        item: HomeBean.HomeGroupItemBean
    ) {
        holder.dataBinding?.apply {
            ivIcon.loadRadius(item.cover, radius = 11.dp)
            tvTitle.text = item.name
            tvOnlineCount.text = item.txt
        }
    }
}