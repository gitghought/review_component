package com.simple.gh.myapplication.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.simple.gh.myapplication.utils.MyLog;

/**
 * Created by gh on 2017-09-06.
 */

public class MySQLite extends SQLiteOpenHelper{
    private Context mContext;
    public static final String SQLITE_NAME = "MyContact.db";
    public static final String TABLE_NAME_CONTACT = "contact";
    public static final String TABLE_NAME_UPLOAD= "uploadstore";

    private static final String sqlStr = "create table contact (" +
            "id integer primary key autoincrement, " +
            "name text, " +
            "phonenum text, " +
            "addr text " +
            ")";

    public static final String UPLOAD_SEGMENT_IP = "serverip";
    public static final String UPLOAD_SEGMENT_FILE_LEN= "length";
    public static final String UPLOAD_SEGMENT_START_POSITION = "start";
    public static final String UPLOAD_SEGMENT_CURRENT_POSITION = "pos";

    private static final String sqlPosition = "create table uploadstore(" +
            "id integer primary key autoincrement, " +
            "serverip text, " +
            "length integer, " +
            "start integer, " +
            "pos integer " +
            ")";

    public MySQLite(
            Context context,
            String name,
            SQLiteDatabase.CursorFactory factory,
            int version) {
        super(context, name, factory, version);
        this.mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlStr);
        db.execSQL(sqlPosition);
        MyLog.d(MyLog.TAG, "MySQLite->onCreate");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_NAME_CONTACT);
        db.execSQL("drop table if exists " + TABLE_NAME_UPLOAD);
        onCreate(db);
    }
}
