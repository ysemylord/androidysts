package com.xyb.androidystspractice.ThreeAdapter.smoothScroll;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.xyb.androidystspractice.R;

public class ScollerActivity extends AppCompatActivity {

    private SmoothScrollView smoothScrollView;
    private static final String TAG = "ScollerActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoller);
        smoothScrollView = (SmoothScrollView) findViewById(R.id.smoothview);

    }

    public void scrollerSmoothStart(View view) {
        smoothScrollView.smoothScrollTo(smoothScrollView.getScrollX() - 100, smoothScrollView.getScrollY() - 100);
    }

    public void valueSmoothStart(View view) {
        final int startX = smoothScrollView.getScrollX();
        final int startY = smoothScrollView.getScrollY();
        ValueAnimator valueAnimator = ValueAnimator.ofInt(0, 100).setDuration(1000);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int animatedValue = (int) valueAnimator.getAnimatedValue();
                int x = startX - animatedValue;
                int y = startY - animatedValue;
                Log.i(TAG, "onAnimationUpdate: \n" + "animatedValue:" + animatedValue + "\n");
                smoothScrollView.scrollTo(x, y);
            }
        });
        valueAnimator.start();
    }

    public void threadSmoothStart(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int offset = 0;
                final int startX = smoothScrollView.getScrollX();
                final int startY = smoothScrollView.getScrollY();
                while (offset <= 100) {
                    offset++;
                    smoothScrollView.scrollTo(startX - offset, startY - offset);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
