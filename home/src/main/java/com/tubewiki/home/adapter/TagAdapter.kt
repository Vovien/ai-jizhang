package com.tubewiki.home.adapter

import android.graphics.Typeface
import android.widget.TextView
import com.apkdv.mvvmfast.ktx.setTextStyle
import com.blankj.utilcode.util.ColorUtils
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.jmbon.middleware.extention.setStateBackground
import com.jmbon.middleware.extention.setTextColor
import com.jmbon.middleware.extention.toColorInt
import com.jmbon.middleware.utils.dp
import com.tubewiki.home.R
import com.tubewiki.home.bean.TagBean

class TagAdapter : BaseQuickAdapter<TagBean, BaseViewHolder>(R.layout.item_category_tag_layout) {

    override fun convert(holder: BaseViewHolder, item: TagBean) {
        holder.setText(R.id.tv_tag, item.name)
        holder.getView<TextView>(R.id.tv_tag).isSelected = item.isSelected
        holder.getView<TextView>(R.id.tv_tag).apply {
            isSelected = item.isSelected
            setStateBackground(
                state = android.R.attr.state_selected,
                falseBackgroundColor = R.color.color_F1F1F1.toColorInt(),
                trueBackgroundColor = ColorUtils.setAlphaComponent(
                    R.color.color_currency.toColorInt(),
                    0.1f
                ),
                radius = 8.dp
            )
            setTextColor(
                state = android.R.attr.state_selected,
                falseTextColor = R.color.color_7F7F7F.toColorInt(),
                trueTextColor = R.color.color_currency.toColorInt()
            )

            setTextStyle(if (isSelected) Typeface.BOLD else Typeface.NORMAL)
        }
    }
}