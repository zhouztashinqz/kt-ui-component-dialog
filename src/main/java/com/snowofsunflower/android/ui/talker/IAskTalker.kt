package com.snowofsunflower.android.ui.talker;

/**
 * Created by zhouztashin on 2018/10/21.
 */

interface IAskTalker : ITalker {
    fun question(str: String): IAskTalker
    fun yes(reactor: Reactor): IAskTalker
    fun no(reactor: Reactor): IAskTalker
    fun yesText(text: String): IAskTalker
    fun noText(text: String): IAskTalker
}
