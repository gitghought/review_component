package com.simple.gh.myapplication.activity;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.simple.gh.myapplication.R;
import com.simple.gh.myapplication.frag.FragmentOne;
import com.simple.gh.myapplication.frag.FragmentTwo;
import com.simple.gh.myapplication.utils.MyLog;

import static android.R.attr.id;

public class SingleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction trans = fm.beginTransaction();

        trans.add(getFragmentContainer(), createFragment());

        trans.commit();


    }

    @NonNull
    protected FragmentOne createFragment() {
        return new FragmentOne();
    }

    protected int getFragmentContainer() {
        return R.id.fl_master_fragment_container;
    }
}
