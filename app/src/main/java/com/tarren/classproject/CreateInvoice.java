package com.tarren.classproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Tarren Policky
 */

public class CreateInvoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createinvoice);
    }

    public void clickSaveInvoice(View view) {
        Toast.makeText(this, R.string.save_invoice_button, Toast.LENGTH_SHORT).show();
    }
}
