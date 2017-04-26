package com.tarren.classproject;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by Tarren Policky
 */

public class CreateAccount extends AppCompatActivity {

    private EditText name, contact, phone, address;
    private Button save;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);

        DatabaseHandler db = new DatabaseHandler(this);

        name = (EditText) findViewById(R.id.userTextAccountName);
        contact = (EditText) findViewById(R.id.userTextAccountContact);
        phone = (EditText) findViewById(R.id.userTextAccountPhone);
        address = (EditText) findViewById(R.id.userTextAccountAddress);

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

}
