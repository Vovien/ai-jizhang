package com.jmbon.video.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/jmbon/video/api/VideoApi;", "", "()V", "getVideoAdvList", "Lcom/jmbon/middleware/bean/VideoAdvBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoDetail", "Lcom/jmbon/video/bean/VideoNewDetail;", "videoId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoList", "Lcom/jmbon/video/bean/VideoListDetail;", "videoCollect", "Lcom/apkdv/mvvmfast/network/entity/EmptyData;", "operateType", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module-video_release"})
public final class VideoApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.jmbon.video.api.VideoApi INSTANCE = null;
    
    private VideoApi() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getVideoAdvList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jmbon.middleware.bean.VideoAdvBean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getVideoList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jmbon.video.bean.VideoListDetail> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getVideoDetail(int videoId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jmbon.video.bean.VideoNewDetail> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object videoCollect(@org.jetbrains.annotations.NotNull()
    java.lang.String operateType, int videoId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.apkdv.mvvmfast.network.entity.EmptyData> continuation) {
        return null;
    }
}