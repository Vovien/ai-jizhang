package com.tubewiki.home.fragment

import android.view.View
import androidx.core.os.bundleOf
import com.apkdv.mvvmfast.base.ViewModelFragment
import com.apkdv.mvvmfast.ktx.launch
import com.apkdv.mvvmfast.ktx.next
import com.jmbon.middleware.common.CommonViewModel
import com.jmbon.middleware.decoration.GridSpacingItemDecoration
import com.jmbon.middleware.utils.dp
import com.tubewiki.home.adapter.HelpGroupAdapter
import com.tubewiki.home.databinding.FragmentHelpGroupLayoutBinding
import com.tubewiki.home.viewmodel.MainFragmentViewModel

class HelpGroupFragment :
    ViewModelFragment<MainFragmentViewModel, FragmentHelpGroupLayoutBinding>() {

    private val type: Int?
        get() = arguments?.getInt("type")

    private val helpGroupAdapter by lazy {
        HelpGroupAdapter()
    }

    override fun initView(view: View) {
        binding.rvContent.apply {
            addItemDecoration(GridSpacingItemDecoration(spacing = 10.dp, edgeSpacing = 20.dp))
            adapter = helpGroupAdapter
        }
    }

    override fun getData() {
        super.getData()
        launch {
            viewModel.groupItemListFlow.next {
                helpGroupAdapter.setList(this)
            }
        }
        type?.let { viewModel.getHelperGroupType(it) }
    }

    companion object {
        operator fun invoke(type: Int, tabName: String?): HelpGroupFragment {
            val fragment = HelpGroupFragment()
            fragment.arguments = bundleOf("type" to type, "tabName" to tabName)
            return fragment
        }
    }
}