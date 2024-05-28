package com.yxbabe.aijizhang.activity

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.KeyEvent
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.apkdv.mvvmfast.base.ViewModelActivity
import com.apkdv.mvvmfast.ktx.launch
import com.apkdv.mvvmfast.ktx.netCatch
import com.apkdv.mvvmfast.ktx.next
import com.apkdv.mvvmfast.ktx.showToast
import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.Utils
import com.gyf.immersionbar.ImmersionBar
import com.jmbon.middleware.arouter.service.IHomeProvider
import com.jmbon.middleware.bean.event.UserLoginEvent
import com.jmbon.middleware.common.CommonViewModel
import com.jmbon.middleware.config.Constant
import com.jmbon.middleware.extend.AppRuntimeScope
import com.jmbon.middleware.extention.setTextColor
import com.jmbon.middleware.extention.toColorInt
import com.jmbon.middleware.utils.logInToIntercept
import com.jmbon.middleware.valid.action.Action
import com.qmuiteam.qmui.kotlin.onClick
import com.umeng.analytics.MobclickAgent
import com.yxbabe.aijizhang.R
import com.yxbabe.aijizhang.adapter.ViewPagerFragmentStateAdapter
import com.yxbabe.aijizhang.databinding.ActivityMainBinding
import com.yxbabe.aijizhang.viewmodel.MainViewModel
import kotlinx.coroutines.ObsoleteCoroutinesApi
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

@ObsoleteCoroutinesApi
@Route(path = "/app/main")
class MainActivity : ViewModelActivity<MainViewModel, ActivityMainBinding>() {

    init {
        //绑定AppRuntimeScope
        lifecycle.addObserver(AppRuntimeScope)
    }

    /**
     * 审核模式展示的
     */
    private val auditFragmentList by lazy {
        arrayListOf(
            ARouter.getInstance().build("/home/audit/fragment").navigation() as Fragment,
            ARouter.getInstance().build("/mine/main/fragment").navigation() as Fragment,
        )
    }

    /**
     * oppo展示的
     */
    private val oppoFragmentList by lazy {
        arrayListOf(
            ARouter.getInstance().build("/home/audit/fragment").navigation() as Fragment,
            ARouter.getInstance().build("/knowledge/fragment").navigation() as Fragment,
            ARouter.getInstance().build("/mine/main/fragment").navigation() as Fragment,
        )
    }

    /**
     * 正常展示
     */
    private val fragmentList by lazy {
        arrayListOf(
            ARouter.getInstance().build("/home/fragment").navigation() as Fragment,
            ARouter.getInstance().build("/home/account/fragment").navigation() as Fragment,
            ARouter.getInstance().build("/home/experience/fragment").navigation() as Fragment,
            ARouter.getInstance().build("/mine/main/fragment").navigation() as Fragment,
        )
    }

    override fun beforeViewInit() {
        super.beforeViewInit()
        EventBus.getDefault().register(this)
        ImmersionBar.with(this@MainActivity).transparentStatusBar()
            .navigationBarColorInt(Color.WHITE).statusBarDarkFont(true).init()
        ActivityUtils.finishAllActivitiesExceptNewest()
    }

    override fun onDestroy() {
        EventBus.getDefault().unregister(this)
        super.onDestroy()
    }

    override fun initView(savedInstanceState: Bundle?) {
        initStateLayout(binding.stateLayout)
        binding.rbHome.setTextColor(
            state = android.R.attr.state_checked,
            falseTextColor = R.color.color_BFBFBF.toColorInt(),
            trueTextColor = R.color.color_262626.toColorInt()
        )
        binding.rbKnowledge.setTextColor(
            state = android.R.attr.state_checked,
            falseTextColor = R.color.color_BFBFBF.toColorInt(),
            trueTextColor = R.color.color_262626.toColorInt()
        )
        binding.rbJoinGroup.setTextColor(
            state = android.R.attr.state_checked,
            falseTextColor = R.color.color_BFBFBF.toColorInt(),
            trueTextColor = R.color.color_262626.toColorInt()
        )
        binding.rbMine.setTextColor(
            state = android.R.attr.state_checked,
            falseTextColor = R.color.color_BFBFBF.toColorInt(),
            trueTextColor = R.color.color_262626.toColorInt()
        )

        binding.flRightAdd.onClick {
            Action {
                ARouter.getInstance().navigation(IHomeProvider::class.java).toJiZhangPage()
            }.logInToIntercept()
        }

        binding.flAdd.onClick {
            Action {
                ARouter.getInstance().navigation(IHomeProvider::class.java).toJiZhangPage()
            }.logInToIntercept()

        }
    }

    override fun getData() {
        launch {
            viewModel.generalConf().netCatch {
                // 如果获取配置失败需要重新获取
                Constant.isAuditMode = false
                showErrorState()
            }.next {
                // 赋值全局配置
                CommonViewModel.configFlow.value = this
                Constant.enterArticleColumnDetailCount = 0
                Constant.enterArticleDetailCount = -1
                Constant.enterExperienceDetailCount = -1
                // 是否开启审核模式总开关。
                Constant.isAuditMode = isAuditMode == 1
                binding.rbKnowledge.isVisible = true
                binding.rbJoinGroup.isVisible = true
                binding.viewPage.apply {
                    adapter = ViewPagerFragmentStateAdapter(fragmentList, this@MainActivity)
                    orientation = ViewPager2.ORIENTATION_HORIZONTAL
                    isUserInputEnabled = false
                    offscreenPageLimit = fragmentList.size
                    registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                        override fun onPageSelected(position: Int) {
                            super.onPageSelected(position)
                            when (position) {
                                0 -> {
                                    binding.rbHome.isChecked = true
                                    binding.rbKnowledge.isChecked = false
                                    binding.rbJoinGroup.isChecked = false
                                    binding.rbMine.isChecked = false
                                }

                                1 -> {
                                    binding.rbHome.isChecked = false
                                    binding.rbJoinGroup.isChecked = false
                                    binding.rbKnowledge.isChecked = true
                                    binding.rbMine.isChecked = false
                                }

                                2 -> {
                                    binding.rbHome.isChecked = false
                                    binding.rbKnowledge.isChecked = false
                                    binding.rbJoinGroup.isChecked = true
                                    binding.rbMine.isChecked = false
                                }

                                3 -> {
                                    binding.rbHome.isChecked = false
                                    binding.rbKnowledge.isChecked = false
                                    binding.rbJoinGroup.isChecked = false
                                    binding.rbMine.isChecked = true
                                }
                            }
                        }
                    })

                    (getChildAt(0) as RecyclerView).overScrollMode =
                        RecyclerView.OVER_SCROLL_NEVER
                }
                binding.rbHome.setOnClickListener {
                    if (binding.viewPage.currentItem != 0) {
                        binding.viewPage.setCurrentItem(0, false)
                    }
                }
                binding.rbKnowledge.setOnClickListener {
                    if (binding.viewPage.currentItem != 1) {
                        binding.viewPage.setCurrentItem(1, false)
                    }
                }
                binding.rbJoinGroup.setOnClickListener {
                    if (binding.viewPage.currentItem != 2) {
                        binding.viewPage.setCurrentItem(2, false)
                    }
                }
                binding.rbMine.setOnClickListener {
                    Action {
                        binding.viewPage.setCurrentItem(3, false)
                    }.logInToIntercept()
                    if (!Constant.isLogin) {
                        binding.rbMine.isChecked = false
                    }

                }
                showContentState()
                binding.viewPage.setCurrentItem(0, false)
            }
        }
    }

    override fun refreshDataWhenError() {
        super.refreshDataWhenError()
        getData()
    }


    private var isExit: Boolean = false

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {

        if (keyCode == KeyEvent.KEYCODE_BACK) {

            val handler = Handler()
            if ((!isExit)) {
                isExit = true
                "再按一次退出".showToast()
                handler.postDelayed({ isExit = false }, (1000 * 2).toLong()) //2秒后没按就取消
            } else {
                MobclickAgent.onKillProcess(Utils.getApp())
                finish()
            }
        }
        return false
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun loginOutEvent(event: UserLoginEvent) {

        if (!event.login) {
            //注销或退出的时候回到首页
            binding.viewPage.setCurrentItem(0, false)
        }
    }
}