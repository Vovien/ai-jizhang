package com.apkdv.mvvmfast.glide

/**
 * 进度监听器管理类
 * 加入图片加载进度监听，加入Https支持
 */
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.target.Target

/**
 * 进度更新回调
 */
abstract class GlideProgressListener<T> {
    // 进度更新百分比精度
    open fun getGranularityPercentages(): Float = 1.0f

    // 进度更新回调
    abstract fun onProgress(current: Long, total: Long, percent: Float)

    open fun onSuccess(
        resource: T?,
        model: Any?,
        target: Target<T>?,
        dataSource: DataSource?,
        isFirstResource: Boolean
    ) {
    }

    open fun onFailed(
        e: GlideException?,
        model: Any?,
        target: Target<T>?,
        isFirstResource: Boolean
    ) {
    }
}