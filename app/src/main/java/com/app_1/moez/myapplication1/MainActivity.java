package com.app_1.moez.myapplication1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clikmee(View vieeewwww) {
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    public void openActivity(View view) {
        Intent My_intent = new Intent(this,Activity_2.class);
        startActivity(My_intent);

    }

    public void goToPlayMusic(View viiiiie)
    {
        Intent My_intent = new Intent (MainActivity.this,PlayMusic.class);
        startActivity(My_intent);
    }

    public void goTo_WebView(View view) {
        startActivity(new Intent(this,Activity_WebView.class));
    }
}
