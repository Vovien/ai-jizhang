package com.tubewiki.home.adapter.jizhang

import com.apkdv.mvvmfast.ktx.DataBindingQuickAdapter
import com.jmbon.middleware.decoration.SpaceItemDecoration
import com.tubewiki.home.bean.jizhang.Physical
import com.tubewiki.home.databinding.ItemBodyStateBinding

/**
 * 身体状态适配器
 * @author MilkCoder
 * @date 2023/11/17
 * @copyright All copyrights reserved to ManTang.
 */
class BodySateAdapter : DataBindingQuickAdapter<Physical, ItemBodyStateBinding>() {

    override fun convert(holder: AutomaticDataBindingHolder<ItemBodyStateBinding>, item: Physical) {
        holder.dataBinding?.apply {
            this.physical = item
            val bodyAdapter = BodyAdapter()
            rvReason.adapter = bodyAdapter
            rvReason.addItemDecoration(SpaceItemDecoration(4, 8))
            bodyAdapter.setNewInstance(item.items)
            bodyAdapter.setOnItemClickListener { _, _, position ->
                val data = bodyAdapter.data[position]
                data.isChecked = !data.isChecked
                bodyAdapter.notifyItemChanged(position)
            }
            this.executePendingBindings()
        }
    }
}