package com.xyb.androidystspractice.ThreeAdapter;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import com.xyb.androidystspractice.R;

public class GestrureDetectorActivity extends AppCompatActivity {
    String TAG="GestrureDetector";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestrure_detector);

        GestureDetector.OnGestureListener onGestureListener = new GestureDetector.OnGestureListener() {
            String TAG="onGestureListener";
            @Override
            public boolean onDown(MotionEvent e) {
                Log.i(TAG, "onDown:");
                return true;
            }

            @Override
            public void onShowPress(MotionEvent e) {
                Log.i(TAG, "onShowPress: ");
            }

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                Log.i(TAG, "onSingleTapUp: ");
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                Log.i(TAG, "onScroll: ");
                return false;
            }

            @Override
            public void onLongPress(MotionEvent e) {
                Log.i(TAG, "onLongPress: ");
            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                Log.i(TAG, "onFling: ");
                return false;
            }
        };
        GestureDetector.OnDoubleTapListener doubleTapListener = new GestureDetector.OnDoubleTapListener() {
            String TAG="doubleTapListener";
            @Override
            public boolean onSingleTapConfirmed(MotionEvent e) {
                Log.i(TAG, "onSingleTapConfirmed: ");
                return false;
            }

            @Override
            public boolean onDoubleTap(MotionEvent e) {
                Log.i(TAG, "onDoubleTap: ");
                return false;
            }

            @Override
            public boolean onDoubleTapEvent(MotionEvent e) {
                Log.i(TAG, "onDoubleTapEvent: ");
                return false;
            }
        };

        final GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(this, onGestureListener);
        gestureDetectorCompat.setOnDoubleTapListener(doubleTapListener);
        View view = (View) findViewById(R.id.btn);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                boolean consumed = gestureDetectorCompat.onTouchEvent(event);
                return consumed;
            }
        });

    }

}
