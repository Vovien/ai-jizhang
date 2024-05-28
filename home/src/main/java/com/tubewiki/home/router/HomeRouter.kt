package com.tubewiki.home.router

import android.app.Activity
import android.content.Context
import com.alibaba.android.arouter.launcher.ARouter
import com.tubewiki.home.activity.jizhang.ChooseHospitalActivity.Companion.CHOOSE_FINISH_CODE

/******************************************************************************
 * Description: Home模块的路由中心
 *
 * Author: jhg
 *
 * Date: 2023/3/13
 *
 * Copyright: all rights reserved by Mantang.
 *******************************************************************************/
object HomeRouter {

    /**
     * 生育问题列表
     */
    const val HOME_FERTILITY_PROBLEM_LIST = "/home/fertilityProblemList"

    /**
     * 选择城市
     */
    const val HOME_CHOOSE_CITY = "/home/chooseCity"

    /**
     * 搜索城市
     */
    const val HOME_SEARCH_CITY = "/home/searchCity"

    /**
     * 小工具列表
     */
    const val HOME_TOOL_LIST = "/home/miniprograms/activity"

    /**
     * 获取方案详情页
     */
    const val HOME_GET_SCHEME_DETAIL = "/home/getSchemeDetail"

    /**
     * 问题分类列表
     */
    const val HOME_QUESTION_CATEGORY = "/home/questionCategory"

    /**
     * 跳转到生育问题列表
     */
    fun toFertilityProblemList(categoryId: Int) {
        ARouter.getInstance().build(HOME_FERTILITY_PROBLEM_LIST)
            .withInt("categoryId", categoryId)
            .navigation()
    }

    /**
     * 跳转到选择城市页面
     */
    fun toChooseCity(isGlobalConfig: Boolean = true) {
        ARouter.getInstance().build(HOME_CHOOSE_CITY)
            .withBoolean("isGlobalConfig", isGlobalConfig)
            .navigation()
    }

    /**
     * 跳转到搜索城市页面
     */
    fun toSearchCity() {
        ARouter.getInstance().build(HOME_SEARCH_CITY)
            .navigation()
    }

    /**
     * 跳转到小工具列表
     */
    fun toToolList() {
        ARouter.getInstance().build(HOME_TOOL_LIST)
            .navigation()
    }

    /**
     * 跳转到获取方案详情页
     */
    fun toGetSchemeDetail() {
        ARouter.getInstance().build(HOME_GET_SCHEME_DETAIL).navigation()
    }

    /**
     * 跳转到问题分类列表
     */
    fun toQuestionCategory(categoryId: Int) {
        ARouter.getInstance().build(HOME_QUESTION_CATEGORY)
            .withInt("categoryId", categoryId)
            .navigation()
    }

    fun toJiZhangPage(billId: Int = 0) {
        ARouter.getInstance().build("/home/jizhang/activity")
            .withInt("billId", billId)
            .navigation()
    }

    fun toCycleSettingPage(cycleId: Int = 0, fromSwitch: Boolean = false) {
        ARouter.getInstance().build("/home/cycle/setting/activity")
            .withInt("cycleId", cycleId)
            .withBoolean("fromSwitch", fromSwitch)
            .navigation()
    }

    fun toBillListPage(type: Int, cyId: Int = 0) {
        ARouter.getInstance().build("/home/bill/list/activity")
            .withInt("type", type)
            .withInt("cycleId", cyId)
            .navigation()
    }

    fun toCycleSwitchPage() {
        ARouter.getInstance().build("/home/cycle/switch/activity")
            .navigation()
    }

    fun toChooseHospitalPage(mContext: Activity, hospitalId: Int = 0) {
        ARouter.getInstance().build("/home/choose/hospital/activity")
            .withInt("hospitalId", hospitalId)
            .navigation(mContext, CHOOSE_FINISH_CODE)
    }
}