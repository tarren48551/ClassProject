package com.tarren.classproject;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Tarren Policky
 */

public class CreateInvoice extends AppCompatActivity {
    InvoiceDatabaseHelper myDb;
    EditText editAccount, editDate, editItem, editPrice;
    Button btnSave, btnView;
    TextView textTotalPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createinvoice);
        myDb = new InvoiceDatabaseHelper(this);

        btnSave = (Button)this.findViewById(R.id.btnSave);
        btnView = (Button)this.findViewById(R.id.btnView);

        editAccount = (EditText) findViewById(R.id.editTextAccount);
        editDate = (EditText) findViewById(R.id.editDate);
        editItem = (EditText) findViewById(R.id.editItem);
        editPrice = (EditText) findViewById(R.id.editPrice);
        textTotalPrice = (TextView)findViewById(R.id.textPrice2);
        AddData();
        viewAll();


    }

    public void AddData() {
        btnSave.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(editAccount.getText().toString(),
                                editDate.getText().toString(), editItem.getText().toString(),
                                editPrice.getText().toString(), textTotalPrice.getText().toString());
                        if(isInserted == true)
                            Toast.makeText(CreateInvoice.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(CreateInvoice.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void viewAll() {
        btnView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getAllData();
                        if(res.getCount() == 0) {
                            // show message
                            showMessage("Error","Nothing found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("Id :"+ res.getString(0)+"\n");
                            buffer.append("Account :"+ res.getString(1)+"\n");
                            buffer.append("Date :"+ res.getString(2)+"\n");
                            buffer.append("Item :"+ res.getString(3)+"\n");
                            buffer.append("Price :"+ res.getString(4)+"\n");
                            buffer.append("Total :"+ res.getString(6)+"\n\n");
                        }

                        // Show all data
                        showMessage("Data",buffer.toString());
                    }
                }
        );
    }


    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
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
