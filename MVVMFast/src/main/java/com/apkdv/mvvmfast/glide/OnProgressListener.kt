package com.apkdv.mvvmfast.glide

/**
 *
 * @author : BaoZhou
 * @date : 2019/6/4 9:25
 */
interface OnProgressListener {
    fun onProgress(isComplete: Boolean, percentage: Int, bytesRead: Long, totalBytes: Long)
}