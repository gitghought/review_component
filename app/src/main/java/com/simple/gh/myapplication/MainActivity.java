package com.simple.gh.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.simple.gh.myapplication.adapter.MyViewPagerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager vp;
    private MyViewPagerAdapter adapter = null;
    private ArrayList<View> views = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        vp = (ViewPager) findViewById(R.id.vp_container);
        adapter = new MyViewPagerAdapter(views);
        vp.setAdapter(adapter);
    }

    private void initViews() {
        View view = LayoutInflater.from(this).inflate(R.layout.viewpager_sub_component, null);
        View view2 = LayoutInflater.from(this).inflate(R.layout.viewpager_sub_component2, null);
        View view3 = LayoutInflater.from(this).inflate(R.layout.viewpager_sub_component3, null);

        views.add(view);
        views.add(view2);
        views.add(view3);

    }
}
