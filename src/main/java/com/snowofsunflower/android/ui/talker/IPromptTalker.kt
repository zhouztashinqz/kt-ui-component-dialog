package com.snowofsunflower.android.ui.talker

import android.view.View

/**
 * Created by zhouztashin on 2018/10/21.
 * 提示对话框
 */

interface IPromptTalker : ITalker<IPromptTalker> {
    /**
     * 提示按钮响应
     */
    fun reactor(reactor: (v: View, talker: IPromptTalker) -> Unit): IPromptTalker

    /**
     * 提问详情
     */
    fun detail(str: String): IPromptTalker

    /**
     * 响应文字
     */
    fun reactText(str: String): IPromptTalker
}
