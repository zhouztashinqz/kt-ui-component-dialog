package com.snowofsunflower.android.ui.talkerimpl;

import android.app.Activity;
import android.view.View;

import com.snowofsunflower.android.ui.talker.IAskTalker;
import com.snowofsunflower.android.ui.talker.Reactor;
import com.yarolegovich.lovelydialog.LovelyStandardDialog;

/**
 * Created by zhouztashin on 2018/10/21.
 */

public class AskTalker implements IAskTalker {

    private LovelyStandardDialog mDialog;

    public AskTalker(Activity activity) {
        mDialog = new LovelyStandardDialog(activity, LovelyStandardDialog.ButtonLayout.HORIZONTAL);
        mDialog.setNegativeButton(android.R.string.cancel, null);
    }

    @Override
    public IAskTalker question(String str) {
        mDialog.setMessage(str);
        return this;
    }

    @Override
    public IAskTalker yes(final Reactor reactor) {
        mDialog.setPositiveButton(android.R.string.ok, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reactor.react(view);
            }
        });

        return this;
    }

    @Override
    public IAskTalker no(final Reactor reactor) {
        mDialog.setNegativeButton(android.R.string.cancel, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reactor.react(view);
            }
        });

        return this;
    }

    @Override
    public IAskTalker yesText(String text) {
        mDialog.setPositiveButtonText(text);
        return this;
    }

    @Override
    public IAskTalker noText(String text) {
        mDialog.setNegativeButtonText(text);
        return this;
    }

    @Override
    public IAskTalker about(String title) {
        mDialog.setTitle(title);
        return this;
    }

    @Override
    public IAskTalker on() {
        mDialog.show();
        return this;
    }

    @Override
    public IAskTalker off() {
        mDialog.dismiss();
        return this;
    }
}
