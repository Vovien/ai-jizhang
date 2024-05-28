package com.tubewiki.home.fragment

import android.content.Context
import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import androidx.core.view.isVisible
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.viewpager.widget.ViewPager
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.apkdv.mvvmfast.base.DataBindingFragment
import com.apkdv.mvvmfast.glide.GlideUtil
import com.apkdv.mvvmfast.ktx.netCatch
import com.apkdv.mvvmfast.ktx.next
import com.apkdv.mvvmfast.ktx.setTextStyle
import com.apkdv.mvvmfast.ktx.started
import com.apkdv.mvvmfast.utils.StatusBarCompat
import com.blankj.utilcode.util.ScreenUtils
import com.gyf.immersionbar.ImmersionBar
import com.jmbon.middleware.adapter.ViewPagerStateAdapter
import com.jmbon.middleware.arouter.ArouterUtils
import com.jmbon.middleware.bean.CommonBanner
import com.jmbon.middleware.bury.BuryHelper
import com.jmbon.middleware.bury.event.ClickEventEnum
import com.jmbon.middleware.common.CommonViewModel
import com.jmbon.middleware.extention.toColorInt
import com.jmbon.middleware.utils.BannerHelper
import com.jmbon.middleware.utils.MobAnalysisUtils
import com.jmbon.middleware.utils.TagConstant
import com.jmbon.middleware.utils.UMEventKey
import com.jmbon.middleware.utils.dp
import com.jmbon.middleware.utils.init
import com.jmbon.middleware.utils.isNotNullEmpty
import com.qmuiteam.qmui.kotlin.onClick
import com.tubewiki.home.R
import com.tubewiki.home.adapter.HomeHelpGroupAdapter
import com.tubewiki.home.adapter.HomeQuestionBoxAdapter
import com.tubewiki.home.adapter.HomeTubeStepAdapter
import com.tubewiki.home.bean.HomeBean
import com.tubewiki.home.databinding.FragmentHomeBinding
import com.tubewiki.home.viewmodel.HomeViewModel
import com.youth.banner.adapter.BannerImageAdapter
import com.youth.banner.holder.BannerImageHolder
import com.youth.banner.indicator.CircleIndicator
import net.lucode.hackware.magicindicator.MagicIndicator
import net.lucode.hackware.magicindicator.ViewPagerHelper
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ColorTransitionPagerTitleView
import kotlin.math.abs

/**
 * 首页
 * @author MilkCoder
 * @date 2024/3/19
 * @copyright All copyrights reserved to ManTang.
 */
@Route(path = "/home/fragment")
class HomeFragment : DataBindingFragment<HomeViewModel, FragmentHomeBinding>() {

    val qaAdapter by lazy { HomeQuestionBoxAdapter() }
    val tubeStepAdapter by lazy { HomeTubeStepAdapter() }

    /**
     * 好孕互助群Adapter
     */
    private val helpGroupAdapter by lazy {
        HomeHelpGroupAdapter()
    }

    var homeBean: HomeBean? = null
    var groupName: String = "好孕互助群"

    private var contentHeight = 0
    override fun initView(view: View) {
        var statusHeight = ImmersionBar.getStatusBarHeight(this)
        if (statusHeight == 0) {
            statusHeight = 32.dp
        }
        binding.tvTitle.minHeight = statusHeight + 44.dp
        initStateLayout(binding.stateLayout)
        val maxScroll = (174 - 88f).dp().toFloat()
        binding.nsvContent.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
            if (contentHeight == 0) {
                contentHeight = binding.llContent.measuredHeight + 52.dp
            }
            val scale = abs(scrollY) / maxScroll
            if (scale > 0.3) {
                binding.tvTitle.visibility = View.VISIBLE
                binding.ivJmbon.isClickable = false
            } else {
                binding.ivJmbon.isClickable = true
                binding.tvTitle.visibility = View.GONE
            }
            binding.tvTitle.alpha = scale

            if (scale > 0.7) {
                StatusBarCompat.setLightStatus(activity?.window)
            } else {
                StatusBarCompat.setDarkStatus(activity?.window)
            }

            if (abs(scrollY) >= contentHeight) {
                binding.tvTitle.text = groupName
                binding.indicator2.isVisible = true
            } else {
                binding.tvTitle.text = "试管百科"
                binding.indicator2.isVisible = false
            }
        })

        tubeStepAdapter.setOnItemClickListener { adapter, view, postion ->
            ARouter.getInstance().build("/home/activity/tube_step")
                .withInt(TagConstant.COLUMN_ID, tubeStepAdapter.getItem(postion).id).navigation()
        }

        initRecyclerview()
    }

    private fun initRecyclerview() {


        binding.recycleTube.apply {
            init(
                tubeStepAdapter,
                layoutManager = GridLayoutManager(activity, 2),
                10f,
                vertical = false,
                showEnd = true
            )
        }


        qaAdapter.setOnItemClickListener { adapter, view, position ->
            var item = qaAdapter.getItem(position)
            if (item.id == 0) {
                //更多
                ARouter.getInstance().build("/home/activity/common_question").navigation()
                MobAnalysisUtils.mInstance.sendEvent(UMEventKey.Event_HomePage_8Icon_Click)
            } else {
                ArouterUtils.toArticleColumnDetailActivity(item.id)

                MobAnalysisUtils.mInstance.sendEvent(
                    UMEventKey.Event_HomePage_CommonProblem_Icon_Click, mutableMapOf(
                        "IconName" to "${item.iconName}",
                        "Index" to "$position",
                        "itemId" to "${item.id}"
                    )
                )
            }
        }

    }

    override fun getData() {
        super.getData()

        started {
            CommonViewModel.commonBannerFlow.next {
                binding.banner.isVisible = this?.banners.isNotNullEmpty()
                binding.banner.indicator = CircleIndicator(context)
                // 设置Banner的适配器
                binding.banner.setAdapter(object : BannerImageAdapter<CommonBanner>(this?.banners) {
                    override fun onBindView(
                        holder: BannerImageHolder?,
                        data: CommonBanner?,
                        position: Int,
                        size: Int
                    ) {
                        holder?.imageView?.let {
                            GlideUtil.getInstance()
                                .loadUrlRadius(
                                    it,
                                    data?.img,
                                    12.dp,
                                    R.drawable.icon_topic_placeholder
                                )
                        }
                        holder?.imageView?.setOnClickListener {
                            data?.let {
                                BannerHelper.onClick(
                                    CommonBanner(
                                        item_id = data.item_id,
                                        item_type = data.item_type,
                                        identity = data.identity
                                    )
                                )
                                BuryHelper.addEvent(ClickEventEnum.EVENT_CLICK_COMMON_BANNER.value)
                            }
                        }
                    }
                }, true)
            }
        }

        started {
            viewModel.index().netCatch {
                showErrorState()
            }.next {
                homeBean = this
                showContentState()
                initTabData(this.helperGroupList)
                homeBean?.apply {
                    helpGroupAdapter.setList(groupList)
                    qaAdapter.setNewInstance(topicList)
                    tubeStepAdapter.setNewInstance(tubeList)
                }


            }

        }
    }

    private fun initTabData(bean: HomeBean.HelperGroupTypeBean?) {
        if (bean == null || bean.items.isNullOrEmpty()) {
            binding.tvGroupTitle.isVisible = false
            binding.indicator.isVisible = false
            binding.viewPager.isVisible = false
        } else {
            groupName = bean.title
            binding.tvGroupTitle.text = bean.title
            initTabLayout(binding.indicator, bean.items)
            initTabLayout(binding.indicator2, bean.items)
            initViewPager(bean.items)
        }
    }

    private fun initTabLayout(indicator: MagicIndicator, tabList: List<HomeBean.Item>) {
        val commonNavigator = CommonNavigator(context)
        commonNavigator.adapter = object : CommonNavigatorAdapter() {
            override fun getCount(): Int {
                return tabList.size
            }

            override fun getTitleView(context: Context, index: Int): IPagerTitleView {
                return object : ColorTransitionPagerTitleView(context) {
                    override fun onLeave(
                        index: Int,
                        totalCount: Int,
                        leavePercent: Float,
                        leftToRight: Boolean
                    ) {
                        super.onLeave(index, totalCount, leavePercent, leftToRight)
                        setTextStyle(Typeface.NORMAL)
                    }

                    override fun onEnter(
                        index: Int,
                        totalCount: Int,
                        enterPercent: Float,
                        leftToRight: Boolean
                    ) {
                        super.onEnter(index, totalCount, enterPercent, leftToRight)
                        setTextStyle(Typeface.BOLD)
                    }
                }.apply {
                    minimumWidth = ScreenUtils.getScreenWidth() / count
                    gravity = Gravity.CENTER
                    textSize = 16f
                    normalColor = R.color.color_7F7F7F.toColorInt()
                    selectedColor = R.color.color_5384FF.toColorInt()
                    text = tabList[index].subTitle
                    onClick {
                        binding.viewPager.currentItem = index
                    }
                }
            }

            override fun getIndicator(context: Context): IPagerIndicator {
                val indicator = LinePagerIndicator(context)
                indicator.lineWidth = 20.dp.toFloat()
                indicator.lineHeight = 2.dp.toFloat()
                indicator.setColors(R.color.color_5384FF.toColorInt())
                indicator.mode = LinePagerIndicator.MODE_MATCH_EDGE
                return indicator
            }
        }
        indicator.navigator = commonNavigator
        ViewPagerHelper.bind(indicator, binding.viewPager)
    }

    private fun initViewPager(tabList: List<HomeBean.Item>) {
        binding.viewPager.offscreenPageLimit = tabList.size
        binding.viewPager.adapter = ViewPagerStateAdapter(
            arrayListOf<Fragment>().apply {
                for (i in tabList.indices) {
                    add(HelpGroupFragment(tabList[i].type, tabList[i].subTitle))
                }
            },
            childFragmentManager
        )
        binding.viewPager.addOnPageChangeListener(object :
            ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int,
            ) {
            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {}
        })
    }

    override fun refreshDataWhenError() {
        super.refreshDataWhenError()
        getData()
    }
}