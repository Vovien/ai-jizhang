package com.jmbon.video.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\u000e"}, d2 = {"Lcom/jmbon/video/viewmodel/VideoDetailsViewModel;", "Lcom/apkdv/mvvmfast/base/BaseViewModel;", "()V", "collect", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apkdv/mvvmfast/network/entity/EmptyData;", "operateType", "", "videoId", "", "getAllVideoList", "Lcom/jmbon/video/bean/VideoListDetail;", "getVideoDetail", "Lcom/jmbon/video/bean/VideoNewDetail;", "module-video_pre_relesae"})
public final class VideoDetailsViewModel extends com.apkdv.mvvmfast.base.BaseViewModel {
    
    public VideoDetailsViewModel() {
        super();
    }
    
    /**
     * 获取视频列表
     * @date 2023/9/11 16:51
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.jmbon.video.bean.VideoListDetail> getAllVideoList() {
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