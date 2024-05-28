package com.jmbon.video.adapter;

import java.lang.System;

/**
 * 视频流、广告列表的代理
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B=\u00126\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002J \u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0016H\u0002J\u001e\u0010!\u001a\u00020\f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040#2\u0006\u0010\t\u001a\u00020\u0003H\u0016J \u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0004H\u0016RA\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a\u00a8\u0006("}, d2 = {"Lcom/jmbon/video/adapter/VideoStreamListDelegate;", "Lcom/jmbon/middleware/adapter/EventViewBindingDelegate;", "Lcom/jmbon/middleware/bean/event/CircleChangedEvent;", "Lcom/jmbon/video/bean/VideoStream$VideoStreamResult;", "Lcom/jmbon/video/databinding/ItemVideoListVideoBinding;", "adClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "", "position", "", "(Lkotlin/jvm/functions/Function2;)V", "getAdClick", "()Lkotlin/jvm/functions/Function2;", "halfWidth", "getHalfWidth", "()I", "setHalfWidth", "(I)V", "maxHeight", "", "getMaxHeight", "()F", "setMaxHeight", "(F)V", "miniHeight", "getMiniHeight", "setMiniHeight", "getItemHeight", "height", "width", "onBindViewHolder", "holder", "Lcom/jmbon/middleware/utils/ViewBindingViewHolder;", "setEventData", "it", "", "viewBinding", "module-video_release"})
public final class VideoStreamListDelegate extends com.jmbon.middleware.adapter.EventViewBindingDelegate<com.jmbon.middleware.bean.event.CircleChangedEvent, com.jmbon.video.bean.VideoStream.VideoStreamResult, com.jmbon.video.databinding.ItemVideoListVideoBinding> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<com.jmbon.video.bean.VideoStream.VideoStreamResult, java.lang.Integer, kotlin.Unit> adClick = null;
    private int halfWidth = 0;
    private float maxHeight = 0.0F;
    private float miniHeight = 0.0F;
    
    public VideoStreamListDelegate(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.jmbon.video.bean.VideoStream.VideoStreamResult, ? super java.lang.Integer, kotlin.Unit> adClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.jmbon.video.bean.VideoStream.VideoStreamResult, java.lang.Integer, kotlin.Unit> getAdClick() {
        return null;
    }
    
    public final int getHalfWidth() {
        return 0;
    }
    
    public final void setHalfWidth(int p0) {
    }
    
    public final float getMaxHeight() {
        return 0.0F;
    }
    
    public final void setMaxHeight(float p0) {
    }
    
    public final float getMiniHeight() {
        return 0.0F;
    }
    
    public final void setMiniHeight(float p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.jmbon.middleware.utils.ViewBindingViewHolder<com.jmbon.video.databinding.ItemVideoListVideoBinding> holder, @org.jetbrains.annotations.NotNull()
    com.jmbon.video.bean.VideoStream.VideoStreamResult item) {
    }
    
    @java.lang.Override()
    public void setEventData(@org.jetbrains.annotations.NotNull()
    com.jmbon.middleware.bean.event.CircleChangedEvent it, @org.jetbrains.annotations.NotNull()
    java.lang.Object item, @org.jetbrains.annotations.NotNull()
    com.jmbon.video.databinding.ItemVideoListVideoBinding viewBinding) {
    }
    
    private final int getItemHeight(com.jmbon.video.bean.VideoStream.VideoStreamResult item) {
        return 0;
    }
    
    private final int getItemHeight(com.jmbon.video.bean.VideoStream.VideoStreamResult item, float height, float width) {
        return 0;
    }
}