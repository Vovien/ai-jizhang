package com.tubewiki.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.apkdv.mvvmfast.ktx.next
import com.jmbon.middleware.common.CommonViewModel
import com.tubewiki.home.api.HomeApi
import com.tubewiki.home.bean.ItemExperienceBean
import com.tubewiki.home.bean.TagBean
import kotlinx.coroutines.launch

class ExperienceViewModel : CommonViewModel() {
    /**
     * Tab的子标签
     */
    private val _tagListLD = MutableLiveData<List<TagBean>?>()
    val tagListLD: LiveData<List<TagBean>?> = _tagListLD

    /**
     * 经验列表
     */
    private val _experienceListLD = MutableLiveData<List<ItemExperienceBean>?>()
    val experienceListLD: LiveData<List<ItemExperienceBean>?> = _experienceListLD

    /**
     * 获取tag
     * @date 2023/11/24 15:04
     */
    fun getTagList() {
        viewModelScope.launch {
            launchWithFlow(
                {
                    HomeApi.getTagList()
                },
                {
                    _tagListLD.postValue(null)
                }
            ).next {
                _tagListLD.postValue(this)
            }
        }
    }

    /**
     * 获取经验列表
     * @param tagId: 指定tag的id
     */
    fun getExperienceList(tagId: Int) {
        viewModelScope.launch {
            launchWithFlow(
                {
                    HomeApi.getExperienceList(tagId, currentPage, pageSize)
                },
                {
                    _experienceListLD.postValue(null)
                },
                handleError = _experienceListLD.value.isNullOrEmpty()
            ).next {
                _experienceListLD.postValue(this)
            }
        }
    }
}