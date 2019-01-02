package com.flyco.tablayoutsamples.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayoutsamples.R;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        SlidingTabLayout tabLayout= (SlidingTabLayout) findViewById(R.id.tab_category);
        ArrayList arr=new ArrayList();
        for(int i=0;i<10;i++){
            arr.add("测试"+i);
        }
        tabLayout.setmTitles(arr);
    }
}
