package com.snowofsunflower.android.ui.talkerimpl

import android.app.Activity
import android.view.View
import com.enjoy.dialog.R
import com.snowofsunflower.android.ui.talker.IAskTalker
import com.yarolegovich.lovelydialog.LovelyStandardDialog

/**
 * 提问对话框实现类
 */
class AskTalker(private val mActivity: Activity) : IAskTalker {
    override fun about(str: String): IAskTalker {
        mDialog.setTitle(str)
        return this
    }

    override fun isOn(): Boolean = mDialog.create().isShowing
    //Done 更改为相应的函数类型？
    var mYesClickListener: ((View, IAskTalker) -> Unit)? = null
    var mNoClickListener: ((View, IAskTalker) -> Unit)? = null
    var mYesText: String? = null
    var mNoText: String? = null

    private val mDialog = LovelyStandardDialog(
            mActivity,
            LovelyStandardDialog.ButtonLayout.HORIZONTAL
    )

    init {
        mDialog.setNegativeButton(R.string.cancel, null)
    }

    override fun question(str: String): IAskTalker {
        mDialog.setMessage(str)
        return this
    }

    override fun yes(reactor: (v: View, talker: IAskTalker) -> Unit): IAskTalker {
        mYesClickListener = reactor
        return this
    }

    override fun no(reactor: (v: View, talker: IAskTalker) -> Unit): IAskTalker {
        mNoClickListener = reactor
        return this
    }

    override fun yesText(text: String): IAskTalker {
        mYesText = text
        //  mDialog.setPositiveButtonText(text)
        return this
    }

    override fun noText(text: String): IAskTalker {
        mNoText = text
        // mDialog.setNegativeButtonText(text)
        return this
    }

    /*  override fun  about(str: String): AskTalker {
          mDialog.setTitle(str)
          return this
      }*/
    /*override fun about(str: String): ITalker {
        mDialog.setTitle(str)
        return this
    }
*/
    override fun on(): IAskTalker {
        val yesText = mYesText ?: mActivity.getString(R.string.ok)
        mYesClickListener?.run {
            mDialog.setPositiveButton(yesText) {
                this(it, this@AskTalker)
            }
        } ?: mDialog.setPositiveButton(yesText, null)

        val noText = mNoText ?: mActivity.getString(R.string.cancel)
        mNoClickListener?.run {
            mDialog.setNegativeButton(mNoText) {
                this(it, this@AskTalker)
            }
        } ?: mDialog.setNegativeButton(noText, null)

        mDialog.show()
        return this
    }

    override fun off(): IAskTalker {
        mDialog.dismiss()
        return this
    }
}
