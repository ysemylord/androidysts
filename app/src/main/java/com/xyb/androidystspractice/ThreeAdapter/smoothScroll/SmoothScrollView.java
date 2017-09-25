package com.xyb.androidystspractice.ThreeAdapter.smoothScroll;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;

/**
 * Created  on 2017/9/25.
 *
 * @author xyb
 */

public class SmoothScrollView extends FrameLayout {
    private Scroller mScroller;
    public SmoothScrollView(Context context) {
        super(context);
    }

    public SmoothScrollView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SmoothScrollView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    /**
     *
     * @param desX  在x轴上 要滚动到的最终位置
     * @param desY 在y轴上 要滚动到的最终位置
     */
    public void smoothScrollTo(int desX,int desY) {
        if (mScroller == null) {
            mScroller = new Scroller(getContext());
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        mScroller.startScroll(scrollX, scrollY,desX- scrollX,desY- scrollY);
        invalidate();
    }

    @Override
    public void computeScroll() {
        super.computeScroll();
        if(mScroller!=null&&mScroller.computeScrollOffset()){
            scrollTo(mScroller.getCurrX(),mScroller.getCurrY());
            postInvalidate();
        }
    }
}
