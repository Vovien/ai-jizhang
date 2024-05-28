package com.jmbon.video.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0004J\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\u00042\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\u0010"}, d2 = {"Lcom/jmbon/video/viewmodel/VideoDetailsViewModel;", "Lcom/apkdv/mvvmfast/base/BaseViewModel;", "()V", "collect", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apkdv/mvvmfast/network/entity/EmptyData;", "operateType", "", "videoId", "", "getAllVideoList", "Ljava/util/ArrayList;", "Lcom/jmbon/middleware/bean/VideoDetail$VideoData;", "getVideoDetail", "Lcom/jmbon/video/bean/VideoNewDetail;", "kotlin.jvm.PlatformType", "module-video_release"})
public final class VideoDetailsViewModel extends com.apkdv.mvvmfast.base.BaseViewModel {
    
    public VideoDetailsViewModel() {
        super();
    }
    
    /**
     * 获取视频列表
     * @date 2023/9/11 16:51
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.ArrayList<com.jmbon.middleware.bean.VideoDetail.VideoData>> getAllVideoList() {
        return null;
    }
    
    /**
     * 获取视频详情
     * @date 2023/11/14 16:54
     * @param videoId
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.jmbon.video.bean.VideoNewDetail> getVideoDetail(int videoId) {
        return null;
    }
    
    /**
     * 收藏视频
     * @date 2023/11/14 18:07
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.apkdv.mvvmfast.network.entity.EmptyData> collect(@org.jetbrains.annotations.NotNull()
    java.lang.String operateType, int videoId) {
        return null;
    }
}