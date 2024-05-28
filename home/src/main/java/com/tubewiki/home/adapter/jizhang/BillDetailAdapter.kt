package com.tubewiki.home.adapter.jizhang

import androidx.recyclerview.widget.RecyclerView
import com.apkdv.mvvmfast.glide.GlideUtil
import com.apkdv.mvvmfast.ktx.BindingQuickAdapter
import com.jmbon.middleware.utils.DateFormatUtil
import com.tubewiki.home.R
import com.tubewiki.home.bean.jizhang.Bills
import com.tubewiki.home.databinding.ItemBillDetailLayoutBinding
import com.tubewiki.home.router.HomeRouter
import java.text.DecimalFormat

class BillDetailAdapter :
    BindingQuickAdapter<Bills, ItemBillDetailLayoutBinding>() {
    override fun convert(holder: BaseBindingHolder, item: Bills) {
        holder.getViewBinding<ItemBillDetailLayoutBinding>().apply {
            GlideUtil.getInstance().loadCircleImg(
                ivBg,
                when (item.type) {
                    1 -> R.drawable.icon_check_selected
                    2 -> R.drawable.icon_medicine_selected
                    3 -> R.drawable.icon_embryo_selected
                    4 -> R.drawable.icon_other_selected
                    else -> R.drawable.icon_other_selected
                },
                com.jmbon.middleware.R.drawable.icon_topic_placeholder
            )
            tvTitle.text = item.title
            tvDate.text = DateFormatUtil.getStringByFormat(
                item.time * 1000L,
                DateFormatUtil.dateFormatYMD
            )
            val decimalFormat = DecimalFormat("0.00")

            tvCost.text = " ${decimalFormat.format(item.cost)}"
        }
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        setOnItemClickListener { _, _, position ->
            HomeRouter.toJiZhangPage(data[position].id)
        }
    }
}