package com.tarren.classproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Tarren on 4/11/2017.
 */

public class SQLDBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "accounts_database";

    public SQLDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DBAccounts.AccountEntry.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase  sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXIST " + DBAccounts.AccountEntry.TABLE_NAME);
    }
}
