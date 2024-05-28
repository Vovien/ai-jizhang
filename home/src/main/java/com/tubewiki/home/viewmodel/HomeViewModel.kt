package com.tubewiki.home.viewmodel

import com.jmbon.middleware.common.CommonViewModel
import com.tubewiki.home.api.HomeApi

/**
 *
 * @author MilkCoder
 * @date 2024/3/19
 * @copyright All copyrights reserved to ManTang.
 */
class HomeViewModel:CommonViewModel() {
    fun index() = launchWithFlow({
        HomeApi.index()
    }, handleError = false)
}