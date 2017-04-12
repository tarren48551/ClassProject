package com.tarren.classproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Tarren Policky
 */

public class ViewAccount extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewaccount);
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
