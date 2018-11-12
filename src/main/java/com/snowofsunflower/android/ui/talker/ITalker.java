package com.snowofsunflower.android.ui.talker;

/**
 * Created by zhouztashin on 2018/10/21.
 * Dialog
 */

public interface ITalker<T> {

    /**
     * talk about
     *
     * @param str
     */
    T about(String str);

    ITalker on();

    ITalker off();
    //dialog.action(Hold).title(title).question(question).hold();//边界清晰
    //dialog.end();
    //dialog.about("高速通").detail("是否退出").Ask();--语义性强
    //dialog.action(Ask).about("高速通").question("是否退出").yes(listener).no().show();-——方式统一
    //dialog.hide();
    //dialog.title("高速通").content("是否退出").show();


}
