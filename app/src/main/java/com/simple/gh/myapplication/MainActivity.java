package com.simple.gh.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simple.gh.myapplication.adapter.MyFragmentStatePagerAdapter;
import com.simple.gh.myapplication.fragment.FragmentChat;
import com.simple.gh.myapplication.fragment.FragmentFind;
import com.simple.gh.myapplication.fragment.FragmentFriend;
import com.simple.gh.myapplication.fragment.FragmentMe;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Fragment> frags = new ArrayList<>();
    private ViewPager vp;
    private MyFragmentStatePagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFragments();

        vp = (ViewPager) findViewById(R.id.vp_container);
        adapter = new MyFragmentStatePagerAdapter(this.getSupportFragmentManager(),
                frags);

        vp.setAdapter( adapter );

    }

    private void initFragments() {
        frags.add(new FragmentChat());
        frags.add(new FragmentFriend());
        frags.add(new FragmentFind());
        frags.add(new FragmentMe());
    }
}
