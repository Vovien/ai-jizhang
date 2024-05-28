package com.jmbon.video.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\"B(\u0012!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0003H\u0015J&\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0014J \u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0014\u0010\u001f\u001a\u00020\n*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0003H\u0002J\f\u0010 \u001a\u00020\n*\u00020\u0004H\u0002J\u0014\u0010!\u001a\u00020\n*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0003H\u0002R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R,\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/jmbon/video/adapter/VideoDetailsItemAdapter;", "Lcom/jmbon/middleware/adapter/EventAdapter;", "Lcom/jmbon/middleware/bean/event/FocusChangedEvent;", "Lcom/jmbon/middleware/bean/VideoDetail$VideoData;", "Lcom/jmbon/video/databinding/ItemVideoBinding;", "onCollection", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", "(Lkotlin/jvm/functions/Function1;)V", "canPreLoader", "", "getCanPreLoader", "()Z", "setCanPreLoader", "(Z)V", "getOnCollection", "()Lkotlin/jvm/functions/Function1;", "resetConstraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "convert", "holder", "Lcom/apkdv/mvvmfast/ktx/BindingQuickAdapter$BaseBindingHolder;", "payloads", "", "", "setEventData", "it", "viewBinding", "caseAnimator", "reSetConnect", "setCollection", "Companion", "module-video_debug"})
public final class VideoDetailsItemAdapter extends com.jmbon.middleware.adapter.EventAdapter<com.jmbon.middleware.bean.event.FocusChangedEvent, com.jmbon.middleware.bean.VideoDetail.VideoData, com.jmbon.video.databinding.ItemVideoBinding> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.jmbon.middleware.bean.VideoDetail.VideoData, kotlin.Unit> onCollection = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.jmbon.video.adapter.VideoDetailsItemAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VIDEO_RESET = "video_reset";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String START_SHARE_ANIMATOR = "start_share_animator";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CANCEL_SHARE_ANIMATOR = "cancel_share_animator";
    private boolean canPreLoader = true;
    private final androidx.constraintlayout.widget.ConstraintSet resetConstraintSet = null;
    
    public VideoDetailsItemAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.jmbon.middleware.bean.VideoDetail.VideoData, kotlin.Unit> onCollection) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.jmbon.middleware.bean.VideoDetail.VideoData, kotlin.Unit> getOnCollection() {
        return null;
    }
    
    public final boolean getCanPreLoader() {
        return false;
    }
    
    public final void setCanPreLoader(boolean p0) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void convert(@org.jetbrains.annotations.NotNull()
    com.apkdv.mvvmfast.ktx.BindingQuickAdapter.BaseBindingHolder holder, @org.jetbrains.annotations.NotNull()
    com.jmbon.middleware.bean.VideoDetail.VideoData item) {
    }
    
    private final void setCollection(com.jmbon.video.databinding.ItemVideoBinding $this$setCollection, com.jmbon.middleware.bean.VideoDetail.VideoData item) {
    }
    
    private final void caseAnimator(com.jmbon.video.databinding.ItemVideoBinding $this$caseAnimator, com.jmbon.middleware.bean.VideoDetail.VideoData item) {
    }
    
    @java.lang.Override()
    protected void convert(@org.jetbrains.annotations.NotNull()
    com.apkdv.mvvmfast.ktx.BindingQuickAdapter.BaseBindingHolder holder, @org.jetbrains.annotations.NotNull()
    com.jmbon.middleware.bean.VideoDetail.VideoData item, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> payloads) {
    }
    
    private final void reSetConnect(com.jmbon.video.databinding.ItemVideoBinding $this$reSetConnect) {
    }
    
    @java.lang.Override()
    public void setEventData(@org.jetbrains.annotations.NotNull()
    com.jmbon.middleware.bean.event.FocusChangedEvent it, @org.jetbrains.annotations.NotNull()
    com.jmbon.middleware.bean.VideoDetail.VideoData item, @org.jetbrains.annotations.NotNull()
    com.jmbon.video.databinding.ItemVideoBinding viewBinding) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/jmbon/video/adapter/VideoDetailsItemAdapter$Companion;", "", "()V", "CANCEL_SHARE_ANIMATOR", "", "START_SHARE_ANIMATOR", "VIDEO_RESET", "module-video_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}