package com.tubewiki.home.adapter.jizhang

import android.graphics.Typeface
import com.apkdv.mvvmfast.ktx.DataBindingQuickAdapter
import com.apkdv.mvvmfast.ktx.setTextStyle
import com.tubewiki.home.bean.jizhang.Hospital
import com.tubewiki.home.bean.jizhang.Item
import com.tubewiki.home.bean.jizhang.Province
import com.tubewiki.home.databinding.ItemHospitalBinding
import com.tubewiki.home.databinding.ItemLabelBodyBinding
import com.tubewiki.home.databinding.ItemProvinceBodyBinding

class HospitalAdapter : DataBindingQuickAdapter<Hospital, ItemHospitalBinding>() {

    override fun convert(
        holder: AutomaticDataBindingHolder<ItemHospitalBinding>,
        item: Hospital
    ) {
        holder.dataBinding?.apply {
            this.hospital = item
            tvContent.setTextStyle(if (item.isChecked) Typeface.BOLD else Typeface.NORMAL)
            this.executePendingBindings()
        }
    }
}