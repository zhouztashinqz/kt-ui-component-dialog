package com.snowofsunflower.android.ui.talker;

import android.view.View

/**
 * Created by zhouztashin on 2018/10/21.
 * 提问对话框
 */

interface IAskTalker : ITalker<IAskTalker> {
    /**
     * 问题
     */
    fun question(str: String): IAskTalker

    /**
     * 确认回调
     */
    fun yes(reactor: (v: View, talker: IAskTalker) -> Unit): IAskTalker

    /**
     * 否认回调
     */
    fun no(reactor: (v: View, talker: IAskTalker) -> Unit): IAskTalker

    /**
     * 确认文本
     */
    fun yesText(text: String): IAskTalker

    /**
     * 否认文本
     */
    fun noText(text: String): IAskTalker
}
