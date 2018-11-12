package com.snowofsunflower.android.ui.talkerimpl;

import android.app.Activity;

import com.snowofsunflower.android.ui.talker.IHoldTalker;
import com.yarolegovich.lovelydialog.LovelyProgressDialog;

/**
 * Created by zhouztashin on 2018/10/21.
 */

public class HoldTalker implements IHoldTalker {


    LovelyProgressDialog mDialog;

    public HoldTalker(Activity activity) {
        mDialog = new LovelyProgressDialog(activity);
        mDialog.setCancelable(true);
    }

    @Override
    public IHoldTalker detail(String contnet) {
        mDialog.setMessage(contnet);
        return this;
    }

    @Override
    public HoldTalker about(String title) {
        mDialog.setTitle(title);
        return this;
    }

    @Override
    public IHoldTalker on() {
        mDialog.show();
        return this;
    }

    @Override
    public IHoldTalker off() {
        mDialog.dismiss();
        return this;
    }
}
