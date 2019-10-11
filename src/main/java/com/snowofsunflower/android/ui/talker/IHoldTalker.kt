package com.snowofsunflower.android.ui.talker;

/**
 * Created by zhouztashin on 2018/10/21.
 * 等待对话框
 */

interface IHoldTalker : ITalker {

    /**
     * 提示内容
     */
    fun detail(content: String): IHoldTalker
}
