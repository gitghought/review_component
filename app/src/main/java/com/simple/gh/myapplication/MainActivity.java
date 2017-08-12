package com.simple.gh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private SpinnerAdapter adapter;
    private ArrayList<String> months = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMonth();

        spinner = (Spinner) findViewById(R.id.spinner_month);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, months);
        spinner.setAdapter(adapter);
    }

    private void initMonth() {
        for (int i = 0; i < 3; i++) {
            months.add("month " + i);
        }
    }
}
