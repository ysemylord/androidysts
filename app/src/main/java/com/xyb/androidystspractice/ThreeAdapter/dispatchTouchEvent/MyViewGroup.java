package com.xyb.androidystspractice.ThreeAdapter.dispatchTouchEvent;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import com.xyb.androidystspractice.Util;

/**
 * Created  on 2017/9/28.
 *
 * @author xyb
 */

public class MyViewGroup extends FrameLayout {
    private static final String TAG = "MyViewGroup";

    public MyViewGroup(@NonNull Context context) {
        super(context);
    }

    public MyViewGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        String ActionStr = Util.getActionStr(action);
        boolean consume;
       consume = true;

        Log.i(TAG, "onInterceptTouchEvent"+(consume?"拦截":"不拦截") + ActionStr);
        return consume;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        String ActionStr = Util.getActionStr(action);
        boolean consume;
        if (action == MotionEvent.ACTION_DOWN) {
            consume = true;
        } else {
            consume = false;
        }
        Log.i(TAG, "onTouchEvent"+(consume?"消耗":"不消耗") + ActionStr);
        return consume;
    }
}
