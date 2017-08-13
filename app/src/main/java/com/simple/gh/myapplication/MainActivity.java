package com.simple.gh.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.simple.gh.myapplication.adapter.FragmentViewpagerAdapter;
import com.simple.gh.myapplication.adapter.MyViewPagerAdapter;
import com.simple.gh.myapplication.fragment.FragmentPageOne;
import com.simple.gh.myapplication.fragment.FragmentPageThree;
import com.simple.gh.myapplication.fragment.FragmentPageTwo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager vp;
    private ArrayList<Fragment> frags = new ArrayList<>();
    private ArrayList<String> titles = new ArrayList<>();
    private FragmentViewpagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFragments();
        initTitles();

        vp = (ViewPager) findViewById(R.id.vp_container);
        adapter = new FragmentViewpagerAdapter(
                this.getSupportFragmentManager(), frags, titles);
        vp.setAdapter(adapter);
    }

    private void initFragments() {
        frags.add(new FragmentPageOne());
        frags.add(new FragmentPageTwo());
        frags.add(new FragmentPageThree());
    }

    private void initTitles() {

        for (int i = 0; i < 3; i++) {
            titles.add("title" + i);
        }
    }

}
