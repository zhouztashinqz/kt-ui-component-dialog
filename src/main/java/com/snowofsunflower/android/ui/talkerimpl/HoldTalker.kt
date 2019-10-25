package com.snowofsunflower.android.ui.talkerimpl

import android.app.Activity
import com.snowofsunflower.android.ui.talker.IHoldTalker
import com.yarolegovich.lovelydialog.LovelyProgressDialog

/**
 * 等待对话框实现类
 */
class HoldTalker(activity: Activity) : IHoldTalker {
    override fun isOn(): Boolean = mDialog.create().isShowing


    private val mDialog: LovelyProgressDialog = LovelyProgressDialog(activity)

    init {
        mDialog.setCancelable(true)
    }

    override fun detail(content: String): IHoldTalker {
        mDialog.setMessage(content)
        return this
    }

    override fun about(str: String): IHoldTalker {
        mDialog.setTitle(str)
        return this
    }

    override fun on(): IHoldTalker {
        mDialog.show()
        return this
    }

    override fun off(): IHoldTalker {
        mDialog.dismiss()
        return this
    }


}