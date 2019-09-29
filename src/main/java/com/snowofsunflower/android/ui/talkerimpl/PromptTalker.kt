package com.snowofsunflower.android.ui.talkerimpl

import android.app.Activity
import com.snowofsunflower.android.ui.talker.IPromptTalker
import com.snowofsunflower.android.ui.talker.ITalker
import com.snowofsunflower.android.ui.talker.Reactor
import com.yarolegovich.lovelydialog.LovelyInfoDialog

class PromptTalker(activity: Activity) : IPromptTalker {

    val mDialog = LovelyInfoDialog(activity)


    override fun reactor(reactor: Reactor): IPromptTalker {
        //TODO REACTOR
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