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
    private boolean isDelshow;

    public MyGridviewAdapter(Context context, int resource, ArrayList<MyVideos> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.videos = objects;
        this.resource = resource;
    }

    private class MyViewHolder {
        private ImageView ivPic;
        private TextView tvCont;
        private ImageView ivDel;
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
        return this.videos.size() + 1;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = null;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(this.mContext);
            view = inflater.inflate(R.layout.gridview_layout, parent, false);

            convertView = view;

            holder = new MyViewHolder();
            holder.ivPic = (ImageView) view.findViewById(R.id.iv_pic);
            holder.ivDel= (ImageView) view.findViewById(R.id.iv_delete);
            holder.ivDel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    videos.remove(position);
                    MyGridviewAdapter.this.setOnShowDelete(false);
                }
            });
            holder.tvCont = (TextView) view.findViewById(R.id.tv_cont);

            convertView.setTag(holder);
        } else {
            view = convertView;
            holder = (MyViewHolder) view.getTag();
        }

        if (position < videos.size()) {


            holder.ivPic.setImageResource(videos.get(position).getImgID());
            holder.tvCont.setText(videos.get(position).getContent());
            if (this.isDelshow) {
                holder.ivDel.setVisibility(ImageView.VISIBLE);
            } else {
                holder.ivDel.setVisibility(ImageView.GONE);
            }
        } else {
            holder.ivPic.setImageResource(android.R.drawable.ic_menu_add);
        }

        return view;
    }

    public void setOnShowDelete (boolean isShow) {
        this.isDelshow = isShow;
        this.notifyDataSetChanged();
    }
}
