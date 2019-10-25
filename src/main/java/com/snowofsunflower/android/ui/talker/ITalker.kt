package com.snowofsunflower.android.ui.talker;

/**
 * Created by zhouztashin on 2018/10/21.
 * 对话框接口
 */

//dialog.action(Hold).title(title).question(question).hold();//边界清晰
//dialog.end();
//dialog.about("高速通").detail("是否退出").Ask();--语义性强
//dialog.action(Ask).about("高速通").question("是否退出").yes(listener).no().show();-——方式统一
//dialog.hide();
//dialog.title("高速通").content("是否退出").show();
//Done 采用泛型，调用方法后，返回值可以是子类，这样变相就可以返回子类的实例
interface ITalker<T : ITalker<T>> {

    /**
     * 对话框标题，默认继承，避免有些对话框不需要该方法
     *
     * @param str
     */
    fun about(str: String): T

    /**
     *
     * 显示对话框
     */
    fun on(): T

    /**
     *
     * 关闭对话框
     */
    fun off(): T

    /**
     * 是否是开启
     */
    fun isOn(): Boolean


}
