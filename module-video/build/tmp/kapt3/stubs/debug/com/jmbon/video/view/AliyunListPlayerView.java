package com.jmbon.video.view;

import java.lang.System;

/**
 * 短视频列表播放器
 * @author MilkCoder
 * @date 2023/9/18 9:57
 * @copyright all rights reserved by ManTang
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u0000 m2\u00020\u0001:\u0002mnB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0014\u0010E\u001a\u00020F2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020=0HJ\u001a\u0010I\u001a\u00020F2\b\u0010J\u001a\u0004\u0018\u00010\r2\b\u0010K\u001a\u0004\u0018\u00010\rJ\u001a\u0010L\u001a\u00020F2\b\u0010M\u001a\u0004\u0018\u00010\r2\b\u0010K\u001a\u0004\u0018\u00010\rJ\u000e\u0010N\u001a\u00020F2\u0006\u0010O\u001a\u00020PJ\u0006\u0010Q\u001a\u00020FJ\u0006\u0010R\u001a\u00020FJ\b\u0010S\u001a\u00020FH\u0002J\b\u0010T\u001a\u00020FH\u0003J\b\u0010U\u001a\u00020FH\u0002J\b\u0010V\u001a\u00020FH\u0002J\b\u0010W\u001a\u00020FH\u0002J\b\u0010X\u001a\u00020FH\u0002J\u0010\u0010Y\u001a\u00020F2\b\u0010Z\u001a\u0004\u0018\u00010\rJ\u001a\u0010Y\u001a\u00020F2\b\u0010Z\u001a\u0004\u0018\u00010\r2\b\u0010[\u001a\u0004\u0018\u00010:J\u0006\u0010\\\u001a\u00020FJ\b\u0010]\u001a\u00020FH\u0002J\u0006\u0010^\u001a\u00020FJ\b\u0010_\u001a\u00020FH\u0002J\u0014\u0010`\u001a\u00020F2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020=0HJ\u000e\u0010a\u001a\u00020F2\u0006\u0010b\u001a\u00020\u0013J\u000e\u0010c\u001a\u00020F2\u0006\u0010d\u001a\u00020\u0013J\u0010\u0010e\u001a\u00020F2\b\u0010C\u001a\u0004\u0018\u00010DJ\u000e\u0010f\u001a\u00020F2\u0006\u0010g\u001a\u00020\u0013J\u0010\u0010h\u001a\u00020F2\b\u0010[\u001a\u0004\u0018\u00010:J\u0010\u0010i\u001a\u00020F2\u0006\u0010j\u001a\u00020\tH\u0002J\u0012\u0010k\u001a\u00020F2\b\b\u0002\u0010j\u001a\u00020\tH\u0002J\b\u0010l\u001a\u00020FH\u0002R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\u001a\u001a\u0004\b2\u00103R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010>\u001a\n \u0016*\u0004\u0018\u00010?0?8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bB\u0010\u001a\u001a\u0004\b@\u0010AR\u0010\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006o"}, d2 = {"Lcom/jmbon/video/view/AliyunListPlayerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "correlationTable", "Landroid/util/SparseArray;", "", "getCorrelationTable", "()Landroid/util/SparseArray;", "setCorrelationTable", "(Landroid/util/SparseArray;)V", "isEvent", "", "mAliListPlayer", "Lcom/aliyun/player/AliListPlayer;", "kotlin.jvm.PlatformType", "getMAliListPlayer", "()Lcom/aliyun/player/AliListPlayer;", "mAliListPlayer$delegate", "Lkotlin/Lazy;", "mCurrentPosition", "mGestureDetector", "Landroid/view/GestureDetector;", "mIsLoadingData", "mIsOnBackground", "mIsPause", "mLastStopPosition", "mListPlayerContainer", "Landroid/view/View;", "getMListPlayerContainer", "()Landroid/view/View;", "setMListPlayerContainer", "(Landroid/view/View;)V", "mListPlayerRecyclerView", "Lcom/jmbon/video/view/RecyclerViewEmptySupport;", "mListPlayerTextureView", "Landroid/view/TextureView;", "mPagerLayoutManager", "Lcom/jmbon/video/adapter/PagerLayoutManager;", "mPlayIconImageView", "Landroid/widget/ImageView;", "mRecyclerViewAdapter", "Lcom/jmbon/video/adapter/VideoDetailsItemAdapter;", "getMRecyclerViewAdapter", "()Lcom/jmbon/video/adapter/VideoDetailsItemAdapter;", "mRecyclerViewAdapter$delegate", "mRefreshTextView", "Landroid/widget/TextView;", "mRefreshView", "Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;", "mStsInfo", "Lcom/aliyun/player/source/StsInfo;", "mVideoListBean", "", "Lcom/jmbon/middleware/bean/VideoDetail$VideoData;", "mediaLoader", "Lcom/aliyun/loader/MediaLoader;", "getMediaLoader", "()Lcom/aliyun/loader/MediaLoader;", "mediaLoader$delegate", "onRefreshDataListener", "Lcom/jmbon/video/view/AliyunListPlayerView$OnRefreshDataListener;", "addMoreData", "", "videoListBeanItems", "", "addUrl", "videoUrl", "randomUUID", "addVid", "videoId", "collectEvent", "event", "Lcom/jmbon/middleware/bean/event/VideoCollectEvent;", "destroy", "hideRefresh", "initListPlayer", "initListPlayerView", "initPagerLayoutManager", "initRecyclerView", "initVideoView", "loadMore", "moveTo", "uuid", "stsInfo", "onPauseClick", "pausePlay", "removeAllUrl", "resumePlay", "setData", "setIsEvent", "isE", "setOnBackground", "isOnBackground", "setOnRefreshDataListener", "setRefreshEnable", "isEnable", "setStsInfo", "startPlay", "position", "startShareAnimator", "stopPlay", "Companion", "OnRefreshDataListener", "module-video_debug"})
public final class AliyunListPlayerView extends android.widget.FrameLayout {
    public android.view.View mListPlayerContainer;
    private boolean isEvent = true;
    
    /**
     * play -- pause  icon
     */
    private android.widget.ImageView mPlayIconImageView;
    private android.view.TextureView mListPlayerTextureView;
    private com.jmbon.video.view.RecyclerViewEmptySupport mListPlayerRecyclerView;
    private com.aliyun.player.source.StsInfo mStsInfo;
    private com.jmbon.video.adapter.PagerLayoutManager mPagerLayoutManager;
    private final kotlin.Lazy mRecyclerViewAdapter$delegate = null;
    
    /**
     * 播放器
     */
    private final kotlin.Lazy mAliListPlayer$delegate = null;
    
    /**
     * 预加载
     */
    private final kotlin.Lazy mediaLoader$delegate = null;
    
    /**
     * 手势监听器
     */
    private android.view.GestureDetector mGestureDetector;
    
    /**
     * 播放资源UUID和index关联表
     */
    @org.jetbrains.annotations.NotNull()
    private android.util.SparseArray<java.lang.String> correlationTable;
    
    /**
     * 当前选中位置
     */
    private int mCurrentPosition = 0;
    
    /**
     * 正常滑动，上一个被暂停的位置
     */
    private int mLastStopPosition = -1;
    
    /**
     * 是否在后台
     */
    private boolean mIsOnBackground = false;
    
    /**
     * 是否是暂停
     */
    private boolean mIsPause = false;
    
    /**
     * 刷新View
     */
    private com.scwang.smart.refresh.layout.SmartRefreshLayout mRefreshView;
    
    /**
     * 是否正在刷新
     */
    private boolean mIsLoadingData = false;
    
    /**
     * 刷新数据listener
     */
    private com.jmbon.video.view.AliyunListPlayerView.OnRefreshDataListener onRefreshDataListener;
    private android.widget.TextView mRefreshTextView;
    private java.util.List<com.jmbon.middleware.bean.VideoDetail.VideoData> mVideoListBean;
    @org.jetbrains.annotations.NotNull()
    public static final com.jmbon.video.view.AliyunListPlayerView.Companion Companion = null;
    
    /**
     * 预加载位置, 默认离底部还有5条数据时请求下一页视频列表
     */
    private static final int DEFAULT_PRELOAD_NUMBER = 5;
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getMListPlayerContainer() {
        return null;
    }
    
    public final void setMListPlayerContainer(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    private final com.jmbon.video.adapter.VideoDetailsItemAdapter getMRecyclerViewAdapter() {
        return null;
    }
    
    /**
     * 播放器
     */
    private final com.aliyun.player.AliListPlayer getMAliListPlayer() {
        return null;
    }
    
    /**
     * 预加载
     */
    private final com.aliyun.loader.MediaLoader getMediaLoader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.util.SparseArray<java.lang.String> getCorrelationTable() {
        return null;
    }
    
    public final void setCorrelationTable(@org.jetbrains.annotations.NotNull()
    android.util.SparseArray<java.lang.String> p0) {
    }
    
    public AliyunListPlayerView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    public AliyunListPlayerView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public AliyunListPlayerView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void initVideoView() {
    }
    
    /**
     * 初始化列表播放器
     */
    private final void initListPlayer() {
    }
    
    /**
     * 初始化播放界面
     */
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void initListPlayerView() {
    }
    
    /**
     * 初始化滑动RecyclerView
     */
    private final void initRecyclerView() {
    }
    
    private final void initPagerLayoutManager() {
    }
    
    /**
     * 加载更多
     */
    private final void loadMore() {
    }
    
    /**
     * 播放视频
     */
    private final void startPlay(int position) {
    }
    
    /**
     * 视频暂停/恢复的时候使用，
     */
    public final void onPauseClick() {
    }
    
    /**
     * 设置StsInfo
     */
    public final void setStsInfo(@org.jetbrains.annotations.Nullable()
    com.aliyun.player.source.StsInfo stsInfo) {
    }
    
    public final void setRefreshEnable(boolean isEnable) {
    }
    
    /**
     * 开始播放
     */
    public final void moveTo(@org.jetbrains.annotations.Nullable()
    java.lang.String uuid) {
    }
    
    public final void moveTo(@org.jetbrains.annotations.Nullable()
    java.lang.String uuid, @org.jetbrains.annotations.Nullable()
    com.aliyun.player.source.StsInfo stsInfo) {
    }
    
    /**
     * 添加视频源
     * @date 2023/9/18 11:11
     */
    public final void addUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String videoUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String randomUUID) {
    }
    
    /**
     * 清空视频源
     * @date 2023/9/18 11:11
     */
    public final void removeAllUrl() {
    }
    
    private final void startShareAnimator(int position) {
    }
    
    /**
     * 添加视频
     */
    public final void addVid(@org.jetbrains.annotations.Nullable()
    java.lang.String videoId, @org.jetbrains.annotations.Nullable()
    java.lang.String randomUUID) {
    }
    
    /**
     * 设置播放源
     */
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jmbon.middleware.bean.VideoDetail.VideoData> videoListBeanItems) {
    }
    
    public final void collectEvent(@org.jetbrains.annotations.NotNull()
    com.jmbon.middleware.bean.event.VideoCollectEvent event) {
    }
    
    /**
     * 加载更多数据
     */
    public final void addMoreData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jmbon.middleware.bean.VideoDetail.VideoData> videoListBeanItems) {
    }
    
    public final void hideRefresh() {
    }
    
    /**
     * 停止视频播放
     */
    private final void stopPlay() {
    }
    
    /**
     * activity不可见或者播放页面不可见时调用该方法
     */
    public final void setOnBackground(boolean isOnBackground) {
    }
    
    /**
     * 暂停播放
     */
    private final void pausePlay() {
    }
    
    /**
     * 恢复播放
     */
    private final void resumePlay() {
    }
    
    /**
     * 销毁
     */
    public final void destroy() {
    }
    
    public final void setIsEvent(boolean isE) {
    }
    
    public final void setOnRefreshDataListener(@org.jetbrains.annotations.Nullable()
    com.jmbon.video.view.AliyunListPlayerView.OnRefreshDataListener onRefreshDataListener) {
    }
    
    /**
     * 刷新数据
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/jmbon/video/view/AliyunListPlayerView$OnRefreshDataListener;", "", "onCollection", "", "video", "Lcom/jmbon/middleware/bean/VideoDetail$VideoData;", "onLoadMore", "onRefresh", "module-video_debug"})
    public static abstract interface OnRefreshDataListener {
        
        /**
         * 下拉刷新
         */
        public abstract void onRefresh();
        
        /**
         * 上拉加载
         */
        public abstract void onLoadMore();
        
        /**
         * 收藏操作
         */
        public abstract void onCollection(@org.jetbrains.annotations.NotNull()
        com.jmbon.middleware.bean.VideoDetail.VideoData video);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/jmbon/video/view/AliyunListPlayerView$Companion;", "", "()V", "DEFAULT_PRELOAD_NUMBER", "", "module-video_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}