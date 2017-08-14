package com.simple.gh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.simple.gh.myapplication.utils.MyLog;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        menu.add(Menu.NONE, 1,6,"menu 5");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.menu_one:
                MyLog.d(MyLog.TAG, "menu one");
                break;
            case R.id.menu_two:
                MyLog.d(MyLog.TAG, "menu two");
                break;
            case R.id.menu_three:
                MyLog.d(MyLog.TAG, "menu three");
                break;
        }

        return true;
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        MyLog.d(MyLog.TAG, "the menu opened");

//    return super.onMenuOpened(featureId, menu);
        return true;
    }

//    @Override
//    public void onContextMenuClosed(Menu menu) {
//
//        super.onContextMenuClosed(menu);
//        MyLog.d(MyLog.TAG, "the menu closed");
//    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
//        super.onOptionsMenuClosed(menu);
        MyLog.d(MyLog.TAG, "the menu closed");
    }
}
