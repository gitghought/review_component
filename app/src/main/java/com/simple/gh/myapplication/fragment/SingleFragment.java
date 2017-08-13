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

public  class SingleFragment extends Fragment{
    public  int getResourceLayout() {
        return R.layout.viewpager_sub_component;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(this.getResourceLayout(), container, false);
    }
}
