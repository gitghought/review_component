package com.simple.gh.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;

import com.simple.gh.myapplication.adapter.SelfMenuAdapter;
import com.simple.gh.myapplication.utils.MyLog;

import java.util.ArrayList;

import static android.R.attr.alertDialogIcon;
import static android.R.attr.id;
import static android.R.attr.isScrollContainer;
import static android.R.attr.keycode;
import static android.R.attr.title;

public class MainActivity extends AppCompatActivity {
    private static final int ITEM_ID = 5;
    private GridView gvContent;
    private SelfMenuAdapter adapter = null;
    private ArrayList<String> titles = new ArrayList<>();
    private AlertDialog dialog;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTitles();

//        gvContent = (GridView) findViewById(R.id.gv_container);
        view =  LayoutInflater.from(this).inflate(R.layout.gridview_container, null);
        dialog = new AlertDialog.Builder(this).create();
        dialog.setView(view);

        gvContent = (GridView) view.findViewById(R.id.gv_container);
        adapter = new SelfMenuAdapter(this, titles);
        if (gvContent == null) {
            MyLog.d(MyLog.TAG, "gvContent is null");
        } else {
            gvContent.setAdapter(adapter);
        }

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        MyLog.d(MyLog.TAG, "key down" + keyCode);
        if (keycode == KeyEvent.KEYCODE_MENU) {
            MyLog.d(MyLog.TAG, "menu key down");
            if (dialog == null) {
                dialog = new AlertDialog.Builder(this).setView(view).create();
                dialog.show();
            } else {
                dialog.show();
            }

        }
        return super.onKeyDown(keyCode, event);
    }

    private void initTitles() {

        for (int i = 0; i < 3; i++) {
            titles.add("good" + i);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu, menu);
        menu.add(Menu.NONE, ITEM_ID, 6, "menu 5");

        return super.onCreateOptionsMenu(menu);
//        return true;
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        MyLog.d(MyLog.TAG, "the menu opened");

        if (dialog == null) {
            dialog = new AlertDialog.Builder(this).setView(view).create();
            dialog.show();
        } else {
            dialog.show();
        }
//        menu.close();
        return false;
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
//        super.onOptionsMenuClosed(menu);
        MyLog.d(MyLog.TAG, "the menu closed");
    }
}
