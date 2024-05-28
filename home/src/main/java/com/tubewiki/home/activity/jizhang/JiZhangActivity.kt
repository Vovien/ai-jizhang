package com.tubewiki.home.activity.jizhang

import android.graphics.Color
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.apkdv.mvvmfast.base.DataBindingActivity
import com.apkdv.mvvmfast.ktx.launch
import com.apkdv.mvvmfast.ktx.next
import com.apkdv.mvvmfast.ktx.showToast
import com.google.android.material.datepicker.MaterialDatePicker
import com.jmbon.middleware.utils.DateFormatUtil
import com.jmbon.middleware.utils.isNotNullEmpty
import com.qmuiteam.qmui.kotlin.onClick
import com.tubewiki.home.R
import com.tubewiki.home.bean.jizhang.BillEvent
import com.tubewiki.home.bean.jizhang.ChangeCycleEvent
import com.tubewiki.home.databinding.ActivityJizhangBinding
import com.tubewiki.home.router.HomeRouter
import com.tubewiki.home.viewmodel.JiZhangModel
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.util.Calendar
import java.util.Date


/**
 * 记账页面
 * @author MilkCoder
 * @date 2023/11/17
 * @copyright All copyrights reserved to ManTang.
 */
@Route(path = "/home/jizhang/activity")
class JiZhangActivity : DataBindingActivity<JiZhangModel, ActivityJizhangBinding>() {

    @JvmField
    @Autowired
    var billId: Int = 0

    override fun beforeViewInit() {
        super.beforeViewInit()
        EventBus.getDefault().register(this)
    }

    override fun onDestroy() {
        EventBus.getDefault().unregister(this)
        super.onDestroy()
    }

    override fun initView(savedInstanceState: Bundle?) {
        setTitleName("记账")

        binding.apply {
            tvTime.setLeftTextIsBold(true)
            tvCycle.setLeftTextIsBold(true)
            tvTime.onClick {
                addDateView()
            }

            if (billId != 0) {
                tvCycle.isEnabled = false
                llBottom.isVisible = true
                save.isVisible = false
            }
            tvCycle.onClick {
                val isToCycleSetting = viewModel.myCycleListFlow.value
                if (isToCycleSetting.isNullOrEmpty()) {
                    HomeRouter.toCycleSettingPage()
                } else {
                    HomeRouter.toCycleSwitchPage()
                }
            }

            etCost.addTextChangedListener(afterTextChanged = {
                binding.save.isEnabled =
                    it.isNotNullEmpty() && viewModel.billFlow.value.date.isNotNullEmpty()
            })

            rbCheck.onClick {
                val bill = viewModel.billFlow.value.type
                if (bill != 1) {
                    viewModel.setType(1)
                }
            }

            rbMedicine.onClick {
                val bill = viewModel.billFlow.value.type
                if (bill != 2) {
                    viewModel.setType(2)
                }
            }

            rbEmbryo.onClick {
                val bill = viewModel.billFlow.value.type
                if (bill != 3) {
                    viewModel.setType(3)
                }
            }

            rbOther.onClick {
                val bill = viewModel.billFlow.value.type
                if (bill != 4) {
                    viewModel.setType(4)
                }
            }
            tvDel.onClick {
                viewModel.delBill(billId) {
                    EventBus.getDefault().post(BillEvent(true))
                    "删除成功".showToast()
                    finish()
                }
            }
            saveAndBack.onClick {
                viewModel.saveBill(billId) {
                    EventBus.getDefault().post(BillEvent(true))
                    "保存成功".showToast()
                    finish()
                }
            }
            save.onClick {
                viewModel.saveBill {
                    EventBus.getDefault().post(BillEvent(true))
                    "保存成功".showToast()
                    finish()
                }
            }
        }
    }

    /** 时间选择器 */
    private fun addDateView() {
        val time = viewModel.localTime.value
        val datePicker = MaterialDatePicker.Builder.datePicker()
            .setSelection(if (time == 0L) MaterialDatePicker.todayInUtcMilliseconds() else time)
            .build()
        datePicker.addOnPositiveButtonClickListener {
            val s = DateFormatUtil.getStringByFormat(
                it,
                DateFormatUtil.dateFormatYMD
            )
            viewModel.setDate(s, it)
        }
        datePicker.show(supportFragmentManager, "")
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEvent(event: ChangeCycleEvent) {
        if (event.re) {
            viewModel.myCycleListFlow()
        }
    }

    override fun initViewModel() {
        super.initViewModel()
        ARouter.getInstance().inject(this)
        if (billId != 0) {
            viewModel.getBillDetail(billId)
        } else {
            viewModel.myCycleListFlow()
        }
    }

    override fun getData() {
        super.getData()

        launch {
            viewModel.myCycleListFlow.next {
                this?.apply {
                    val cycle = this.find { it.isSelected == 1 } ?: this.getOrNull(0)
                    cycle?.let {
                        binding.tvCycle.setRightString(it.name)
                        binding.tvCycle.setRightTextColor(
                            com.blankj.utilcode.util.ColorUtils.getColor(
                                R.color.color_262626
                            )
                        )
                        viewModel.setCycleId(it.id)
                    } ?: kotlin.run {
                        binding.tvCycle.setRightString("请设置周期")
                        binding.tvCycle.setRightTextColor(
                            com.blankj.utilcode.util.ColorUtils.getColor(
                                R.color.color_BFBFBF
                            )
                        )
                        viewModel.setCycleId(0)
                    }
                }
            }
        }

        launch {
            viewModel.billFlow.next {
                binding.bill = this
                binding.executePendingBindings()
                if (date.isNotNullEmpty()) {
                    binding.tvTime.setRightTextColor(Color.parseColor("#FF262626"))
                    binding.tvTime.setRightString(date)
                }
                if (name.isNotNullEmpty()) {
                    binding.tvCycle.setRightString(name)
                    binding.tvCycle.setRightTextColor(
                        com.blankj.utilcode.util.ColorUtils.getColor(
                            R.color.color_262626
                        )
                    )
                }
                binding.save.isEnabled = input.isNotNullEmpty() && date.isNotNullEmpty()
            }
        }
    }

}