package com.simple.gh.myapplication;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.simple.gh.myapplication.obj.Contact;
import com.simple.gh.myapplication.sqlite.MySQLite;
import com.simple.gh.myapplication.sqlite.SqlContactUtility;
import com.simple.gh.myapplication.sqlite.SqlUploadUtility;
import com.simple.gh.myapplication.sqlobj.FileInfo;
import com.simple.gh.myapplication.utils.MyLog;
import com.simple.gh.myapplication.utils.MyStringGenerateUtility;
import com.simple.gh.myapplication.utils.SQLiteUtil;

import java.util.ArrayList;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MySQLite sql;
    private Button btnUploadDelete;
    private Button btnUploadInsert;
    private Button btnGetSql;
    private Button btnInsertData;
    private Button btnUpdateData;
    private Button btnDeleteData;
    private Button btnSeleteData;
    private SQLiteDatabase db;
    private ArrayList<Contact> conts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();
        initSQLite();
    }

    private void initButton() {
        this.btnUploadDelete = (Button) findViewById(R.id.btn_upload_delete);
        this.btnUploadDelete.setOnClickListener(this);

        this.btnUploadInsert = (Button) findViewById(R.id.btn_upload_insert);
        this.btnUploadInsert.setOnClickListener(this);

//        this.btnGetSql = (Button) findViewById(R.id.btn_get_sql);
//        this.btnGetSql.setOnClickListener(this);
//
//        this.btnInsertData= (Button) findViewById(R.id.btn_insert_data);
//        this.btnInsertData.setOnClickListener(this);
//
//        this.btnUpdateData= (Button) findViewById(R.id.btn_update);
//        this.btnUpdateData.setOnClickListener(this);
//
//        this.btnDeleteData= (Button) findViewById(R.id.btn_delete);
//        this.btnDeleteData.setOnClickListener(this);
//
//        this.btnSeleteData= (Button) findViewById(R.id.btn_selete);
//        this.btnSeleteData.setOnClickListener(this);

    }

    private void initSQLite() {
        this.sql = new MySQLite(this, MySQLite.SQLITE_NAME, null, 7);

//        readySQLData();
    }

    private void readySQLData() {
        for (int i = 0; i < 10; i++) {
            com.simple.gh.myapplication.obj.Contact cont = new Contact();

            cont = SqlContactUtility.getContactObj();

            conts.add(cont);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_upload_delete:
                MyLog.d(MyLog.TAG, "delete");
                SqlUploadUtility.uploadDelete(sql);
                break;
            case R.id.btn_upload_insert:
                FileInfo inf = new FileInfo();
//                inf.setServerip("172.20.10.7");
                inf.setServerip(MyStringGenerateUtility.getPhoneNum());

                SqlUploadUtility.uploadInsert(sql, inf);
                break;
//            case R.id.btn_selete:
//                db = sql.getWritableDatabase();
//
//                Cursor cursor = db.rawQuery("select * from contact", null);
//                if (cursor != null) {
//
//                    while (cursor.moveToNext()) {
//                        String name = cursor.getString(cursor.getColumnIndex("name"));
//                        MyLog.d(MyLog.TAG, "name = " + name);
//                    }
//                }
//
//                break;
//            case R.id.btn_delete:
//                db = sql.getWritableDatabase();
//
//                db.execSQL("delete from contact where id=3");
//
//                break;
//            case R.id.btn_update:
//                db = sql.getWritableDatabase();
//
//                db.execSQL("update contact set name='gson' where id=3");
//
//                break;
//            case R.id.btn_get_sql:
//                db = sql.getWritableDatabase();
//
//                break;
//            case R.id.btn_insert_data:
//                db = sql.getWritableDatabase();
//
//                for ( int i = 0; i < conts.size(); i++) {
//
//                    SQLiteUtil.myInsert(sql,conts.get(i));
//                }
//
////                db = sql.getWritableDatabase();
////                db.execSQL("insert into contact (name) values('good1')");
////                db.close();
//
////                db = sql.getWritableDatabase();
////
////                ContentValues values = new ContentValues();
////                values.put("name", "luck");
////                values.put("phonenum", "12998875643");
////
////                db.insert("contact", null, values);
//
//                break;
        }
    }
}
