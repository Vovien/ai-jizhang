@file:Suppress("unused")

package com.jmbon.middleware.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.apkdv.mvvmfast.glide.GlideUtil
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.ShapeAppearanceModel
import com.jmbon.middleware.R
import java.text.SimpleDateFormat
import java.util.Locale

@BindingAdapter(value = ["visible"])
fun View.bindVisibility(visible: Boolean) {
    isVisible = visible
}

@BindingAdapter(value = ["invisible"])
fun View.bindInVisibility(visible: Boolean) {
    visibility = if (visible) View.VISIBLE else View.INVISIBLE
}

@BindingAdapter(value = ["loadCircle"])
fun ImageView.bindLoadCircle(url: String?) {
    GlideUtil.getInstance().loadCircleImg(
        this,
        url.urlToWep,
        R.drawable.icon_default_login_avatar
    )
}

@BindingAdapter(value = ["loadCircle", "placeholder"])
fun ImageView.bindLoadCircle(url: String?, placeholder: Int = R.drawable.icon_topic_placeholder) {
    GlideUtil.getInstance().loadCircleImg(
        this,
        url.urlToWep,
        placeholder
    )
}

@BindingAdapter(value = ["load"])
fun ImageView.bindLoadUrl(url: String?) {
    if (url.isNullOrEmpty()) {
        return
    }
    GlideUtil.getInstance().loadImgUrl(
        this,
        url.urlToWep, R.drawable.icon_topic_placeholder
    )
}

@BindingAdapter(value = ["load", "placeholder"])
fun ImageView.bindLoadUrl(url: String?, placeholder: Int = R.drawable.icon_topic_placeholder) {
    if (url.isNullOrEmpty()) {
        return
    }
    GlideUtil.getInstance().loadImgUrl(
        this,
        url.urlToWep,
        placeholder
    )
}

@BindingAdapter(value = ["loadUrl", "urlRadius"])
fun ImageView.bindLoadUrlRadius(url: String?, urlRadius: Int) {
    if (url.isNullOrEmpty()) {
        return
    }
    GlideUtil.getInstance()
        .loadUrlRadius(
            this,
            url.urlToWep,
            urlRadius.toFloat().dp(),
            R.drawable.icon_topic_placeholder
        )
}

@BindingAdapter("android:layout_width")
fun View.setLayoutWidth(width: Int) {
    val layoutParams = this.layoutParams
    layoutParams.width = width
    this.layoutParams = layoutParams
}

@BindingAdapter("android:layout_height")
fun View.setLayoutHeight(height: Int) {
    val layoutParams = this.layoutParams
    layoutParams.height = height
    this.layoutParams = layoutParams
}

@BindingAdapter(
    value = ["loadUrl", "urlTopLeftRadius", "urlTopRightRadius", "urlBottomLeftRadius", "urlBottomRightRadius"]
)
fun ShapeableImageView.bindLoadUrlRadius(
    url: String?,
    urlTopLeftRadius: Int = 0,
    urlTopRightRadius: Int = 0,
    urlBottomLeftRadius: Int = 0,
    urlBottomRightRadius: Int = 0
) {
    this.shapeAppearanceModel = ShapeAppearanceModel.Builder().apply {
        setTopLeftCornerSize(urlTopLeftRadius.dp.toFloat())
        setTopRightCornerSize(urlTopRightRadius.dp.toFloat())
        setBottomLeftCornerSize(urlBottomLeftRadius.dp.toFloat())
        setBottomRightCornerSize(urlBottomRightRadius.dp.toFloat())
    }.build()
    GlideUtil.getInstance()
        .loadUrl(this, url, R.drawable.icon_circle_placeholder)
}

@BindingAdapter(
    value = ["loadUrl", "urlTopLeftRadius", "urlTopRightRadius", "urlBottomLeftRadius", "urlBottomRightRadius", "placeholder"]
)
fun ShapeableImageView.bindLoadUrlRadius(
    url: String?,
    urlTopLeftRadius: Int = 0,
    urlTopRightRadius: Int = 0,
    urlBottomLeftRadius: Int = 0,
    urlBottomRightRadius: Int = 0,
    placeholder: Int = R.drawable.icon_circle_placeholder
) {
    this.shapeAppearanceModel = ShapeAppearanceModel.Builder().apply {
        setTopLeftCornerSize(urlTopLeftRadius.dp.toFloat())
        setTopRightCornerSize(urlTopRightRadius.dp.toFloat())
        setBottomLeftCornerSize(urlBottomLeftRadius.dp.toFloat())
        setBottomRightCornerSize(urlBottomRightRadius.dp.toFloat())
    }.build()
    GlideUtil.getInstance()
        .loadUrl(this, url, placeholder)
}

@BindingAdapter(value = ["loadUrl", "urlRadius", "placeholder"])
fun ImageView.bindLoadUrlRadius(
    url: String?,
    urlRadius: Int,
    placeholder: Int = R.drawable.icon_topic_placeholder
) {
    GlideUtil.getInstance()
        .loadUrlRadius(
            this,
            url.urlToWep,
            urlRadius.toFloat().dp(),
            placeholder
        )
}

@BindingAdapter(value = ["setDate", "pattern"])
fun TextView.bindDate(date: Long, pattern: String?) {
    val format = pattern ?: "yyyy年MM月dd日 HH:mm"
    val simpleDateFormat = SimpleDateFormat(format, Locale.getDefault())
    text = simpleDateFormat.format(date * 1000L)

}

@BindingAdapter(value = ["bg"])
fun View.bindBackground(bg: Int) {
    setBackgroundResource(bg)
}

@BindingAdapter(value = ["localScr"])
fun ImageView.bindSrc(localScr: Int) {
    setImageResource(localScr)
}

@Suppress("UNCHECKED_CAST")
@BindingAdapter(value = ["itemList", "itemLayout", "itemClick"], requireAll = false)
fun <T : Any> RecyclerView.setListItems(
    items: List<T>?,
    itemLayoutId: Int?,
    itemClick: ((T) -> Unit)? = null
) {
    if (itemLayoutId == null) return
    val list = items ?: emptyList()
    val adapter = adapter
    if (adapter == null) {
        setAdapter(ListAdapter(list, itemLayoutId, itemClick))
    } else if (adapter is ListAdapter<*>) {
        (adapter as ListAdapter<T>).submitList(list)
    }
}

private class DiffUtil<T>(private val oldList: List<T>, private val newList: List<T>) :
    androidx.recyclerview.widget.DiffUtil.Callback() {

    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] === newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

    fun <VH : RecyclerView.ViewHolder> dispatchUpdatesTo(adapter: RecyclerView.Adapter<VH>) {
        androidx.recyclerview.widget.DiffUtil.calculateDiff(this).dispatchUpdatesTo(adapter)
    }

}

private class ListAdapter<T : Any>(
    list: List<T>,
    private val layoutId: Int,
    private val itemClick: ((T) -> Unit)? = null
) : RecyclerView.Adapter<ViewHolder>() {

    private val list = list.toMutableList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return LayoutInflater.from(parent.context)
            .inflate(layoutId, parent, false).let(::ViewHolder)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        val textView = holder.itemView as TextView
        textView.text = item as? String ?: item.toString()
        if (itemClick != null) {
            textView.setOnClickListener {
                itemClick.invoke(item)
            }
        }
    }

    fun submitList(list: List<T>) {
        val oldList = this.list.toList()
        this.list.clear()
        this.list.addAll(list)
        DiffUtil(oldList, list).dispatchUpdatesTo(this)
    }

}

@BindingAdapter(value = ["itemSpace"])
fun RecyclerView.setSpaceItemDecoration(space: Int) {
    repeat(itemDecorationCount) {
        val itemDecoration = getItemDecorationAt(it)
        if (itemDecoration is SpaceItemDecoration) {
            removeItemDecoration(itemDecoration)
        }
    }
    addItemDecoration(SpaceItemDecoration(space.dp))
}