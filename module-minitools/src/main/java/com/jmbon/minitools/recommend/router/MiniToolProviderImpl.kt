package com.jmbon.minitools.recommend.router

import android.app.Activity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.jmbon.middleware.arouter.RouterHub
import com.jmbon.middleware.arouter.service.IMiniToolProvider
import com.jmbon.middleware.utils.navigationWithFinish
import com.jmbon.minitools.advisory.arouter.AdvisoryRouter

/******************************************************************************
 * Description: 小工具模块对外开发路由实现
 *
 * Author: jhg
 *
 * Date: 2023/4/24
 *
 * Copyright: all rights reserved by Mantang.
 *******************************************************************************/
@Route(path = RouterHub.MINI_TOOL_PROVIDER)
class MiniToolProviderImpl : IMiniToolProvider {

    override fun toChooseHome(activity: Activity?, withFinish: Boolean) {
        ARouter.getInstance().build(RecommendRouter.RECOMMEND_CHOOSE_HOME).apply {
            if (withFinish) {
                navigationWithFinish(activity)
            } else {
                navigation()
            }
        }
    }

    /**
     * 跳转到咨询求助页面
     * @param advisoryId: 咨询id
     * @param questionId: 问题id
     * @param question: 问题内容
     */
    override fun toAdvisoryHelp(advisoryId: Int, questionId: Int, question: String) {
        ARouter.getInstance().build(AdvisoryRouter.ADVISORY_HELP)
            .withInt("advisoryId", advisoryId)
            .withInt("questionId", questionId)
            .withString("question", question)
            .navigation()
    }
}