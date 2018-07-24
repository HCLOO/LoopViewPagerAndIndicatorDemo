package com.example.huangcl.loopviewpagerandindicatordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    private LoopViewPager loopViewPager;
    private MyViewPagerAdapter adapter;
    private CircleIndicator indicator;
    private List contentList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initContentList();
        loopViewPager=(LoopViewPager)findViewById(R.id.view_pager);
        indicator=(CircleIndicator)findViewById(R.id.circle_indicator);
        adapter=new MyViewPagerAdapter(this,contentList);
        loopViewPager.setBoundaryCaching(true);
        loopViewPager.setBoundaryLooping(true);
        loopViewPager.setAdapter(adapter);
        indicator.setViewPager(loopViewPager);
    }

    private void initContentList() {
        if (contentList!=null)
            contentList.clear();
        for(int i=0;i<5;++i)
            contentList.add("fragment"+(i+1));
    }
}
