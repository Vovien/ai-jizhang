package com.jmbon.video.widget;

import java.lang.System;

/**
 * @author MilkCoder
 * @date 2023/9/27
 * @version 6.2.1
 * @copyright All copyrights reserved to ManTang.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/jmbon/video/widget/VerticalViewFlipper;", "Landroid/widget/ViewFlipper;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mData", "Ljava/util/ArrayList;", "Lcom/jmbon/middleware/bean/VideoAdv;", "getMData", "()Ljava/util/ArrayList;", "setMData", "(Ljava/util/ArrayList;)V", "getCurrentData", "setData", "", "data", "", "startFlipping", "stopFlipping", "module-video_debug"})
public final class VerticalViewFlipper extends android.widget.ViewFlipper {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.jmbon.middleware.bean.VideoAdv> mData;
    
    @kotlin.jvm.JvmOverloads()
    public VerticalViewFlipper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public VerticalViewFlipper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.jmbon.middleware.bean.VideoAdv> getMData() {
        return null;
    }
    
    public final void setMData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.jmbon.middleware.bean.VideoAdv> p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jmbon.middleware.bean.VideoAdv> data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.jmbon.middleware.bean.VideoAdv getCurrentData() {
        return null;
    }
    
    @java.lang.Override()
    public void startFlipping() {
    }
    
    @java.lang.Override()
    public void stopFlipping() {
    }
}