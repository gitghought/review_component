package com.simple.gh.myapplication.activity;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
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

        Fragment frag = fm.findFragmentById(R.id.fl_master_fragment_container);

        if (frag == null) {
            frag = createFragment();
            trans.add(getFragmentContainer(), frag);
            trans.commit();
        }
    }

    @NonNull
    protected Fragment createFragment() {
        return new FragmentOne();
    }

    protected int getFragmentContainer() {
        return R.id.fl_master_fragment_container;
    }
}
