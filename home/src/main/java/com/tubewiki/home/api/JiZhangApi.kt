package com.tubewiki.home.api

import com.apkdv.mvvmfast.network.entity.EmptyData
import com.jmbon.middleware.config.Constant
import com.jmbon.middleware.config.network.HttpV2
import com.tubewiki.home.bean.jizhang.BillBean
import com.tubewiki.home.bean.jizhang.BillListBean
import com.tubewiki.home.bean.jizhang.CategoryBillBean
import com.tubewiki.home.bean.jizhang.CycleBean
import com.tubewiki.home.bean.jizhang.CycleDetailBean
import com.tubewiki.home.bean.jizhang.HospitalListBean
import com.tubewiki.home.bean.jizhang.MyCyclesBean
import com.tubewiki.home.bean.jizhang.PhysicalStatusBean
import com.tubewiki.home.bean.jizhang.ProvinceListBean
import rxhttp.wrapper.param.toResponse

/**
 * 记账API
 * @author MilkCoder
 * @date 2023/11/16
 * @copyright All copyrights reserved to ManTang.
 */
object JiZhangApi {

    /**
     * 获取省份列表
     */
    suspend fun getAllProvince(): ProvinceListBean {
        return HttpV2.post("applet/bill/get_all_province")
            .toResponse<ProvinceListBean>().await()
    }

    /**
     * 通过省份获取医院
     */
    suspend fun getHospitalByProvince(id: Int): HospitalListBean {
        return HttpV2.post("applet/bill/get_hospital_by_province")
            .add("id", id)
            .toResponse<HospitalListBean>().await()
    }

    suspend fun getHospitalByProvince(id: Int,page: Int): HospitalListBean {
        return HttpV2.post("applet/bill/get_hospital_by_province")
            .add("id", id)
            .add("page", page)
            .add("pageSize", 12)
            .toResponse<HospitalListBean>().await()
    }

    /**
     * 获取身体状态分类
     */
    suspend fun getPhysicalStatus(): PhysicalStatusBean {
        return HttpV2.post("applet/bill/get_physical_status")
            .toResponse<PhysicalStatusBean>().await()
    }

    /**
     * 保存周期
     */
    suspend fun saveCycle(id: Int, physical_status: String, hospital_id: Int): CycleBean {
        return HttpV2.post("applet/bill/save_cycle")
            .add("id", id)
            .add("physical_status", physical_status)
            .add("hospital_id", hospital_id)
            .toResponse<CycleBean>().await()
    }

    /**
     * 修改周期状态
     */
    suspend fun changeCycleSelected(id: Int): EmptyData {
        return HttpV2.post("applet/bill/change_cycle_selected")
            .add("id", id)
            .toResponse<EmptyData>().await()
    }

    /**
     * 获取我的周期列表
     */
    suspend fun getMyCycles(): MyCyclesBean {
        return HttpV2.post("applet/bill/get_cycle_list")
            .toResponse<MyCyclesBean>().await()
    }

    /**
     * 获取周期详情
     */
    suspend fun getCycleDetail(id: Int): PhysicalStatusBean {
        return HttpV2.post("applet/bill/get_cycle_detail")
            .add("id", id)
            .toResponse<PhysicalStatusBean>().await()
    }

    /**
     * 保存账单
     */
    suspend fun saveBill(
        id: Int,
        cost: String,
        date: String,
        cycle_id: Int,
        type: Int
    ): EmptyData {
        return HttpV2.post("applet/bill/save_bill")
            .add("id", id)
            .add("cost", cost)
            .add("date", date)
            .add("cycle_id", cycle_id)
            .add("type", type)
            .toResponse<EmptyData>().await()
    }

    /**
     * 获取账单详情
     */
    suspend fun getBillDetail(id: Int): BillBean {
        return HttpV2.post("applet/bill/get_bill_detail")
            .add("id", id)
            .toResponse<BillBean>().await()
    }

    /**
     * 获取试管账单列表
     */
    suspend fun getBillList(
        cycle_id: Int,
        page: Int,
        page_size: Int = Constant.PAGE_SIZE
    ): BillListBean {
        return HttpV2.post("applet/bill/get_bill_list")
            .add("cycle_id", cycle_id)
            .add("page", page)
            .add("page_size", page_size)
            .toResponse<BillListBean>().await()
    }

    /**
     * 删除账单
     */
    suspend fun deleteBill(id: Int): EmptyData {
        return HttpV2.post("applet/bill/delete_bill")
            .add("id", id)
            .toResponse<EmptyData>().await()
    }

    /**
     * 删除周期
     */
    suspend fun deleteCycle(id: Int): EmptyData {
        return HttpV2.post("applet/bill/delete_cycle")
            .add("id", id)
            .toResponse<EmptyData>().await()
    }

    suspend fun getCategoryBillList(
        cycleId: Int,
        type: Int,
        page: Int,
        page_size: Int = Constant.PAGE_SIZE
    ): CategoryBillBean {
        return HttpV2.post("applet/bill/category_bill_list")
            .add("cycle_id", cycleId)
            .add("type", type)
            .add("page", page)
            .add("page_size", page_size)
            .toResponse<CategoryBillBean>().await()
    }
}