package com.snowofsunflower.android.ui.talker

/**
 * Created by zhouztashin on 2018/10/21.
 * 提示对话框
 */

interface IPromptTalker : ITalker {
    /**
     * 提示按钮响应
     */
    fun reactor(reactor: Reactor): IPromptTalker

    /**
     * 提问详情
     */
    fun detail(str: String): IPromptTalker

    /**
     * 响应文字
     */
    fun reactText(str: String): IPromptTalker
}
