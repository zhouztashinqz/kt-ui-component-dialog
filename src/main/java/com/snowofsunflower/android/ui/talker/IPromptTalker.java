package com.snowofsunflower.android.ui.talker;

/**
 * Created by zhouztashin on 2018/10/21.
 */

public interface IPromptTalker extends ITalker<IPromptTalker> {
    IPromptTalker reactor(Reactor reactor);

    IPromptTalker detail(String str);

    IPromptTalker reactText(String str);
}
