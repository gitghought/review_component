package com.simple.gh.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.simple.gh.myapplication.R;
import com.simple.gh.myapplication.sqlobj.Contact;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by gh on 2017-09-09.
 */

public class MyAdapter extends ArrayAdapter {
    private Context context;
    private int resource;
    private ArrayList<Contact> obj;
    public MyAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.obj = (ArrayList<Contact>) objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.context);
        View view = inflater.inflate(this.resource, parent, false);

//        TextView tvName = (TextView) view.findViewById(R.id.tv_name);
//        TextView tvPhone= (TextView) view.findViewById(R.id.tv_phone);

//        tvName.setText(this.obj.get(position).getName());
//        tvPhone.setText(this.obj.get(position).getPhone());

        return view;
    }
}
