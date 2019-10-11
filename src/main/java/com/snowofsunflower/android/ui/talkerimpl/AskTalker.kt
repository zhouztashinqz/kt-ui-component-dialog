package com.snowofsunflower.android.ui.talkerimpl

import android.app.Activity
import com.snowofsunflower.android.ui.talker.IAskTalker
import com.snowofsunflower.android.ui.talker.ITalker
import com.snowofsunflower.android.ui.talker.Reactor
import com.yarolegovich.lovelydialog.LovelyStandardDialog
import com.yarolegovich.lovelydialog.R

/**
 * 提问对话框实现类
 */
class AskTalker(activity: Activity) : IAskTalker {

    private val mDialog = LovelyStandardDialog(activity,
            LovelyStandardDialog.ButtonLayout.HORIZONTAL)

    init {
        mDialog.setNegativeButton(R.string.cancel, null)
    }

    override fun question(str: String): IAskTalker {
        mDialog.setMessage(str)
        return this
    }

    override fun yes(reactor: Reactor): IAskTalker {
        mDialog.setPositiveButton(R.string.ok) {
            reactor.react(it, this@AskTalker)
        }
        return this
    }

    override fun no(reactor: Reactor): IAskTalker {
        mDialog.setNegativeButton(R.string.cancel) {
            reactor.react(it, this@AskTalker)
        }
        return this
    }

    override fun yesText(text: String): IAskTalker {
        mDialog.setPositiveButtonText(text)
        return this
    }

    override fun noText(text: String): IAskTalker {
        mDialog.setNegativeButtonText(text)
        return this
    }

    override fun about(str: String): IAskTalker {
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
