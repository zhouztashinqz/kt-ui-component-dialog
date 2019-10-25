package com.snowofsunflower.android.ui.talkerimpl

import android.app.Activity
import android.view.View
import android.widget.Button
import com.snowofsunflower.android.ui.talker.IPromptTalker
import com.yarolegovich.lovelydialog.LovelyInfoDialog

/**
 *提示对话框
 */
class PromptTalker(activity: Activity) : IPromptTalker {

    override fun isOn(): Boolean = mDialog.create().isShowing

    private val mDialog = LovelyInfoDialog(activity)


    override fun reactor(reactor: (v: View, talker: IPromptTalker) -> Unit): IPromptTalker {
        val confirmButton = mDialog.create().findViewById<Button>(com.yarolegovich.lovelydialog.R.id.ld_btn_confirm)
        confirmButton.setOnClickListener {
            reactor(it, this@PromptTalker)
        }
        return this
    }

    override fun detail(str: String): IPromptTalker {
        mDialog.setMessage(str)
        return this
    }

    override fun reactText(str: String): IPromptTalker {
        mDialog.setConfirmButtonText(str)
        return this
    }

    override fun about(str: String): IPromptTalker {
        mDialog.setTitle(str)
        return this
    }

    override fun on(): IPromptTalker {
        mDialog.show()
        return this
    }

    override fun off(): IPromptTalker {
        mDialog.dismiss()
        return this
    }

}