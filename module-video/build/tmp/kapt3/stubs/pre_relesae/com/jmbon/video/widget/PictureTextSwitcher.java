package com.jmbon.video.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u0004\u0018\u00010\rJ\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u001aJ\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0006\u0010\u001f\u001a\u00020\u0018J\u0006\u0010 \u001a\u00020\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/jmbon/video/widget/PictureTextSwitcher;", "Landroid/widget/ViewSwitcher;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isFlipping", "", "mCurrentIndex", "", "mData", "Ljava/util/ArrayList;", "Lcom/jmbon/middleware/bean/VideoAdv;", "getMData", "()Ljava/util/ArrayList;", "setMData", "(Ljava/util/ArrayList;)V", "mHandler", "Landroid/os/Handler;", "runnable", "Ljava/lang/Runnable;", "getCurrentData", "setData", "", "data", "", "setViewData", "itemView", "Landroid/view/View;", "pos", "startFlipping", "stopFlipping", "module-video_pre_relesae"})
public final class PictureTextSwitcher extends android.widget.ViewSwitcher {
    private int mCurrentIndex = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.jmbon.middleware.bean.VideoAdv> mData;
    private boolean isFlipping = false;
    private final android.os.Handler mHandler = null;
    private final java.lang.Runnable runnable = null;
    
    @kotlin.jvm.JvmOverloads()
    public PictureTextSwitcher(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public PictureTextSwitcher(@org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.jmbon.middleware.bean.VideoAdv getCurrentData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jmbon.middleware.bean.VideoAdv> data) {
    }
    
    private final void setViewData(android.view.View itemView, int pos) {
    }
    
    public final void startFlipping() {
    }
    
    public final void stopFlipping() {
    }
}