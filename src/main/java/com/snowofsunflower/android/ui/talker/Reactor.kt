package com.snowofsunflower.android.ui.talker;

import android.view.View;

/**
 * Created by zhouztashin on 2018/10/21.
 * 对话框回调
 */

@Deprecated("通过高阶函数代替")
interface Reactor {
    fun react(v: View, talker: ITalker<*>)
}
