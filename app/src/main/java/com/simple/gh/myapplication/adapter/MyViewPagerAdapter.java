package com.simple.gh.myapplication.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by gh on 2017-08-13.
 */

public class MyViewPagerAdapter extends PagerAdapter{
    private ArrayList<View> views = new ArrayList<>();
    private ArrayList<String> titles = new ArrayList<>();

    public MyViewPagerAdapter(ArrayList<View> views) {
        this.views = views;
    }

    public MyViewPagerAdapter(ArrayList<String> titles, ArrayList<View> views) {
        this.titles = titles;
        this.views = views;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        container.addView(views.get(position));

        return views.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(views.get(position));
    }
}

