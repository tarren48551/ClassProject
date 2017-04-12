package com.tarren.classproject;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.allContactsName;
import static android.R.attr.name;
import static android.R.attr.phoneNumber;
import static com.tarren.classproject.R.drawable.contact;
import static com.tarren.classproject.R.id.userTextAccountAddress;
import static com.tarren.classproject.R.id.userTextAccountContact;
import static com.tarren.classproject.R.id.userTextAccountName;
import static com.tarren.classproject.R.id.userTextAccountPhone;

/**
 * Created by Tarren Policky
 */

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);


    }

    //onResume method
    public void onResume() {
        super.onResume();
    }

    //onPause method
    public void onPause() {
        super.onPause();
    }

    //onStop method
    public void onStop() {
        super.onStop();
    }

    //method to save the instance state
    public void onSaveInstanceState(Bundle saveInstanceState) {
        //save the view hierarchy state
        super.onSaveInstanceState(saveInstanceState);
    }

    //onDestroy method
    public void onDestroy() {
        super.onDestroy();
    }


    public void clickSaveAccount(View view) {
        final EditText userAccount = (EditText) findViewById(R.id.userTextAccountName);
        final EditText userContact = (EditText) findViewById(R.id.userTextAccountContact);
        final EditText userPhone = (EditText) findViewById(R.id.userTextAccountPhone);
        final EditText userAddress = (EditText) findViewById(R.id.userTextAccountAddress);

       // String name = userAccount.getText().toString();
        //String contactName = userContact.getText().toString();
        //String phone = userPhone.getText().toString();
        //String address = userAddress.getText().toString();

        saveToDB();

   }

    //method to save user input into accounts database
    private void saveToDB() {
        SQLiteDatabase database = new SQLDBHelper(this).getWritableDatabase();


        ContentValues values = new ContentValues();
        values.put(DBAccounts.AccountEntry.COLUMN_NAME, userTextAccountName);
        values.put(DBAccounts.AccountEntry.COLUMN_CONTACT, userTextAccountContact);
        values.put(DBAccounts.AccountEntry.COLUMN_PHONE, userTextAccountPhone);
        values.put(DBAccounts.AccountEntry.COLUMN_ADDRESS, userTextAccountAddress);

        long newRowId = database.insert(DBAccounts.AccountEntry.TABLE_NAME, null, values);
    }

}
