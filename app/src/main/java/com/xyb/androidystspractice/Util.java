package com.xyb.androidystspractice;

import android.view.MotionEvent;

/**
 * Created  on 2017/9/28.
 *
 * @author xyb
 */

public class Util {
    public static String getActionStr(int action) {
        String ActionStr="";
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                ActionStr = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_MOVE:
                ActionStr = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                ActionStr = "ACTION_UP";
                break;
        }
        return ActionStr;
    }
}
