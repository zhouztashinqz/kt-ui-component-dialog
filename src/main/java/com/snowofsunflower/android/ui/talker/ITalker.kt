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

interface ITalker {

    /**
     * 对话框标题
     *
     * @param str
     */

    fun about(str: String): ITalker

    /**
     *
     * 显示对话框
     */
    fun on(): ITalker

    /**
     *
     * t关闭对话框
     */
    fun off(): ITalker


}
