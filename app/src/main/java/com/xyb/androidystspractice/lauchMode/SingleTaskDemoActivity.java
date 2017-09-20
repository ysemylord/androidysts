package com.xyb.androidystspractice.lauchMode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.xyb.androidystspractice.R;

public class SingleTaskDemoActivity extends AppCompatActivity {
    private static final String TAG = "SingleTaskDemoActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task_demo);
        Log.i(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    public void startThis(View view) {
        Intent intent = new Intent(this, SingleTaskDemoActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG, "onNewIntent: ");
    }


}
