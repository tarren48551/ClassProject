package com.tarren.classproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Tarren Policky
 */

public class HonedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honed);
    }

    /** Method when user clicks Create Account Button */
    public void clickCreateAccount(View view) {
        Intent createAccount = new Intent(this, CreateAccount.class);
        startActivity(createAccount);
    } // end clickCreateAccount method

    /** Method when user clicks View Account Button */
    public void clickViewAccount(View view) {
        Intent viewAccount = new Intent(this, ViewAccount.class);
        startActivity(viewAccount);
    } // end clickViewAccount method

    /** Method when user clicks Create Invoice Button */
    public void clickCreateInvoice(View view) {
        Intent createInvoice = new Intent(this, CreateInvoice.class);
        startActivity(createInvoice);
    } // end clickCreateInvoice method

    /** Method when user clicks View Invoice Button */
    public void clickViewInvoice(View view) {
        Intent viewInvoice = new Intent(this, ViewInvoice.class);
        startActivity(viewInvoice);
    } //end clickViewInvoice method

}
