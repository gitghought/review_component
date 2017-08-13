package com.simple.gh.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by gh on 2017-08-13.
 */

public class FragmentViewPagerStatePagerAdapter extends FragmentStatePagerAdapter{
    private ArrayList<String> titles = new ArrayList<>();
    private ArrayList<Fragment> frags = new ArrayList<>();

    public FragmentViewPagerStatePagerAdapter(
            FragmentManager fm, ArrayList<Fragment> frags, ArrayList<String> titles ) {

        super(fm);
        this.frags = frags;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return frags.get(position);
    }

    @Override
    public int getCount() {
        return frags.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
