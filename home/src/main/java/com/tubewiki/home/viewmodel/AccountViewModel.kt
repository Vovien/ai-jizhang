package com.tubewiki.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.apkdv.mvvmfast.ktx.next
import com.jmbon.middleware.common.CommonViewModel
import com.tubewiki.home.api.HomeApi
import com.tubewiki.home.api.JiZhangApi
import com.tubewiki.home.bean.HomeHeaderBean
import com.tubewiki.home.bean.jizhang.BillListBean
import com.tubewiki.home.bean.jizhang.Cycle
import com.tubewiki.home.router.HomeRouter
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class AccountViewModel : CommonViewModel() {

    val firstShowFlow = MutableStateFlow(true)

    /**
     * 首页头部信息
     */
    private val _homeHeaderInfoLD = MutableLiveData<HomeHeaderBean?>()
    val homeHeaderBean: LiveData<HomeHeaderBean?> = _homeHeaderInfoLD

    /**
     * 当前周期
     */
    private val myCycleListFlow = MutableStateFlow<Cycle?>(null)

    /**
     * 账单数据
     */
    val billsFlow = MutableStateFlow(BillListBean())
    var firstPage = true

    private val _isCurrentFlow = MutableStateFlow(true)
    val isCurrentFlow = _isCurrentFlow

    var allPage = 1

    var curPage = 1

    /**
     * 获取我的周期
     * @date 2023/11/16 15:15
     */
    fun myCycleListFlow() =
        launchWithFlow(
            block = {
                JiZhangApi.getMyCycles()
            },
            handleError = false
        ).map { bean ->
            val s = bean.cycles?.find { it.isSelected == 1 } ?: bean.cycles?.getOrNull(0)
            myCycleListFlow.value = s
            s
        }

    /**
     * 获取全部账单数据
     * @date 2023/11/16 15:19
     * @param id 周期Id
     */
    fun getAllBillDetail(id: Int) {
        launchOnlyResult({
            JiZhangApi.getBillList(id, allPage)
        }, {
            // 更新用户数据
            billsFlow.value = it
        }, {
            billsFlow.value = BillListBean()
        }, handleError = false)
    }

    /**
     * 获取当前账单数据
     * @date 2023/11/16 15:19
     */
    fun getCurrentBillDetail() {
        val cycle = myCycleListFlow.value
        launchOnlyResult({
            JiZhangApi.getBillList(cycle?.id ?: 0, curPage)
        }, {
            // 更新用户数据
            billsFlow.value = it
        }, {
            billsFlow.value = BillListBean()
        })
    }

    /**
     * 切换周期
     * @date 2023/11/24 17:19
     * @param isCurrent 是否是当前周期
     */
    fun checkCurrentCycle(isCurrent: Boolean = true) {
        if (firstPage)
            return
        _isCurrentFlow.value = isCurrent
        if (isCurrent) {
            curPage = 1
            getCurrentBillDetail()
        } else {
            allPage = 1
            getAllBillDetail(0)
        }
    }

    /**
     * 跳转到类型详情页面
     * @date 2023/11/24 17:25
     */
    fun toBillListPage(type: Int) {
        if (isCurrentFlow.value) {
            HomeRouter.toBillListPage(type, myCycleListFlow.value?.id ?: 0)
        } else {
            HomeRouter.toBillListPage(type)
        }
    }

    fun resetPage(){
        curPage = 1
        allPage = 1
        billsFlow.value = BillListBean()
    }

    /**
     * 获取头部信息
     */
    fun getHeaderInfo() {
        viewModelScope.launch {
            launchWithFlow({
                HomeApi.getHomeHeaderInfo()
            }, {
                _homeHeaderInfoLD.postValue(null)
            }).next {
                _homeHeaderInfoLD.postValue(this)
            }
        }
    }
}