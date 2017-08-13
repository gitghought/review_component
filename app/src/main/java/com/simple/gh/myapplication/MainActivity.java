package com.simple.gh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;

import com.simple.gh.myapplication.adapter.MyGridviewAdapter;
import com.simple.gh.myapplication.objs.MyVideos;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gvVideo;
    private ArrayList<MyVideos> videos = new ArrayList<>();

    private void initList() {
        for (int i = 0; i < 10; i++) {
            MyVideos video = new MyVideos();
            video.setContent("good" + i);
            video.setImgID(android.R.drawable.ic_delete);
            videos.add(video);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();

        gvVideo = (GridView) this.findViewById(R.id.gv_video);
        MyGridviewAdapter adapter =
                new MyGridviewAdapter(this, R.layout.gridview_layout, this.videos);
        gvVideo.setAdapter(adapter);
    }
}
