package com.app_1.moez.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Add Back button in Action bar in onCreat Methode
        getSupportActionBar().setTitle("Name of Activty");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
    // Select item for the Menu if id = android.R.id.home ----> Back
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home)
        { this.finish(); }
        return super.onOptionsItemSelected(item);
    }
}
