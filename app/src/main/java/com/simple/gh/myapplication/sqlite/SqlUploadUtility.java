package com.simple.gh.myapplication.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.simple.gh.myapplication.sqlobj.FileInfo;
import com.simple.gh.myapplication.utils.MyLog;

/**
 * Created by gh on 2017-09-14.
 */

public class SqlUploadUtility {
    public static void uploadDelete(MySQLite sql) {
        SQLiteDatabase db = sql.getWritableDatabase();

        int id = 0;
        Cursor cur = db.rawQuery("select * from uploadstore order by id desc limit 0, 1",null);
        while (cur.moveToNext()) {
            id = cur.getInt(cur.getColumnIndex("id"));
            MyLog.d(MyLog.TAG, "id = " + id);
        }

        db.execSQL("delete from uploadstore where id = ?", new String[] {"" +
                id});
    }

    public static void uploadInsert(MySQLite sql, FileInfo cont) {
        SQLiteDatabase db = sql.getWritableDatabase();

        ContentValues val = new ContentValues();

        val.put(MySQLite.UPLOAD_SEGMENT_IP, cont.getServerip());
        val.put(MySQLite.UPLOAD_SEGMENT_FILE_LEN, cont.getLength());
        val.put(MySQLite.UPLOAD_SEGMENT_START_POSITION, cont.getStart());
        val.put(MySQLite.UPLOAD_SEGMENT_CURRENT_POSITION, cont.getPos());

        db.insert(MySQLite.TABLE_NAME_UPLOAD, null, val);
    }
}
