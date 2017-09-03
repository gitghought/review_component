package com.simple.gh.myapplication;

import android.graphics.drawable.BitmapDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

import com.simple.gh.myapplication.utils.MyLog;

public class MainActivity extends AppCompatActivity {
    private ImageButton ibShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();
    }

    public void touch(View vv) {
        MyLog.d(MyLog.TAG, "touch");
    }

    private void initButton() {
        this.ibShow = (ImageButton) findViewById(R.id.ib_show);
        BitmapDrawable bd = (BitmapDrawable) ContextCompat.getDrawable(this, R.mipmap.ic_launcher);
        this.ibShow.setImageDrawable(bd);
        this.ibShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyLog.d(MyLog.TAG, "touch sub");
            }
        });
    }
}
