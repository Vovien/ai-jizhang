package com.jmbon.video.bean;

import java.lang.System;

/**
 * ****************************************************************************
 * Description: 方案配置信息
 *
 * Author: jhg
 *
 * Date: 2023/6/15
 *
 * Copyright: all rights reserved by Mantang.
 */
@kotlinx.parcelize.Parcelize()
@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006%"}, d2 = {"Lcom/jmbon/video/bean/SchemeConfigBean;", "Landroid/os/Parcelable;", "title_img", "", "content_list", "", "wechat", "qrcode", "button_word", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButton_word", "()Ljava/lang/String;", "getContent_list", "()Ljava/util/List;", "getQrcode", "getTitle_img", "getWechat", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "module-video_release"})
public final class SchemeConfigBean implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title_img = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> content_list = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String wechat = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String qrcode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String button_word = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.jmbon.video.bean.SchemeConfigBean.Companion Companion = null;
    
    /**
     * 案例
     */
    public static final int SCHEME_TYPE_CASE = 1;
    public static final android.os.Parcelable.Creator<com.jmbon.video.bean.SchemeConfigBean> CREATOR = null;
    
    /**
     * ****************************************************************************
     * Description: 方案配置信息
     *
     * Author: jhg
     *
     * Date: 2023/6/15
     *
     * Copyright: all rights reserved by Mantang.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.jmbon.video.bean.SchemeConfigBean copy(@org.jetbrains.annotations.NotNull()
    java.lang.String title_img, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> content_list, @org.jetbrains.annotations.NotNull()
    java.lang.String wechat, @org.jetbrains.annotations.NotNull()
    java.lang.String qrcode, @org.jetbrains.annotations.NotNull()
    java.lang.String button_word) {
        return null;
    }
    
    /**
     * ****************************************************************************
     * Description: 方案配置信息
     *
     * Author: jhg
     *
     * Date: 2023/6/15
     *
     * Copyright: all rights reserved by Mantang.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * ****************************************************************************
     * Description: 方案配置信息
     *
     * Author: jhg
     *
     * Date: 2023/6/15
     *
     * Copyright: all rights reserved by Mantang.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * ****************************************************************************
     * Description: 方案配置信息
     *
     * Author: jhg
     *
     * Date: 2023/6/15
     *
     * Copyright: all rights reserved by Mantang.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SchemeConfigBean() {
        super();
    }
    
    public SchemeConfigBean(@org.jetbrains.annotations.NotNull()
    java.lang.String title_img, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> content_list, @org.jetbrains.annotations.NotNull()
    java.lang.String wechat, @org.jetbrains.annotations.NotNull()
    java.lang.String qrcode, @org.jetbrains.annotations.NotNull()
    java.lang.String button_word) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle_img() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getContent_list() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWechat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQrcode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getButton_word() {
        return null;
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
    public static final class Creator implements android.os.Parcelable.Creator<com.jmbon.video.bean.SchemeConfigBean> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.jmbon.video.bean.SchemeConfigBean createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.jmbon.video.bean.SchemeConfigBean[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/jmbon/video/bean/SchemeConfigBean$Companion;", "", "()V", "SCHEME_TYPE_CASE", "", "module-video_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}