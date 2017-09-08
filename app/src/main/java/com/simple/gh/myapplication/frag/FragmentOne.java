package com.simple.gh.myapplication.frag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.simple.gh.myapplication.R;

/**
 * Created by gh on 2017-09-08.
 */

public class FragmentOne extends Fragment implements View.OnClickListener{
    private Button btnChange;
    private Button btnChangeThree;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_one, container, false);

        TextView tvName = (TextView) view.findViewById(R.id.tv_name);
        btnChange = (Button) view.findViewById(R.id.btn_change);
        btnChange.setOnClickListener(this);

        btnChangeThree = (Button) view.findViewById(R.id.btn_change_three);
        btnChangeThree.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = this.getActivity().getSupportFragmentManager();
        FragmentTransaction trans = fm.beginTransaction();

        switch (v.getId()) {
            case R.id.btn_change_three:

                trans.replace(R.id.ll_fragment_container, new FragmentThree());
                trans.commit();

                break;
            case R.id.btn_change:

                trans.replace(R.id.ll_fragment_container, new FragmentTwo());
                trans.commit();

                break;
        }
    }
}
