package com.tarren.classproject;

import android.provider.BaseColumns;

/**
 * Created by Tarren on 4/11/2017.
 */

public final class DBAccounts {
    private DBAccounts() {
    }

    public static class AccountEntry implements BaseColumns {
        public static final String TABLE_NAME = "accounts";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_CONTACT = "contact";
        public static final String COLUMN_PHONE = "phone";
        public static final String COLUMN_ADDRESS = "address";

        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXIST " + TABLE_NAME + "(" +
                _ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_NAME + " TEXT " + COLUMN_CONTACT
                + " TEXT " + COLUMN_PHONE + " INTEGER " + COLUMN_ADDRESS + " TEXT " + ")";
    }
}
