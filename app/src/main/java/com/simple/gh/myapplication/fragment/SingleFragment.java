package com.simple.gh.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.simple.gh.myapplication.R;

/**
 * Created by gh on 2017-08-13.
 */

public class SingleFragment extends Fragment{
    private int resource;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getResource(), null);
    }

    public int getResource() {
        return R.layout.tab1;
    }
}
