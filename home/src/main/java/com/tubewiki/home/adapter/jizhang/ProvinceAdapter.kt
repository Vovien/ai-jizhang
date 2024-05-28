package com.tubewiki.home.adapter.jizhang

import android.graphics.Typeface
import com.apkdv.mvvmfast.ktx.DataBindingQuickAdapter
import com.apkdv.mvvmfast.ktx.setTextStyle
import com.tubewiki.home.bean.jizhang.Item
import com.tubewiki.home.bean.jizhang.Province
import com.tubewiki.home.databinding.ItemLabelBodyBinding
import com.tubewiki.home.databinding.ItemProvinceBodyBinding

class ProvinceAdapter : DataBindingQuickAdapter<Province, ItemProvinceBodyBinding>() {

    override fun convert(
        holder: AutomaticDataBindingHolder<ItemProvinceBodyBinding>,
        item: Province
    ) {
        holder.dataBinding?.apply {
            this.province = item
            tvContent.setTextStyle(if (item.isChecked) Typeface.BOLD else Typeface.NORMAL)
            this.executePendingBindings()
        }
    }
}