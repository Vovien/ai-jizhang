package com.jmbon.video.view;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/video/details/new/fragment")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0016J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\'H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e\u00a8\u0006)"}, d2 = {"Lcom/jmbon/video/view/VideoDetailNewFragment;", "Lcom/apkdv/mvvmfast/base/ViewModelFragment;", "Lcom/jmbon/video/viewmodel/VideoDetailsViewModel;", "Lcom/jmbon/video/databinding/FragmentVideoDetailNewBinding;", "()V", "mListPlayerView", "Lcom/jmbon/video/view/AliyunListPlayerView;", "getMListPlayerView", "()Lcom/jmbon/video/view/AliyunListPlayerView;", "mListPlayerView$delegate", "Lkotlin/Lazy;", "mNetWatchDog", "Lcom/jmbon/video/util/NetWatchdog;", "getMNetWatchDog", "()Lcom/jmbon/video/util/NetWatchdog;", "mNetWatchDog$delegate", "beforeViewInit", "", "collect", "video", "Lcom/jmbon/middleware/bean/VideoDetail$VideoData;", "collectEvent", "event", "Lcom/jmbon/middleware/bean/event/VideoCollectEvent;", "commonEvent", "Lcom/jmbon/middleware/bean/event/CommonEventHub$VideoPageEvent;", "getData", "initListener", "initView", "view", "Landroid/view/View;", "initViewModel", "onDestroyView", "onLoadMore", "onPause", "onRefresh", "onResume", "pullVideoList", "isRefresh", "", "MyOnRefreshListener", "module-video_release"})
public final class VideoDetailNewFragment extends com.apkdv.mvvmfast.base.ViewModelFragment<com.jmbon.video.viewmodel.VideoDetailsViewModel, com.jmbon.video.databinding.FragmentVideoDetailNewBinding> {
    private final kotlin.Lazy mListPlayerView$delegate = null;
    private final kotlin.Lazy mNetWatchDog$delegate = null;
    
    public VideoDetailNewFragment() {
        super();
    }
    
    private final com.jmbon.video.view.AliyunListPlayerView getMListPlayerView() {
        return null;
    }
    
    private final com.jmbon.video.util.NetWatchdog getMNetWatchDog() {
        return null;
    }
    
    @java.lang.Override()
    public void beforeViewInit() {
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void initListener() {
    }
    
    @java.lang.Override()
    public void getData() {
    }
    
    private final void pullVideoList(boolean isRefresh) {
    }
    
    @java.lang.Override()
    public void initViewModel() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void collectEvent(@org.jetbrains.annotations.NotNull()
    com.jmbon.middleware.bean.event.VideoCollectEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void commonEvent(@org.jetbrains.annotations.NotNull()
    com.jmbon.middleware.bean.event.CommonEventHub.VideoPageEvent event) {
    }
    
    private final void collect(com.jmbon.middleware.bean.VideoDetail.VideoData video) {
    }
    
    private final void onRefresh() {
    }
    
    private final void onLoadMore() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/jmbon/video/view/VideoDetailNewFragment$MyOnRefreshListener;", "Lcom/jmbon/video/view/AliyunListPlayerView$OnRefreshDataListener;", "videoDetailNewFragment", "Lcom/jmbon/video/view/VideoDetailNewFragment;", "(Lcom/jmbon/video/view/VideoDetailNewFragment;)V", "weakReference", "Ljava/lang/ref/WeakReference;", "onCollection", "", "video", "Lcom/jmbon/middleware/bean/VideoDetail$VideoData;", "onLoadMore", "onRefresh", "module-video_release"})
    static final class MyOnRefreshListener implements com.jmbon.video.view.AliyunListPlayerView.OnRefreshDataListener {
        private final java.lang.ref.WeakReference<com.jmbon.video.view.VideoDetailNewFragment> weakReference = null;
        
        public MyOnRefreshListener(@org.jetbrains.annotations.NotNull()
        com.jmbon.video.view.VideoDetailNewFragment videoDetailNewFragment) {
            super();
        }
        
        @java.lang.Override()
        public void onRefresh() {
        }
        
        @java.lang.Override()
        public void onLoadMore() {
        }
        
        @java.lang.Override()
        public void onCollection(@org.jetbrains.annotations.NotNull()
        com.jmbon.middleware.bean.VideoDetail.VideoData video) {
        }
    }
}