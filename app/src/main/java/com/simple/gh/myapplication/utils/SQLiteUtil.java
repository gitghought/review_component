package com.simple.gh.myapplication.utils;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.simple.gh.myapplication.sqlite.MySQLite;
import com.simple.gh.myapplication.sqlobj.Contact;

/**
 * Created by gh on 2017-09-08.
 */

public class SQLiteUtil {
    public static final String DATABASENAME = "contact";
    public static final String TABLE_NAME = "name";
    public static final String TABLE_PHONE= "phonenum";
    public static void myInsert(MySQLite sql, Contact cont) {
        SQLiteDatabase db = sql.getWritableDatabase();

        ContentValues val = new ContentValues();
        val.put(TABLE_NAME, cont.getName());
        val.put(TABLE_PHONE, cont.getPhone());

        db.insert(DATABASENAME, null, val);
    }
}
