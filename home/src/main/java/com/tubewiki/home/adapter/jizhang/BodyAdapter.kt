package com.tubewiki.home.adapter.jizhang

import com.apkdv.mvvmfast.ktx.DataBindingQuickAdapter
import com.tubewiki.home.bean.jizhang.Item
import com.tubewiki.home.databinding.ItemLabelBodyBinding

class BodyAdapter : DataBindingQuickAdapter<Item, ItemLabelBodyBinding>() {

    override fun convert(
        holder: AutomaticDataBindingHolder<ItemLabelBodyBinding>,
        item: Item
    ) {
        holder.dataBinding?.apply {
            this.item = item
            this.executePendingBindings()
        }
    }
}