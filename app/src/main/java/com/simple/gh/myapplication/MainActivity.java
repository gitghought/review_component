package com.simple.gh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.simple.gh.myapplication.utils.MyLog;
import com.simple.gh.myapplication.utils.MyStringGenerateUtility;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyLog.d(MyLog.TAG, "---" + MyStringGenerateUtility.getStr());
    }

}
