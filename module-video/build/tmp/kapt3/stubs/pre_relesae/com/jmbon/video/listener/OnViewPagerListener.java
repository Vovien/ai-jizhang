package com.jmbon.video.listener;

import java.lang.System;

/**
 * View滑动监听
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a8\u0006\r"}, d2 = {"Lcom/jmbon/video/listener/OnViewPagerListener;", "", "onInitComplete", "", "onPageRelease", "isNext", "", "position", "", "view", "Landroid/view/View;", "onPageSelected", "bottom", "module-video_pre_relesae"})
public abstract interface OnViewPagerListener {
    
    /**
     * 初始化完成
     */
    public abstract void onInitComplete();
    
    /**
     * 页面不可见, 释放
     * @param isNext 是否有下一个
     * @param position 下标
     */
    public abstract void onPageRelease(boolean isNext, int position, @org.jetbrains.annotations.Nullable()
    android.view.View view);
    
    /**
     * 选中的index
     * @param position 下标
     * @param bottom 是否到底部
     */
    public abstract void onPageSelected(int position, boolean bottom, @org.jetbrains.annotations.Nullable()
    android.view.View view);
}