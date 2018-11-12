package com.snowofsunflower.android.ui.talkerimpl;

import android.app.Activity;

import com.snowofsunflower.android.ui.talker.IPromptTalker;
import com.snowofsunflower.android.ui.talker.Reactor;
import com.yarolegovich.lovelydialog.LovelyInfoDialog;

/**
 * Created by zhouztashin on 2018/10/21.
 */

public class PromptTalker implements IPromptTalker {
    private LovelyInfoDialog mDialog;

    public PromptTalker(Activity activity) {
        mDialog = new LovelyInfoDialog(activity);
    }

    @Override
    public IPromptTalker reactor(Reactor reactor) {
        return this;
    }

    @Override
    public IPromptTalker detail(String str) {
        mDialog.setMessage(str);
        return this;
    }

    @Override
    public IPromptTalker reactText(String str) {
        mDialog.setConfirmButtonText(str);
        return null;
    }

    @Override
    public IPromptTalker about(String title) {
        mDialog.setTitle(title);
        return this;
    }

    @Override
    public IPromptTalker on() {
        mDialog.show();
        return this;
    }

    @Override
    public IPromptTalker off() {
        mDialog.dismiss();
        return this;
    }
}
