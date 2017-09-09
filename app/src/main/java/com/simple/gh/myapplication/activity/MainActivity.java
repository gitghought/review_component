package com.simple.gh.myapplication.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.simple.gh.myapplication.R;
import com.simple.gh.myapplication.frag.FragmentOne;
import com.simple.gh.myapplication.frag.FragmentTwo;

/**
 * Created by gh on 2017-09-09.
 */

public class MainActivity extends SingleActivity {
    @NonNull
    @Override
    protected Fragment createFragment() {

        return new FragmentTwo();
    }
}
