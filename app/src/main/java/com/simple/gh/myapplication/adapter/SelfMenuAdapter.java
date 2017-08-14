package com.simple.gh.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.simple.gh.myapplication.R;

import java.util.ArrayList;

/**
 * Created by gh on 2017-08-14.
 */

public class SelfMenuAdapter extends BaseAdapter{
    private ArrayList<String> titles = new ArrayList<>();
    private Context context;

    public SelfMenuAdapter(Context context, ArrayList<String> titles) {
        this.context = context;
        this.titles = titles;
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Object getItem(int position) {
        return titles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.sub_gridview, null);

        return view;
    }
}
