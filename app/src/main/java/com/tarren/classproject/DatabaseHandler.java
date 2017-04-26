package com.tarren.classproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Tarren on 4/25/2017.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    //Database Version
    private static final int DATABASE_VERSION = 1;

    //Database Name
    private static final String DATABASE_NAME = "accountManager";

    //Account table name
    private static final String TABLE_ACCOUNT = "account";

    //Account Table column names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_CONTACT = "contact";
    private static final String KEY_PHONE = "phone";
    private static final String KEY_ADDRESS = "address";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Create Table
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_ACCOUNT_TABLE = "CREATE TABLE " + TABLE_ACCOUNT + "{"
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,'"
                + KEY_CONTACT + " TEXT," + KEY_PHONE + " TEXT,"
                + KEY_ADDRESS + " TEXT," + ")";
        db.execSQL(CREATE_ACCOUNT_TABLE);
    }

    //Upgrade Database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //drop older table if exist
        db.execSQL(("DROP TABLE IF EXIST " + TABLE_ACCOUNT));

        //create tables again
        onCreate(db);
    }

    //Add new account
    void addAccount(Account account) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, account.getName()); //Account Name
        values.put(KEY_CONTACT, account.getContactName()); //Contact Name
        values.put(KEY_PHONE, account.getPhone()); //Phone Number
        values.put(KEY_ADDRESS, account.getAddress()); //Address

        //insert row
        db.insert(TABLE_ACCOUNT, null, values);
        db.close();
    }
}
