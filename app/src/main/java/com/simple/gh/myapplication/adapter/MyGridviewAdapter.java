package com.simple.gh.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.simple.gh.myapplication.R;
import com.simple.gh.myapplication.objs.MyVideos;
import com.simple.gh.myapplication.utils.MyLog;

import java.util.ArrayList;
import java.util.List;

import static android.R.drawable.ic_delete;

/**
 * Created by gh on 2017-08-13.
 */

public class MyGridviewAdapter extends ArrayAdapter<MyVideos> {
    private Context mContext;
    private ArrayList<MyVideos> videos = new ArrayList<>();
    private MyViewHolder holder;
    private int resource;

    public MyGridviewAdapter(Context context, int resource, ArrayList<MyVideos> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.videos = objects;
        this.resource = resource;
    }

    private class MyViewHolder {
        private ImageView ivPic;
        private TextView tvCont;
    }

    @Nullable
    @Override
    public MyVideos getItem(int position) {
        return this.videos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return this.videos.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(this.mContext);
            view = inflater.inflate(R.layout.gridview_layout, parent, false);

            convertView = view;

            holder = new MyViewHolder();
            holder.ivPic = (ImageView) view.findViewById(R.id.iv_pic);
            holder.tvCont = (TextView) view.findViewById(R.id.tv_cont);

            convertView.setTag(holder);
        } else {
            view = convertView;
            holder = (MyViewHolder) view.getTag();
        }

        holder.ivPic.setImageResource(android.R.drawable.ic_delete);
        holder.tvCont.setText("good");

        MyLog.d(MyLog.TAG, "end of getview");

        return view;
    }
}
