package com.tarren.classproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Tarren Policky
 */

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);
    }

    /** Method to save account when user clicks Save Button */
    public void clickSaveAccount(View view) {
        Toast saveAccountToast = Toast.makeText(this, R.string.save_account_button, Toast.LENGTH_LONG);
        saveAccountToast.show();
    }

}
