package com.jmbon.video.view;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/video/details/fragment")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020@H\u0007J\n\u0010A\u001a\u0004\u0018\u00010BH\u0002J\u0010\u0010C\u001a\u00020=2\u0006\u0010D\u001a\u00020\u0006H\u0002J\b\u0010E\u001a\u00020=H\u0016J\u000e\u0010F\u001a\u00020=2\u0006\u0010G\u001a\u00020\u0006J\b\u0010H\u001a\u00020=H\u0002J\b\u0010I\u001a\u00020=H\u0003J\u0010\u0010J\u001a\u00020=2\u0006\u0010K\u001a\u00020BH\u0016J\b\u0010L\u001a\u00020=H\u0016J\b\u0010M\u001a\u00020=H\u0016J\b\u0010N\u001a\u00020=H\u0016J\u0006\u0010O\u001a\u00020=J\b\u0010P\u001a\u00020=H\u0016J\b\u0010Q\u001a\u00020=H\u0002J\b\u0010R\u001a\u00020=H\u0002J\b\u0010S\u001a\u00020=H\u0002J\u0018\u0010T\u001a\u00020=2\u0006\u0010U\u001a\u00020\u00152\u0006\u0010V\u001a\u00020WH\u0002J\u0012\u0010X\u001a\u00020=2\b\b\u0002\u0010U\u001a\u00020\u0015H\u0002J\b\u0010Y\u001a\u00020=H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR#\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\"\u001a\n \u000f*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b$\u0010%R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\u0013\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020-X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0011\u00102\u001a\u000203\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001b\u00106\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010\u0013\u001a\u0004\b7\u00108R\u000e\u0010:\u001a\u00020;X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006Z"}, d2 = {"Lcom/jmbon/video/view/VideoDetailsFragment;", "Lcom/apkdv/mvvmfast/base/ViewModelFragment;", "Lcom/jmbon/video/viewmodel/VideoDetailsViewModel;", "Lcom/jmbon/video/databinding/FragmentVideoDetailsBinding;", "()V", "first", "", "imageCoverView", "Landroid/widget/ImageView;", "getImageCoverView", "()Landroid/widget/ImageView;", "setImageCoverView", "(Landroid/widget/ImageView;)V", "listPlayer", "Lcom/aliyun/player/AliPlayer;", "kotlin.jvm.PlatformType", "getListPlayer", "()Lcom/aliyun/player/AliPlayer;", "listPlayer$delegate", "Lkotlin/Lazy;", "mCurPos", "", "mGestureDetector", "Landroid/view/GestureDetector;", "mIsPause", "mNetWatchDog", "Lcom/jmbon/video/util/NetWatchdog;", "getMNetWatchDog", "()Lcom/jmbon/video/util/NetWatchdog;", "mNetWatchDog$delegate", "mTimer", "Ljava/util/Timer;", "mViewPagerImpl", "Landroidx/recyclerview/widget/RecyclerView;", "mediaLoader", "Lcom/aliyun/loader/MediaLoader;", "getMediaLoader", "()Lcom/aliyun/loader/MediaLoader;", "mediaLoader$delegate", "pageAdapter", "Lcom/jmbon/video/adapter/VideoDetailsItemAdapter;", "getPageAdapter", "()Lcom/jmbon/video/adapter/VideoDetailsItemAdapter;", "pageAdapter$delegate", "playBinding", "Lcom/jmbon/video/databinding/LayoutListPlayerViewBinding;", "getPlayBinding", "()Lcom/jmbon/video/databinding/LayoutListPlayerViewBinding;", "setPlayBinding", "(Lcom/jmbon/video/databinding/LayoutListPlayerViewBinding;)V", "seekChangeListener", "Lcom/jmbon/video/widget/seekbar/OnSeekChangeListener;", "getSeekChangeListener", "()Lcom/jmbon/video/widget/seekbar/OnSeekChangeListener;", "statusHeight", "getStatusHeight", "()I", "statusHeight$delegate", "viewPageChangeCallback", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "beforeViewInit", "", "commonEvent", "event", "Lcom/jmbon/middleware/bean/event/CommonEventHub$VideoPageEvent;", "currentItemView", "Landroid/view/View;", "geAllVideoList", "isRefresh", "getData", "hindVideoControl", "hind", "initListPlayer", "initListPlayerView", "initView", "view", "initViewModel", "onDestroyView", "onPause", "onPauseClick", "onResume", "pausePlay", "removeVideoContainer", "resumePlay", "startPlay", "position", "data", "Lcom/jmbon/middleware/bean/VideoDetail$VideoData;", "startShareAnimator", "stopPlay", "module-video_debug"})
public final class VideoDetailsFragment extends com.apkdv.mvvmfast.base.ViewModelFragment<com.jmbon.video.viewmodel.VideoDetailsViewModel, com.jmbon.video.databinding.FragmentVideoDetailsBinding> {
    
    /**
     * 当前播放位置
     */
    private int mCurPos = -1;
    private androidx.recyclerview.widget.RecyclerView mViewPagerImpl;
    private boolean first = true;
    
    /**
     * 是否是暂停
     */
    private boolean mIsPause = false;
    private final kotlin.Lazy listPlayer$delegate = null;
    private final kotlin.Lazy mediaLoader$delegate = null;
    
    /**
     * 手势监听器
     */
    private android.view.GestureDetector mGestureDetector;
    public com.jmbon.video.databinding.LayoutListPlayerViewBinding playBinding;
    private final kotlin.Lazy mNetWatchDog$delegate = null;
    private final kotlin.Lazy statusHeight$delegate = null;
    private java.util.Timer mTimer;
    private final kotlin.Lazy pageAdapter$delegate = null;
    private final androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback viewPageChangeCallback = null;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView imageCoverView;
    @org.jetbrains.annotations.NotNull()
    private final com.jmbon.video.widget.seekbar.OnSeekChangeListener seekChangeListener = null;
    
    public VideoDetailsFragment() {
        super();
    }
    
    private final com.aliyun.player.AliPlayer getListPlayer() {
        return null;
    }
    
    private final com.aliyun.loader.MediaLoader getMediaLoader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jmbon.video.databinding.LayoutListPlayerViewBinding getPlayBinding() {
        return null;
    }
    
    public final void setPlayBinding(@org.jetbrains.annotations.NotNull()
    com.jmbon.video.databinding.LayoutListPlayerViewBinding p0) {
    }
    
    private final com.jmbon.video.util.NetWatchdog getMNetWatchDog() {
        return null;
    }
    
    private final int getStatusHeight() {
        return 0;
    }
    
    @java.lang.Override()
    public void beforeViewInit() {
    }
    
    private final com.jmbon.video.adapter.VideoDetailsItemAdapter getPageAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void initViewModel() {
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getImageCoverView() {
        return null;
    }
    
    public final void setImageCoverView(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    private final void startPlay(int position, com.jmbon.middleware.bean.VideoDetail.VideoData data) {
    }
    
    private final void geAllVideoList(boolean isRefresh) {
    }
    
    @java.lang.Override()
    public void getData() {
    }
    
    private final void startShareAnimator(int position) {
    }
    
    /**
     * 视频暂停/恢复的时候使用，
     */
    public final void onPauseClick() {
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
     * 停止视频播放
     */
    private final void stopPlay() {
    }
    
    private final void initListPlayer() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jmbon.video.widget.seekbar.OnSeekChangeListener getSeekChangeListener() {
        return null;
    }
    
    public final void hindVideoControl(boolean hind) {
    }
    
    private final android.view.View currentItemView() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void initListPlayerView() {
    }
    
    private final void removeVideoContainer() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void commonEvent(@org.jetbrains.annotations.NotNull()
    com.jmbon.middleware.bean.event.CommonEventHub.VideoPageEvent event) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}