package com.jmbon.video.adapter;

import java.lang.System;

/**
 * ViewPager效果的LayoutManager
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00112\n\u0010\u0017\u001a\u00060\u0018R\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J$\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\n\u0010\u0017\u001a\u00060\u0018R\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J$\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\n\u0010\u0017\u001a\u00060\u0018R\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010%\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\'\u001a\u00020\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/jmbon/video/adapter/PagerLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/view/View$OnTouchListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "direction", "", "mChildAttachStateChangeListener", "Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;", "mOnViewPagerListener", "Lcom/jmbon/video/listener/OnViewPagerListener;", "mPagerSnapHelper", "Landroidx/recyclerview/widget/PagerSnapHelper;", "mState", "mdy", "clearOnViewPagerListener", "", "init", "onAttachedToWindow", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onLayoutChildren", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "scrollHorizontallyBy", "dx", "scrollVerticallyBy", "dy", "setOnViewPagerListener", "listener", "viewPagerListenerIsNull", "module-video_release"})
public final class PagerLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager implements android.view.View.OnTouchListener {
    private androidx.recyclerview.widget.PagerSnapHelper mPagerSnapHelper;
    private com.jmbon.video.listener.OnViewPagerListener mOnViewPagerListener;
    private int mState = 0;
    private int mdy = 0;
    
    /**
     * 移动方向
     */
    private int direction = 0;
    private final androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener mChildAttachStateChangeListener = null;
    
    public PagerLayoutManager(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    private final void init() {
    }
    
    @java.lang.Override()
    public void onAttachedToWindow(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    /**
     * 判断是否设置了监听
     */
    public final boolean viewPagerListenerIsNull() {
        return false;
    }
    
    /**
     * 监听竖直方向的相对偏移量
     */
    @java.lang.Override()
    public int scrollVerticallyBy(int dy, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
        return 0;
    }
    
    /**
     * 监听水平方向的相对偏移量
     */
    @java.lang.Override()
    public int scrollHorizontallyBy(int dx, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
        return 0;
    }
    
    /**
     * 设置监听
     */
    public final void setOnViewPagerListener(@org.jetbrains.annotations.Nullable()
    com.jmbon.video.listener.OnViewPagerListener listener) {
    }
    
    public final void clearOnViewPagerListener() {
    }
    
    /**
     * 监听ouTouch事件，因为如果从第二个视频滑动到第一个视频(快速连续滑动),
     * onScrollStateChanged是不会触发SCROLL_STATE_IDLE状态的,会导致
     * 第一个视频不会播放的问题,不会调用onPageSelected监听回调。
     * 经反复测试发现,会回调onTouch的事件,所以在这里进行触发
     */
    @java.lang.Override()
    public boolean onTouch(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    /**
     * bug java.lang.IndexOutOfBoundsException: Inconsistency detected. Invalid view holder adapter positionViewHolder
     *
     * https://stackoverflow.com/questions/31759171/recyclerview-and-java-lang-indexoutofboundsexception-inconsistency-detected-in
     */
    @java.lang.Override()
    public void onLayoutChildren(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
}