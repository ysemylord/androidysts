package com.xyb.androidystspractice.ThreeAdapter.dispatchTouchEvent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import com.xyb.androidystspractice.Util;

/**
 * Created  on 2017/9/28.
 *
 * @author xyb
 */

public class MyButtonView extends android.support.v7.widget.AppCompatButton {
    private static final String TAG="MyButtonView";
    public MyButtonView(Context context) {
        super(context);
    }

    public MyButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButtonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        int action = event.getAction();
        String ActionStr = Util.getActionStr(action);
        boolean consume=super.dispatchTouchEvent(event);
        //Log.i(TAG, "dispatchTouchEvent"+(consume?"消耗":"不消耗") + ActionStr);
        return consume;
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        String ActionStr = Util.getActionStr(action);
        boolean consume=super.onTouchEvent(event);
        Log.i(TAG, "onTouchEvent"+(consume?"消耗":"不消耗") + ActionStr);
        return consume;
    }


}
