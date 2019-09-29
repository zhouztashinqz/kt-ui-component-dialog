package com.snowofsunflower.android.ui.talker;

/**
 * Created by zhouztashin on 2018/10/21.
 * Dialog
 */

//dialog.action(Hold).title(title).question(question).hold();//边界清晰
//dialog.end();
//dialog.about("高速通").detail("是否退出").Ask();--语义性强
//dialog.action(Ask).about("高速通").question("是否退出").yes(listener).no().show();-——方式统一
//dialog.hide();
//dialog.title("高速通").content("是否退出").show();

interface ITalker {

    /**
     * talk about,as well as dialog's title
     *
     * @param str
     */

    fun about(str: String): ITalker

    /**
     *
     * talk on ,as well as dialog's show()
     */
    fun on(): ITalker

    /**
     *
     * talk off,as well as dialog's dismiss()
     */
    fun off(): ITalker


}
