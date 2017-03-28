package com.tarren.classproject;

/**
 * Created by Tarren Policky
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Method when user clicks sign-in button */
    public void clickSignIn(View view) {
        Intent signIn = new Intent(this, HonedActivity.class);
        startActivity(signIn);
    }
}
