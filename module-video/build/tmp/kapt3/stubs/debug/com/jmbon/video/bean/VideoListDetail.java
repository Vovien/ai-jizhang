package com.jmbon.video.bean;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0003J#\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u00d6\u0001R.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u001a"}, d2 = {"Lcom/jmbon/video/bean/VideoListDetail;", "Landroid/os/Parcelable;", "videoList", "Ljava/util/ArrayList;", "Lcom/jmbon/middleware/bean/VideoDetail$VideoData;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getVideoList", "()Ljava/util/ArrayList;", "setVideoList", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "module-video_debug"})
public final class VideoListDetail implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "video_list")
    private java.util.ArrayList<com.jmbon.middleware.bean.VideoDetail.VideoData> videoList;
    public static final android.os.Parcelable.Creator<com.jmbon.video.bean.VideoListDetail> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.jmbon.video.bean.VideoListDetail copy(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.jmbon.middleware.bean.VideoDetail.VideoData> videoList) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public VideoListDetail() {
        super();
    }
    
    public VideoListDetail(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.jmbon.middleware.bean.VideoDetail.VideoData> videoList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.jmbon.middleware.bean.VideoDetail.VideoData> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.jmbon.middleware.bean.VideoDetail.VideoData> getVideoList() {
        return null;
    }
    
    public final void setVideoList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.jmbon.middleware.bean.VideoDetail.VideoData> p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.jmbon.video.bean.VideoListDetail> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.jmbon.video.bean.VideoListDetail createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.jmbon.video.bean.VideoListDetail[] newArray(int size) {
            return null;
        }
    }
}