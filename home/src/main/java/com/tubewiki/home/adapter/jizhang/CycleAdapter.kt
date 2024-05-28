package com.tubewiki.home.adapter.jizhang

import com.apkdv.mvvmfast.ktx.DataBindingQuickAdapter
import com.tubewiki.home.R
import com.tubewiki.home.bean.jizhang.Cycle
import com.tubewiki.home.databinding.ItemCycleBinding

class CycleAdapter : DataBindingQuickAdapter<Cycle, ItemCycleBinding>() {

    init {
        addChildClickViewIds(R.id.iv_bg)
        addChildClickViewIds(R.id.tv_content)
    }

    override fun convert(
        holder: AutomaticDataBindingHolder<ItemCycleBinding>,
        item: Cycle
    ) {
        holder.dataBinding?.apply {
            this.cycle = item
            this.executePendingBindings()
            tvContent.setLeftString(item.name)
        }
    }
}