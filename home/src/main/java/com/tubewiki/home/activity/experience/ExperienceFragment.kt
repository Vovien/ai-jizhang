package com.tubewiki.home.activity.experience

import android.graphics.Rect
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.apkdv.mvvmfast.base.ViewModelFragment
import com.apkdv.mvvmfast.ktx.showToast
import com.apkdv.mvvmfast.utils.divider.GridSpacingItemDecoration
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.NetworkUtils
import com.jmbon.middleware.arouter.ArouterUtils
import com.jmbon.middleware.decoration.GridSpaceItemDecoration
import com.jmbon.middleware.decoration.SpaceItemDecoration
import com.jmbon.middleware.extention.dealPage
import com.jmbon.middleware.utils.dp
import com.tubewiki.home.adapter.ExperienceAdapter
import com.tubewiki.home.adapter.TagAdapter
import com.tubewiki.home.databinding.FragmentExperienceBinding
import com.tubewiki.home.viewmodel.ExperienceViewModel


/**
 * 经验页面
 * @author MilkCoder
 * @date 2023/11/23
 * @copyright All copyrights reserved to ManTang.
 */
@Route(path = "/home/experience/fragment")
class ExperienceFragment : ViewModelFragment<ExperienceViewModel, FragmentExperienceBinding>() {

    private val tagAdapter by lazy {
        TagAdapter().apply {
            setOnItemClickListener { adapter, view, position ->
                val selectedPos = data.indexOfFirst { it.isSelected }
                if (selectedPos == position) {
                    return@setOnItemClickListener
                }

                if (selectedPos >= 0) {
                    data[selectedPos].isSelected = false
                    notifyItemChanged(selectedPos)
                }
                data[position].isSelected = true
                notifyItemChanged(position)
                viewModel.currentPage = 1
                viewModel.getExperienceList(data[position].id)
            }
        }
    }

    private val emptyView by lazy {
        View(requireContext()).apply {
            setPadding(0, 8.dp, 0, 0)
        }
    }

    private val experienceAdapter by lazy {
        ExperienceAdapter().apply {
            addHeaderView(emptyView)
        }
    }

    override fun initView(view: View) {
        var statusHeight = BarUtils.getStatusBarHeight()
        if (statusHeight < 24.dp) {
            statusHeight = 32.dp
        }
        binding.stateLayout.setPadding(0, statusHeight, 0, 0)
        initStateLayout(binding.stateLayout)
        binding.apply {
            rvTag.addItemDecoration(SpaceItemDecoration(0, 8))
            rvTag.adapter = tagAdapter
            rvExperience.addItemDecoration(GridSpaceItemDecoration(8.dp, false))
            rvExperience.adapter = experienceAdapter
            // 下拉刷新
            srlRefresh.setOnRefreshListener {
                if (!NetworkUtils.isConnected()) {
                    "请检查网络连接".showToast()
                    binding.srlRefresh.finishRefresh()
                    return@setOnRefreshListener
                }

                startRefresh()
            }

            // 加载更多
            srlRefresh.setOnLoadMoreListener {
                viewModel.currentPage++
                viewModel.getExperienceList(tagAdapter.data.find { it.isSelected }?.id ?: 0)
            }
        }

        experienceAdapter.setOnItemClickListener { _, _, pos ->
            val data = experienceAdapter.getItem(pos)
            ArouterUtils.toExperienceDetailsActivity(data.id)
        }

    }

    override fun initViewModel() {
        super.initViewModel()
        viewModel.apply {
            // 监听经验信息
            viewModel.pageSize = 20
            experienceListLD.observe(this@ExperienceFragment) {
                showContentState()
                binding.srlRefresh.dealPage(
                    viewModel.currentPage,
                    it,
                    experienceAdapter
                )
            }

            // 请求并监听Tag信息
            tagListLD.observe(this@ExperienceFragment) {
                // 刷新后默认选中的还是上次选中的tag
                var lastSelectedIndex = tagAdapter.data.indexOfFirst { item -> item.isSelected }
                if (lastSelectedIndex < 0) {
                    lastSelectedIndex = 0
                }
                if (lastSelectedIndex in 0 until (it?.size ?: 1)) {
                    it?.getOrNull(lastSelectedIndex)?.apply {
                        isSelected = true
                        getExperienceList(id)
                    } ?: run {
                        // 如果tag为空, 需要恢复刷新组件
                        if (binding.srlRefresh.isRefreshing) {
                            binding.srlRefresh.finishRefresh()
                        }
                        if (binding.srlRefresh.isLoading) {
                            binding.srlRefresh.finishLoadMore()
                        }
                    }
                }
                tagAdapter.setList(it)
            }
            getTagList()
        }
    }

    private fun startRefresh() {
        viewModel.apply {
            viewModel.currentPage = 1
            if (viewModel.tagListLD.value.isNullOrEmpty()) {
                getTagList()
            } else {
                viewModel.getExperienceList(tagAdapter.data.find { it.isSelected }?.id ?: 0)
            }
        }
    }

    override fun refreshDataWhenError() {
        if (!NetworkUtils.isConnected()) {
            "请检查网络连接".showToast()
            binding.srlRefresh.finishRefresh()
            return
        }

        super.refreshDataWhenError()
        startRefresh()
    }

}