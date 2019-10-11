package com.snowofsunflower.android.ui.talkerimpl

import android.app.Activity
import com.snowofsunflower.android.ui.talker.IHoldTalker
import com.snowofsunflower.android.ui.talker.ITalker
import com.yarolegovich.lovelydialog.LovelyProgressDialog

/**
 * 等待对话框实现类
 */
class HoldTalker(activity: Activity) : IHoldTalker {

    private val mDialog: LovelyProgressDialog = LovelyProgressDialog(activity)

    init {
        mDialog.setCancelable(true)
    }

    override fun detail(content: String): IHoldTalker {
        mDialog.setMessage(content)
        return this
    }

    override fun about(str: String): ITalker {
        mDialog.setTitle(str)
        return this
    }

    override fun on(): ITalker {
        mDialog.show()
        return this
    }

    override fun off(): ITalker {
        mDialog.dismiss()
        return this
    }

}