package com.simple.gh.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.simple.gh.myapplication.sqlite.MySQLite;
import com.simple.gh.myapplication.utils.MyLog;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {
    private MySQLite sql;
    private Button btnGetSql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();
        initSQLite();

    }

    private void initButton() {
        this.btnGetSql = (Button) findViewById(R.id.btn_get_sql);
        this.btnGetSql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = sql.getWritableDatabase();
            }
        });
    }

    private void initSQLite() {
        this.sql = new MySQLite(this, "MyContact", null, 3);
    }

}
