package com.simple.gh.myapplication;

import android.content.ContentValues;
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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MySQLite sql;
    private Button btnGetSql;
    private Button btnInsertData;
    private Button btnUpdateData;
    private Button btnDeleteData;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();
        initSQLite();

    }

    private void initButton() {

        this.btnGetSql = (Button) findViewById(R.id.btn_get_sql);
        this.btnGetSql.setOnClickListener(this);

        this.btnInsertData= (Button) findViewById(R.id.btn_insert_data);
        this.btnInsertData.setOnClickListener(this);

        this.btnUpdateData= (Button) findViewById(R.id.btn_update);
        this.btnUpdateData.setOnClickListener(this);

        this.btnDeleteData= (Button) findViewById(R.id.btn_delete);
        this.btnDeleteData.setOnClickListener(this);

    }

    private void initSQLite() {
        this.sql = new MySQLite(this, "MyContact.db", null, 4);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_delete:
                db = sql.getWritableDatabase();

                db.execSQL("delete from contact where id=3");
                break;
            case R.id.btn_update:
                db = sql.getWritableDatabase();

                db.execSQL("update contact set name='gson' where id=3");

                break;
            case R.id.btn_get_sql:
                db = sql.getWritableDatabase();

                break;
            case R.id.btn_insert_data:

//                db = sql.getWritableDatabase();
//                db.execSQL("insert into contact (name) values('good1')");
//                db.close();

                db = sql.getWritableDatabase();

                ContentValues values = new ContentValues();
                values.put("name", "luck");
                values.put("phonenum", "12998875643");

                db.insert("contact", null, values);

                break;
        }
    }
}
