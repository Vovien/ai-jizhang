package com.tubewiki.home.adapter

import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.apkdv.mvvmfast.glide.GlideUtil
import com.apkdv.mvvmfast.ktx.BindingQuickAdapter
import com.blankj.utilcode.util.ScreenUtils
import com.google.android.flexbox.FlexboxLayout
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.ShapeAppearanceModel
import com.jmbon.middleware.extention.loadUrlWithSize
import com.jmbon.middleware.utils.dp
import com.jmbon.middleware.utils.initTagLayout
import com.tubewiki.home.R
import com.tubewiki.home.bean.ItemExperienceBean
import com.tubewiki.home.databinding.ItemExperienceLayoutBinding

/**
 * 经验适配器
 * @author MilkCoder
 * @date 2023/11/23
 * @copyright All copyrights reserved to ManTang.
 */
class ExperienceAdapter : BindingQuickAdapter<ItemExperienceBean, ItemExperienceLayoutBinding>() {
    private val radius = 12.dp
    private val iconWidth = (ScreenUtils.getScreenWidth() - 48) / 2
    private val constraintSet = ConstraintSet()

    override fun convert(holder: BaseBindingHolder, item: ItemExperienceBean) {
        holder.getViewBinding<ItemExperienceLayoutBinding>().apply {
            holder.getView<FlexboxLayout>(R.id.fl_tag)
                .initTagLayout(item.common_tags)
            holder.setText(R.id.tv_title, item.title)

            holder.setText(R.id.tv_hospital_name, "医院：${item.hospital_name}")
            holder.setGone(
                R.id.tv_hospital_name,
                item.hospital_name.isNullOrBlank()
            )
            item.cost.apply {
                if (this > 0) {
                    holder.setVisible(R.id.gp_cost, true)
                    holder.getView<TextView>(R.id.tv_cost).text = if (this >= 10000) {
                        String.format("%.1f万", this / 10000f)
                    } else {
                        "$this"
                    }
                } else {
                    holder.setGone(R.id.gp_cost, true)
                }
            } ?: kotlin.run {
                holder.setGone(R.id.gp_cost, true)
            }
            holder.setText(R.id.tv_user_name, item?.user?.user_name)

            holder.getView<ShapeableImageView>(R.id.iv_header).apply {
                val iconHeight = if ((item.cover_width ?: 0) > 0 && (item.cover_height ?: 0) > 0) {
                    constraintSet.clone(holder.itemView as ConstraintLayout)
                    constraintSet.setDimensionRatio(
                        id,
                        "${item.cover_width}:${item.cover_height}"
                    )
                    constraintSet.applyTo(holder.itemView as ConstraintLayout)
                    iconWidth * item.cover_height.toFloat() / item.cover_width
                } else {
                    constraintSet.clone(holder.itemView as ConstraintLayout)
                    constraintSet.setDimensionRatio(
                        id,
                        "3:4"
                    )
                    constraintSet.applyTo(holder.itemView as ConstraintLayout)
                    iconWidth * 4 / 3f
                }
                loadUrlWithSize(
                    item.cover,
                    width = iconWidth,
                    height = iconHeight.toInt(),
                    topLeftRadius = radius,
                    topRightRadius = radius
                )
            }
            holder.getView<ShapeableImageView>(R.id.iv_user_icon).apply {
                shapeAppearanceModel = ShapeAppearanceModel.Builder().apply {
                    setAllCornerSizes(7.dp.toFloat())
                }.build()
                GlideUtil.getInstance().loadUrl(
                    this,
                    item.user.avatar_file,
                    R.drawable.icon_circle_placeholder
                )
            }
        }
    }
}