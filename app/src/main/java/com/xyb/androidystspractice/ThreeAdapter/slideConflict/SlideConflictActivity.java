package com.xyb.androidystspractice.ThreeAdapter.slideConflict;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.xyb.androidystspractice.R;

import java.util.ArrayList;
import java.util.List;

public class SlideConflictActivity extends AppCompatActivity {
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_conflict);
        mListView = (ListView) findViewById(R.id.list_view);
        List<String> datas = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            datas.add(i + "");
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datas);
        mListView.setAdapter(arrayAdapter);
    }
}
