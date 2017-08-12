package com.simple.gh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.simple.gh.myapplication.utils.MyLog;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private SpinnerAdapter adapter;
    private ArrayList<String> seasons = new ArrayList<>();

    private Spinner spineer_month;
    private SpinnerAdapter adapter_month;
    private String months[][] = new String [][] {
        {"month1", "month2", "month3"},
        {"month4", "month5", "month6"},
        {"month7", "month8", "month9"},
        {"month10", "month11", "month12"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initSeason();

        spinner = (Spinner) findViewById(R.id.spinner_season);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, seasons);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                MyLog.d(MyLog.TAG, "onItemClick -> " + seasons.get(position));
                spineer_month = (Spinner) findViewById(R.id.spinner_month);
                adapter_month = new ArrayAdapter<String>(
                        MainActivity.this,
                        android.R.layout.simple_list_item_1,
                        months[position]
                );
                spineer_month.setAdapter(adapter_month);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initSeason() {
        for (int i = 0; i < 4; i++) {
            seasons.add("Seasons " + i);
        }
    }
}
