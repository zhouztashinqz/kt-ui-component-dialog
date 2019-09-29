package com.snowofsunflower.android.ui.talker

/**
 * Created by zhouztashin on 2018/10/21.
 */

interface IPromptTalker : ITalker {
    fun reactor(reactor: Reactor): IPromptTalker
    fun detail(str: String): IPromptTalker
    fun reactText(str: String): IPromptTalker
}
