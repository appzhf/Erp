package com.example.zhf.erp.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2017/5/8.
 */

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "Erp.db";
    private static final int VERSION = 1;
    private static final String path = "/data/data/com.example.zhf.erp/databases/Erp.db";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        System.out.println("创建表--------");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
