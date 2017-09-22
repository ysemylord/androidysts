package com.xyb.androidystspractice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.xyb.androidystspractice.lauchMode.SingleTaskDemoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void skipToSingleTask(View view) {
        Intent intent=new Intent(this,SingleTaskDemoActivity.class);
        startActivity(intent);
    }

    public void implicitOpenActivity1(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.parse("http://faf"),"image/jpeg");
        startActivity(intent);
    }

    public void implicitOpenActivity2(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("content://abd"));

        startActivity(intent);
    }

    public void implicitOpenActivity3(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        //intent.setType("image/jpeg");
        intent.setDataAndType(Uri.parse("file://abc"), "text/plain");
        startActivity(intent);
    }
}
