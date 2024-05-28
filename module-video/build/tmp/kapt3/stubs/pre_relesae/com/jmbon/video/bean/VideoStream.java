package com.jmbon.video.bean;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0003J#\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u00d6\u0001R.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Lcom/jmbon/video/bean/VideoStream;", "Landroid/os/Parcelable;", "results", "Ljava/util/ArrayList;", "Lcom/jmbon/video/bean/VideoStream$VideoStreamResult;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getResults", "()Ljava/util/ArrayList;", "setResults", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "VideoStreamResult", "module-video_pre_relesae"})
public final class VideoStream implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult> results;
    public static final android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.jmbon.video.bean.VideoStream copy(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult> results) {
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
    
    public VideoStream() {
        super();
    }
    
    public VideoStream(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult> results) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult> p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.jmbon.video.bean.VideoStream createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.jmbon.video.bean.VideoStream[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @androidx.annotation.Keep()
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004:;<=Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c6\u0003J\u0019\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\rH\u00c6\u0003J\t\u0010,\u001a\u00020\u000fH\u00c6\u0003Je\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\t\u0010.\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u00d6\u0003J\t\u00103\u001a\u00020\u000fH\u00d6\u0001J\t\u00104\u001a\u00020\rH\u00d6\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u000fH\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R.\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R.\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006>"}, d2 = {"Lcom/jmbon/video/bean/VideoStream$VideoStreamResult;", "Landroid/os/Parcelable;", "adv", "Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$Adv;", "circle", "Ljava/util/ArrayList;", "Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$Circle;", "Lkotlin/collections/ArrayList;", "flowVido", "Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$FlowVido;", "recommendLabel", "Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$RecommendLabel;", "type", "", "imageHeight", "", "(Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$Adv;Ljava/util/ArrayList;Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$FlowVido;Ljava/util/ArrayList;Ljava/lang/String;I)V", "getAdv", "()Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$Adv;", "setAdv", "(Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$Adv;)V", "getCircle", "()Ljava/util/ArrayList;", "setCircle", "(Ljava/util/ArrayList;)V", "getFlowVido", "()Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$FlowVido;", "setFlowVido", "(Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$FlowVido;)V", "getImageHeight", "()I", "setImageHeight", "(I)V", "getRecommendLabel", "setRecommendLabel", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Adv", "Circle", "FlowVido", "RecommendLabel", "module-video_pre_relesae"})
    public static final class VideoStreamResult implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "adv")
        private com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv adv;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "circle")
        private java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult.Circle> circle;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "flow_vido")
        private com.jmbon.video.bean.VideoStream.VideoStreamResult.FlowVido flowVido;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "recommend_label")
        private java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult.RecommendLabel> recommendLabel;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "type")
        private java.lang.String type;
        private int imageHeight;
        public static final android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream.VideoStreamResult> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.jmbon.video.bean.VideoStream.VideoStreamResult copy(@org.jetbrains.annotations.NotNull()
        com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv adv, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult.Circle> circle, @org.jetbrains.annotations.NotNull()
        com.jmbon.video.bean.VideoStream.VideoStreamResult.FlowVido flowVido, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult.RecommendLabel> recommendLabel, @org.jetbrains.annotations.NotNull()
        java.lang.String type, int imageHeight) {
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
        
        public VideoStreamResult() {
            super();
        }
        
        public VideoStreamResult(@org.jetbrains.annotations.NotNull()
        com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv adv, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult.Circle> circle, @org.jetbrains.annotations.NotNull()
        com.jmbon.video.bean.VideoStream.VideoStreamResult.FlowVido flowVido, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult.RecommendLabel> recommendLabel, @org.jetbrains.annotations.NotNull()
        java.lang.String type, int imageHeight) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv getAdv() {
            return null;
        }
        
        public final void setAdv(@org.jetbrains.annotations.NotNull()
        com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult.Circle> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult.Circle> getCircle() {
            return null;
        }
        
        public final void setCircle(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult.Circle> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.jmbon.video.bean.VideoStream.VideoStreamResult.FlowVido component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.jmbon.video.bean.VideoStream.VideoStreamResult.FlowVido getFlowVido() {
            return null;
        }
        
        public final void setFlowVido(@org.jetbrains.annotations.NotNull()
        com.jmbon.video.bean.VideoStream.VideoStreamResult.FlowVido p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult.RecommendLabel> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult.RecommendLabel> getRecommendLabel() {
            return null;
        }
        
        public final void setRecommendLabel(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.jmbon.video.bean.VideoStream.VideoStreamResult.RecommendLabel> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        public final void setType(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int getImageHeight() {
            return 0;
        }
        
        public final void setImageHeight(int p0) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream.VideoStreamResult> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.jmbon.video.bean.VideoStream.VideoStreamResult createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.jmbon.video.bean.VideoStream.VideoStreamResult[] newArray(int size) {
                return null;
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @androidx.annotation.Keep()
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b^\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0085\u0001B\u008f\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\"J\t\u0010_\u001a\u00020\u0003H\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u00c6\u0003J\t\u0010f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010g\u001a\u00020\u0005H\u00c6\u0003J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020\u0003H\u00c6\u0003J\t\u0010j\u001a\u00020\u0005H\u00c6\u0003J\t\u0010k\u001a\u00020\u0003H\u00c6\u0003J\t\u0010l\u001a\u00020\u0003H\u00c6\u0003J\t\u0010m\u001a\u00020\u0005H\u00c6\u0003J\t\u0010n\u001a\u00020\u001eH\u00c6\u0003J\t\u0010o\u001a\u00020\u0003H\u00c6\u0003J\t\u0010p\u001a\u00020\u0005H\u00c6\u0003J\t\u0010q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010s\u001a\u00020\u0005H\u00c6\u0003J\t\u0010t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010u\u001a\u00020\u0005H\u00c6\u0003J\t\u0010v\u001a\u00020\u0003H\u00c6\u0003J\t\u0010w\u001a\u00020\u0003H\u00c6\u0003J\t\u0010x\u001a\u00020\rH\u00c6\u0003J\u0093\u0002\u0010y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u0003H\u00c6\u0001J\t\u0010z\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010{\u001a\u00020\r2\b\u0010|\u001a\u0004\u0018\u00010}H\u00d6\u0003J\t\u0010~\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u007f\u001a\u00020\u0005H\u00d6\u0001J\u001e\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R\u001e\u0010!\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010$\"\u0004\b7\u0010&R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u00108\"\u0004\b9\u0010:R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010$\"\u0004\b<\u0010&R\u001e\u0010 \u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010(\"\u0004\b>\u0010*R\u001e\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*R\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010(\"\u0004\bD\u0010*R\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010(\"\u0004\bF\u0010*R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010$\"\u0004\bH\u0010&R$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001e\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010(\"\u0004\bN\u0010*R\u001e\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010(\"\u0004\bP\u0010*R\u001e\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010$\"\u0004\bR\u0010&R\u001e\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010$\"\u0004\bT\u0010&R\u001e\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010$\"\u0004\bV\u0010&R\u001e\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010(\"\u0004\bX\u0010*R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001e\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010$\"\u0004\b^\u0010&\u00a8\u0006\u0086\u0001"}, d2 = {"Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$Adv;", "Landroid/os/Parcelable;", "addTime", "", "circleId", "", "contentType", "covers", "createTime", "icon", "id", "isDel", "isJoin", "", "itemId", "name", "number", "originality", "resourceType", "resources", "", "Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$Adv$Resource;", "title", "toolId", "label", "toolType", "type", "updateTime", "url", "user", "Lcom/jmbon/middleware/bean/User;", "views", "itemType", "identity", "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IIZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Lcom/jmbon/middleware/bean/User;ILjava/lang/String;I)V", "getAddTime", "()I", "setAddTime", "(I)V", "getCircleId", "()Ljava/lang/String;", "setCircleId", "(Ljava/lang/String;)V", "getContentType", "setContentType", "getCovers", "setCovers", "getCreateTime", "setCreateTime", "getIcon", "setIcon", "getId", "setId", "getIdentity", "setIdentity", "setDel", "()Z", "setJoin", "(Z)V", "getItemId", "setItemId", "getItemType", "setItemType", "getLabel", "setLabel", "getName", "setName", "getNumber", "setNumber", "getOriginality", "setOriginality", "getResourceType", "setResourceType", "getResources", "()Ljava/util/List;", "setResources", "(Ljava/util/List;)V", "getTitle", "setTitle", "getToolId", "setToolId", "getToolType", "setToolType", "getType", "setType", "getUpdateTime", "setUpdateTime", "getUrl", "setUrl", "getUser", "()Lcom/jmbon/middleware/bean/User;", "setUser", "(Lcom/jmbon/middleware/bean/User;)V", "getViews", "setViews", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Resource", "module-video_pre_relesae"})
        public static final class Adv implements android.os.Parcelable {
            @com.google.gson.annotations.SerializedName(value = "add_time")
            private int addTime;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "circle_id")
            private java.lang.String circleId;
            @com.google.gson.annotations.SerializedName(value = "content_type")
            private int contentType;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "covers")
            private java.lang.String covers;
            @com.google.gson.annotations.SerializedName(value = "create_time")
            private int createTime;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "icon")
            private java.lang.String icon;
            @com.google.gson.annotations.SerializedName(value = "id")
            private int id;
            @com.google.gson.annotations.SerializedName(value = "is_del")
            private int isDel;
            @com.google.gson.annotations.SerializedName(value = "is_join")
            private boolean isJoin;
            @com.google.gson.annotations.SerializedName(value = "item_id")
            private int itemId;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "name")
            private java.lang.String name;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "number")
            private java.lang.String number;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "originality")
            private java.lang.String originality;
            @com.google.gson.annotations.SerializedName(value = "resource_type")
            private int resourceType;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "resources")
            private java.util.List<com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv.Resource> resources;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "title")
            private java.lang.String title;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "tool_id")
            private java.lang.String toolId;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "label")
            private java.lang.String label;
            @com.google.gson.annotations.SerializedName(value = "tool_type")
            private int toolType;
            @com.google.gson.annotations.SerializedName(value = "type")
            private int type;
            @com.google.gson.annotations.SerializedName(value = "update_time")
            private int updateTime;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "url")
            private java.lang.String url;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "user")
            private com.jmbon.middleware.bean.User user;
            @com.google.gson.annotations.SerializedName(value = "views")
            private int views;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "item_type")
            private java.lang.String itemType;
            @com.google.gson.annotations.SerializedName(value = "identity")
            private int identity;
            public static final android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv copy(int addTime, @org.jetbrains.annotations.NotNull()
            java.lang.String circleId, int contentType, @org.jetbrains.annotations.NotNull()
            java.lang.String covers, int createTime, @org.jetbrains.annotations.NotNull()
            java.lang.String icon, int id, int isDel, boolean isJoin, int itemId, @org.jetbrains.annotations.NotNull()
            java.lang.String name, @org.jetbrains.annotations.NotNull()
            java.lang.String number, @org.jetbrains.annotations.NotNull()
            java.lang.String originality, int resourceType, @org.jetbrains.annotations.NotNull()
            java.util.List<com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv.Resource> resources, @org.jetbrains.annotations.NotNull()
            java.lang.String title, @org.jetbrains.annotations.NotNull()
            java.lang.String toolId, @org.jetbrains.annotations.NotNull()
            java.lang.String label, int toolType, int type, int updateTime, @org.jetbrains.annotations.NotNull()
            java.lang.String url, @org.jetbrains.annotations.NotNull()
            com.jmbon.middleware.bean.User user, int views, @org.jetbrains.annotations.NotNull()
            java.lang.String itemType, int identity) {
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
            
            public Adv() {
                super();
            }
            
            public Adv(int addTime, @org.jetbrains.annotations.NotNull()
            java.lang.String circleId, int contentType, @org.jetbrains.annotations.NotNull()
            java.lang.String covers, int createTime, @org.jetbrains.annotations.NotNull()
            java.lang.String icon, int id, int isDel, boolean isJoin, int itemId, @org.jetbrains.annotations.NotNull()
            java.lang.String name, @org.jetbrains.annotations.NotNull()
            java.lang.String number, @org.jetbrains.annotations.NotNull()
            java.lang.String originality, int resourceType, @org.jetbrains.annotations.NotNull()
            java.util.List<com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv.Resource> resources, @org.jetbrains.annotations.NotNull()
            java.lang.String title, @org.jetbrains.annotations.NotNull()
            java.lang.String toolId, @org.jetbrains.annotations.NotNull()
            java.lang.String label, int toolType, int type, int updateTime, @org.jetbrains.annotations.NotNull()
            java.lang.String url, @org.jetbrains.annotations.NotNull()
            com.jmbon.middleware.bean.User user, int views, @org.jetbrains.annotations.NotNull()
            java.lang.String itemType, int identity) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getAddTime() {
                return 0;
            }
            
            public final void setAddTime(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCircleId() {
                return null;
            }
            
            public final void setCircleId(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int component3() {
                return 0;
            }
            
            public final int getContentType() {
                return 0;
            }
            
            public final void setContentType(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCovers() {
                return null;
            }
            
            public final void setCovers(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int component5() {
                return 0;
            }
            
            public final int getCreateTime() {
                return 0;
            }
            
            public final void setCreateTime(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component6() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getIcon() {
                return null;
            }
            
            public final void setIcon(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int component7() {
                return 0;
            }
            
            public final int getId() {
                return 0;
            }
            
            public final void setId(int p0) {
            }
            
            public final int component8() {
                return 0;
            }
            
            public final int isDel() {
                return 0;
            }
            
            public final void setDel(int p0) {
            }
            
            public final boolean component9() {
                return false;
            }
            
            public final boolean isJoin() {
                return false;
            }
            
            public final void setJoin(boolean p0) {
            }
            
            public final int component10() {
                return 0;
            }
            
            public final int getItemId() {
                return 0;
            }
            
            public final void setItemId(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component11() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getName() {
                return null;
            }
            
            public final void setName(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component12() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getNumber() {
                return null;
            }
            
            public final void setNumber(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component13() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getOriginality() {
                return null;
            }
            
            public final void setOriginality(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int component14() {
                return 0;
            }
            
            public final int getResourceType() {
                return 0;
            }
            
            public final void setResourceType(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv.Resource> component15() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv.Resource> getResources() {
                return null;
            }
            
            public final void setResources(@org.jetbrains.annotations.NotNull()
            java.util.List<com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv.Resource> p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component16() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTitle() {
                return null;
            }
            
            public final void setTitle(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component17() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getToolId() {
                return null;
            }
            
            public final void setToolId(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component18() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLabel() {
                return null;
            }
            
            public final void setLabel(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int component19() {
                return 0;
            }
            
            public final int getToolType() {
                return 0;
            }
            
            public final void setToolType(int p0) {
            }
            
            public final int component20() {
                return 0;
            }
            
            public final int getType() {
                return 0;
            }
            
            public final void setType(int p0) {
            }
            
            public final int component21() {
                return 0;
            }
            
            public final int getUpdateTime() {
                return 0;
            }
            
            public final void setUpdateTime(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component22() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUrl() {
                return null;
            }
            
            public final void setUrl(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.jmbon.middleware.bean.User component23() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.jmbon.middleware.bean.User getUser() {
                return null;
            }
            
            public final void setUser(@org.jetbrains.annotations.NotNull()
            com.jmbon.middleware.bean.User p0) {
            }
            
            public final int component24() {
                return 0;
            }
            
            public final int getViews() {
                return 0;
            }
            
            public final void setViews(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component25() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getItemType() {
                return null;
            }
            
            public final void setItemType(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int component26() {
                return 0;
            }
            
            public final int getIdentity() {
                return 0;
            }
            
            public final void setIdentity(int p0) {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlinx.parcelize.Parcelize()
            @androidx.annotation.Keep()
            @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u001bH\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bH\u00d6\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f\u00a8\u0006\'"}, d2 = {"Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$Adv$Resource;", "Landroid/os/Parcelable;", "src", "", "type", "height", "", "width", "(Ljava/lang/String;Ljava/lang/String;FF)V", "getHeight", "()F", "setHeight", "(F)V", "getSrc", "()Ljava/lang/String;", "setSrc", "(Ljava/lang/String;)V", "getType", "setType", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "module-video_pre_relesae"})
            public static final class Resource implements android.os.Parcelable {
                @org.jetbrains.annotations.NotNull()
                @com.google.gson.annotations.SerializedName(value = "src")
                private java.lang.String src;
                @org.jetbrains.annotations.NotNull()
                @com.google.gson.annotations.SerializedName(value = "type")
                private java.lang.String type;
                @com.google.gson.annotations.SerializedName(value = "height")
                private float height;
                @com.google.gson.annotations.SerializedName(value = "width")
                private float width;
                public static final android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv.Resource> CREATOR = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv.Resource copy(@org.jetbrains.annotations.NotNull()
                java.lang.String src, @org.jetbrains.annotations.NotNull()
                java.lang.String type, float height, float width) {
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
                
                public Resource() {
                    super();
                }
                
                public Resource(@org.jetbrains.annotations.NotNull()
                java.lang.String src, @org.jetbrains.annotations.NotNull()
                java.lang.String type, float height, float width) {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getSrc() {
                    return null;
                }
                
                public final void setSrc(@org.jetbrains.annotations.NotNull()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getType() {
                    return null;
                }
                
                public final void setType(@org.jetbrains.annotations.NotNull()
                java.lang.String p0) {
                }
                
                public final float component3() {
                    return 0.0F;
                }
                
                public final float getHeight() {
                    return 0.0F;
                }
                
                public final void setHeight(float p0) {
                }
                
                public final float component4() {
                    return 0.0F;
                }
                
                public final float getWidth() {
                    return 0.0F;
                }
                
                public final void setWidth(float p0) {
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
                public static final class Creator implements android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv.Resource> {
                    
                    public Creator() {
                        super();
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv.Resource createFromParcel(@org.jetbrains.annotations.NotNull()
                    android.os.Parcel in) {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.jmbon.video.bean.VideoStream.VideoStreamResult.Adv.Resource[] newArray(int size) {
                        return null;
                    }
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @androidx.annotation.Keep()
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\t\u0010+\u001a\u00020\nH\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003Jc\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001J\t\u00100\u001a\u00020\u0006H\u00d6\u0001J\u0013\u00101\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u000103H\u00d6\u0003J\t\u00104\u001a\u00020\u0006H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012\u00a8\u0006;"}, d2 = {"Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$Circle;", "Landroid/os/Parcelable;", "covers", "", "description", "groupId", "", "icon", "id", "isJoin", "", "memberCount", "name", "number", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZILjava/lang/String;Ljava/lang/String;)V", "getCovers", "()Ljava/lang/String;", "setCovers", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getGroupId", "()I", "setGroupId", "(I)V", "getIcon", "setIcon", "getId", "setId", "()Z", "setJoin", "(Z)V", "getMemberCount", "setMemberCount", "getName", "setName", "getNumber", "setNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "module-video_pre_relesae"})
        public static final class Circle implements android.os.Parcelable {
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "covers")
            private java.lang.String covers;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "description")
            private java.lang.String description;
            @com.google.gson.annotations.SerializedName(value = "group_id")
            private int groupId;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "icon")
            private java.lang.String icon;
            @com.google.gson.annotations.SerializedName(value = "id")
            private int id;
            @com.google.gson.annotations.SerializedName(value = "is_join")
            private boolean isJoin;
            @com.google.gson.annotations.SerializedName(value = "member_count")
            private int memberCount;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "name")
            private java.lang.String name;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "number")
            private java.lang.String number;
            public static final android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream.VideoStreamResult.Circle> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.jmbon.video.bean.VideoStream.VideoStreamResult.Circle copy(@org.jetbrains.annotations.NotNull()
            java.lang.String covers, @org.jetbrains.annotations.NotNull()
            java.lang.String description, int groupId, @org.jetbrains.annotations.NotNull()
            java.lang.String icon, int id, boolean isJoin, int memberCount, @org.jetbrains.annotations.NotNull()
            java.lang.String name, @org.jetbrains.annotations.NotNull()
            java.lang.String number) {
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
            
            public Circle() {
                super();
            }
            
            public Circle(@org.jetbrains.annotations.NotNull()
            java.lang.String covers, @org.jetbrains.annotations.NotNull()
            java.lang.String description, int groupId, @org.jetbrains.annotations.NotNull()
            java.lang.String icon, int id, boolean isJoin, int memberCount, @org.jetbrains.annotations.NotNull()
            java.lang.String name, @org.jetbrains.annotations.NotNull()
            java.lang.String number) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCovers() {
                return null;
            }
            
            public final void setCovers(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getDescription() {
                return null;
            }
            
            public final void setDescription(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int component3() {
                return 0;
            }
            
            public final int getGroupId() {
                return 0;
            }
            
            public final void setGroupId(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getIcon() {
                return null;
            }
            
            public final void setIcon(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int component5() {
                return 0;
            }
            
            public final int getId() {
                return 0;
            }
            
            public final void setId(int p0) {
            }
            
            public final boolean component6() {
                return false;
            }
            
            public final boolean isJoin() {
                return false;
            }
            
            public final void setJoin(boolean p0) {
            }
            
            public final int component7() {
                return 0;
            }
            
            public final int getMemberCount() {
                return 0;
            }
            
            public final void setMemberCount(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component8() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getName() {
                return null;
            }
            
            public final void setName(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component9() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getNumber() {
                return null;
            }
            
            public final void setNumber(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream.VideoStreamResult.Circle> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.jmbon.video.bean.VideoStream.VideoStreamResult.Circle createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.jmbon.video.bean.VideoStream.VideoStreamResult.Circle[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @androidx.annotation.Keep()
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00af\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0017J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0005H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0013H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u000bH\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u000bH\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\u00b3\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u000bH\u00c6\u0001J\t\u0010T\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010XH\u00d6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00d6\u0001J\t\u0010Z\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001bR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010\u001bR\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010\u001bR\u001e\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010+\"\u0004\bA\u0010-\u00a8\u0006`"}, d2 = {"Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$FlowVido;", "Landroid/os/Parcelable;", "commentCount", "", "cover", "", "createTime", "description", "duration", "giveCount", "height", "", "id", "playCount", "style", "title", "uid", "url", "user", "Lcom/jmbon/middleware/bean/User;", "watchCount", "fakePlayCount", "width", "(ILjava/lang/String;ILjava/lang/String;IIFIIILjava/lang/String;ILjava/lang/String;Lcom/jmbon/middleware/bean/User;IIF)V", "getCommentCount", "()I", "setCommentCount", "(I)V", "getCover", "()Ljava/lang/String;", "setCover", "(Ljava/lang/String;)V", "getCreateTime", "setCreateTime", "getDescription", "setDescription", "getDuration", "setDuration", "getFakePlayCount", "setFakePlayCount", "getGiveCount", "setGiveCount", "getHeight", "()F", "setHeight", "(F)V", "getId", "setId", "getPlayCount", "setPlayCount", "getStyle", "setStyle", "getTitle", "setTitle", "getUid", "setUid", "getUrl", "setUrl", "getUser", "()Lcom/jmbon/middleware/bean/User;", "setUser", "(Lcom/jmbon/middleware/bean/User;)V", "getWatchCount", "setWatchCount", "getWidth", "setWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "module-video_pre_relesae"})
        public static final class FlowVido implements android.os.Parcelable {
            @com.google.gson.annotations.SerializedName(value = "comment_count")
            private int commentCount;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "cover")
            private java.lang.String cover;
            @com.google.gson.annotations.SerializedName(value = "create_time")
            private int createTime;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "description")
            private java.lang.String description;
            @com.google.gson.annotations.SerializedName(value = "duration")
            private int duration;
            @com.google.gson.annotations.SerializedName(value = "give_count")
            private int giveCount;
            @com.google.gson.annotations.SerializedName(value = "height")
            private float height;
            @com.google.gson.annotations.SerializedName(value = "id")
            private int id;
            @com.google.gson.annotations.SerializedName(value = "play_count")
            private int playCount;
            @com.google.gson.annotations.SerializedName(value = "style")
            private int style;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "title")
            private java.lang.String title;
            @com.google.gson.annotations.SerializedName(value = "uid")
            private int uid;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "url")
            private java.lang.String url;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "user")
            private com.jmbon.middleware.bean.User user;
            @com.google.gson.annotations.SerializedName(value = "watch_count")
            private int watchCount;
            @com.google.gson.annotations.SerializedName(value = "fake_play_count")
            private int fakePlayCount;
            @com.google.gson.annotations.SerializedName(value = "width")
            private float width;
            public static final android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream.VideoStreamResult.FlowVido> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.jmbon.video.bean.VideoStream.VideoStreamResult.FlowVido copy(int commentCount, @org.jetbrains.annotations.NotNull()
            java.lang.String cover, int createTime, @org.jetbrains.annotations.NotNull()
            java.lang.String description, int duration, int giveCount, float height, int id, int playCount, int style, @org.jetbrains.annotations.NotNull()
            java.lang.String title, int uid, @org.jetbrains.annotations.NotNull()
            java.lang.String url, @org.jetbrains.annotations.NotNull()
            com.jmbon.middleware.bean.User user, int watchCount, int fakePlayCount, float width) {
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
            
            public FlowVido() {
                super();
            }
            
            public FlowVido(int commentCount, @org.jetbrains.annotations.NotNull()
            java.lang.String cover, int createTime, @org.jetbrains.annotations.NotNull()
            java.lang.String description, int duration, int giveCount, float height, int id, int playCount, int style, @org.jetbrains.annotations.NotNull()
            java.lang.String title, int uid, @org.jetbrains.annotations.NotNull()
            java.lang.String url, @org.jetbrains.annotations.NotNull()
            com.jmbon.middleware.bean.User user, int watchCount, int fakePlayCount, float width) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getCommentCount() {
                return 0;
            }
            
            public final void setCommentCount(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCover() {
                return null;
            }
            
            public final void setCover(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int component3() {
                return 0;
            }
            
            public final int getCreateTime() {
                return 0;
            }
            
            public final void setCreateTime(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getDescription() {
                return null;
            }
            
            public final void setDescription(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int component5() {
                return 0;
            }
            
            public final int getDuration() {
                return 0;
            }
            
            public final void setDuration(int p0) {
            }
            
            public final int component6() {
                return 0;
            }
            
            public final int getGiveCount() {
                return 0;
            }
            
            public final void setGiveCount(int p0) {
            }
            
            public final float component7() {
                return 0.0F;
            }
            
            public final float getHeight() {
                return 0.0F;
            }
            
            public final void setHeight(float p0) {
            }
            
            public final int component8() {
                return 0;
            }
            
            public final int getId() {
                return 0;
            }
            
            public final void setId(int p0) {
            }
            
            public final int component9() {
                return 0;
            }
            
            public final int getPlayCount() {
                return 0;
            }
            
            public final void setPlayCount(int p0) {
            }
            
            public final int component10() {
                return 0;
            }
            
            public final int getStyle() {
                return 0;
            }
            
            public final void setStyle(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component11() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTitle() {
                return null;
            }
            
            public final void setTitle(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int component12() {
                return 0;
            }
            
            public final int getUid() {
                return 0;
            }
            
            public final void setUid(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component13() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUrl() {
                return null;
            }
            
            public final void setUrl(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.jmbon.middleware.bean.User component14() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.jmbon.middleware.bean.User getUser() {
                return null;
            }
            
            public final void setUser(@org.jetbrains.annotations.NotNull()
            com.jmbon.middleware.bean.User p0) {
            }
            
            public final int component15() {
                return 0;
            }
            
            public final int getWatchCount() {
                return 0;
            }
            
            public final void setWatchCount(int p0) {
            }
            
            public final int component16() {
                return 0;
            }
            
            public final int getFakePlayCount() {
                return 0;
            }
            
            public final void setFakePlayCount(int p0) {
            }
            
            public final float component17() {
                return 0.0F;
            }
            
            public final float getWidth() {
                return 0.0F;
            }
            
            public final void setWidth(float p0) {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream.VideoStreamResult.FlowVido> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.jmbon.video.bean.VideoStream.VideoStreamResult.FlowVido createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.jmbon.video.bean.VideoStream.VideoStreamResult.FlowVido[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @androidx.annotation.Keep()
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u00a8\u0006\""}, d2 = {"Lcom/jmbon/video/bean/VideoStream$VideoStreamResult$RecommendLabel;", "Landroid/os/Parcelable;", "longLabel", "", "label", "id", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "setId", "(I)V", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "getLongLabel", "setLongLabel", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "module-video_pre_relesae"})
        public static final class RecommendLabel implements android.os.Parcelable {
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "long_label")
            private java.lang.String longLabel;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "label")
            private java.lang.String label;
            @com.google.gson.annotations.SerializedName(value = "id")
            private int id;
            public static final android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream.VideoStreamResult.RecommendLabel> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.jmbon.video.bean.VideoStream.VideoStreamResult.RecommendLabel copy(@org.jetbrains.annotations.NotNull()
            java.lang.String longLabel, @org.jetbrains.annotations.NotNull()
            java.lang.String label, int id) {
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
            
            public RecommendLabel() {
                super();
            }
            
            public RecommendLabel(@org.jetbrains.annotations.NotNull()
            java.lang.String longLabel, @org.jetbrains.annotations.NotNull()
            java.lang.String label, int id) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLongLabel() {
                return null;
            }
            
            public final void setLongLabel(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLabel() {
                return null;
            }
            
            public final void setLabel(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int component3() {
                return 0;
            }
            
            public final int getId() {
                return 0;
            }
            
            public final void setId(int p0) {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.jmbon.video.bean.VideoStream.VideoStreamResult.RecommendLabel> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.jmbon.video.bean.VideoStream.VideoStreamResult.RecommendLabel createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.jmbon.video.bean.VideoStream.VideoStreamResult.RecommendLabel[] newArray(int size) {
                    return null;
                }
            }
        }
    }
}