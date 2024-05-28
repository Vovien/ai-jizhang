package com.tubewiki.home.viewmodel

import com.apkdv.mvvmfast.ktx.showToast
import com.jmbon.middleware.common.CommonViewModel
import com.tubewiki.home.api.JiZhangApi
import com.tubewiki.home.bean.jizhang.Bill
import com.tubewiki.home.bean.jizhang.Cycle
import kotlinx.coroutines.flow.MutableStateFlow

class JiZhangModel : CommonViewModel() {

    private val _myCycleListFlow = MutableStateFlow<List<Cycle>?>(null)
    val myCycleListFlow = _myCycleListFlow

    val localTime = MutableStateFlow<Long>(0)

    /** 定义记账数据 */
    val billFlow = MutableStateFlow(
        Bill(
            type = 1
        )
    )

    fun getCategoryBillList(cycleId: Int, type: Int, page: Int) = launchWithFlow({
        JiZhangApi.getCategoryBillList(cycleId, type, page)
    }, handleError = false)

    /**
     * 删除账单
     * @date 2023/11/21 14:18
     */
    fun delBill(id: Int, onSaveSuccess: () -> Unit) {
        launchOnlyResult({
            JiZhangApi.deleteBill(id = id)
        }, {
            onSaveSuccess()
        }, {
            it.message.showToast()
        }, isShowDialog = true)
    }

    /**
     * 获取账单详情
     * @date 2023/11/21 14:11
     * @param billId 账单Id
     */
    fun getBillDetail(billId: Int) {
        launchOnlyResult({
            JiZhangApi.getBillDetail(billId)
        }, { bean ->
            billFlow.value = bean.bill.copy(input = bean.bill.cost.toString())
        }, {
            it.message.showToast()
        })
    }

    fun myCycleListFlow() {
        launchOnlyResult({
            JiZhangApi.getMyCycles()
        }, { bean ->
            _myCycleListFlow.value = bean.cycles
        })
    }

    fun setDate(date: String, time: Long) {
        val bill = billFlow.value
        localTime.value = time
        billFlow.value = bill.copy(date = date)
    }

    fun setType(type: Int) {
        val bill = billFlow.value
        billFlow.value = bill.copy(type = type)
    }

    fun setCycleId(cycleId: Int) {
        val bill = billFlow.value
        billFlow.value = bill.copy(cycleId = cycleId)
    }

    fun saveBill(id: Int = 0, onSaveSuccess: () -> Unit) {
        val bill = billFlow.value
        launchOnlyResult({
            JiZhangApi.saveBill(
                id = id,
                cost = bill.input,
                date = bill.date,
                cycle_id = bill.cycleId,
                type = bill.type
            )
        }, {
            onSaveSuccess()
        }, {
            it.message.showToast()
        }, isShowDialog = true)
    }
}