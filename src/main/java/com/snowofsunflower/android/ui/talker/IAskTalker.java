package com.snowofsunflower.android.ui.talker;

/**
 * Created by zhouztashin on 2018/10/21.
 */

public interface IAskTalker extends ITalker<IAskTalker> {
    IAskTalker question(String str);

    IAskTalker yes(Reactor reactor);

    IAskTalker no(Reactor reactor);

    IAskTalker yesText(String text);

    IAskTalker noText(String text);
}
