package com.snowofsunflower.android.ui.talker

import android.app.Activity
import android.app.Dialog
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.Window
import com.enjoy.dialog.R

/**
 * 抽象对话框
 */
//TODO 暂无方案 构造函数设计不合理，从扩展性出发，再次设计。
abstract class AbsTalker(val mActivity: Activity, layoutDialogId: Int) :
        ITalker<AbsTalker> {
    protected val mDialog: Dialog = Dialog(mActivity, R.style.dialog)
    protected var mView: ViewGroup? = null

    /**
     * 自定义对话框布局
     */
    init {
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        (LayoutInflater.from(mActivity).inflate(layoutDialogId, null) as?ViewGroup?)?.let {
            mView = it
            mDialog.setContentView(it)
        } ?: throw Exception("layoutDialogId 必须为ViewGroup")
    }

    override fun on(): AbsTalker {
        mDialog.show()
        return this
    }

    override fun off(): AbsTalker {
        mDialog.hide()
        return this
    }

    override fun isOn(): Boolean = mDialog.isShowing
}