package com.simple.gh.myapplication.frag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.simple.gh.myapplication.R;

/**
 * Created by gh on 2017-09-08.
 */

public class FragmentThree extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_two, container, false);

        TextView tvName = (TextView) view.findViewById(R.id.tv_phone);
        tvName.setText("the third fragment");

        return view;
    }
}
