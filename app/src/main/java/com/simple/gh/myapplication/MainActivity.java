package com.simple.gh.myapplication;

import android.graphics.drawable.BitmapDrawable;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.simple.gh.myapplication.utils.MyLog;

public class MainActivity extends AppCompatActivity {
    private ImageView ivShow;
    private ImageView ivSubShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    public void testParam(int b, int c, String a) {

    }

    private void initView() {
        //ImageView
        this.ivShow = (ImageView) findViewById(R.id.iv_show);
        this.ivShow.setLayoutParams(new LinearLayout.LayoutParams(200, 200));
        int height = this.ivShow.getLayoutParams().height;
        int wid = this.ivShow.getLayoutParams().width;
        MyLog.d(MyLog.TAG, "height = " + height + "  width = " + wid);

        BitmapDrawable bd = (BitmapDrawable) ivShow.getDrawable();

        this.ivSubShow = (ImageView) findViewById(R.id.iv_sub_show);
        this.ivSubShow.setImageDrawable(bd);
    }
}
