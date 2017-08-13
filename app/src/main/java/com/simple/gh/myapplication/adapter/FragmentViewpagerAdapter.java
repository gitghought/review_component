package com.simple.gh.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by gh on 2017-08-13.
 */

public class FragmentViewpagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> frags = new ArrayList<>();
    private ArrayList<String> titles = new ArrayList<>();

    public FragmentViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public FragmentViewpagerAdapter(FragmentManager fm, ArrayList<Fragment> frags, ArrayList<String> titles) {
        super(fm);
        this.frags = frags;
        this.titles = titles;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return frags.get(position);
    }

    @Override
    public int getCount() {
        return frags.size();
    }
}
