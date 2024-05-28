package com.jmbon.video.bean;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0018"}, d2 = {"Lcom/jmbon/video/bean/VideoNewDetail;", "Landroid/os/Parcelable;", "video", "Lcom/jmbon/middleware/bean/VideoDetail$VideoData;", "(Lcom/jmbon/middleware/bean/VideoDetail$VideoData;)V", "getVideo", "()Lcom/jmbon/middleware/bean/VideoDetail$VideoData;", "setVideo", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "module-video_release"})
public final class VideoNewDetail implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "video_info")
    private com.jmbon.middleware.bean.VideoDetail.VideoData video;
    public static final android.os.Parcelable.Creator<com.jmbon.video.bean.VideoNewDetail> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.jmbon.video.bean.VideoNewDetail copy(@org.jetbrains.annotations.Nullable()
    com.jmbon.middleware.bean.VideoDetail.VideoData video) {
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
    
    public VideoNewDetail() {
        super();
    }
    
    public VideoNewDetail(@org.jetbrains.annotations.Nullable()
    com.jmbon.middleware.bean.VideoDetail.VideoData video) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.jmbon.middleware.bean.VideoDetail.VideoData component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.jmbon.middleware.bean.VideoDetail.VideoData getVideo() {
        return null;
    }
    
    public final void setVideo(@org.jetbrains.annotations.Nullable()
    com.jmbon.middleware.bean.VideoDetail.VideoData p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.jmbon.video.bean.VideoNewDetail> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.jmbon.video.bean.VideoNewDetail createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.jmbon.video.bean.VideoNewDetail[] newArray(int size) {
            return null;
        }
    }
}