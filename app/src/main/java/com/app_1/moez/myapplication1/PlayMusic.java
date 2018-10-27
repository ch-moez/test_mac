package com.app_1.moez.myapplication1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class PlayMusic extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);


        //Delcare un variable Media Player
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.m);
        //Declare le boutton pour faire play le musique
        Button btn_Player = (Button) findViewById(R.id.btn_play_Music);
        Button btn_Stop = (Button) findViewById(R.id.btn_stop);
        final Button btn_Pause = (Button) findViewById(R.id.btn_Pause);

        //Add Back button
        getSupportActionBar().setTitle("Play musiccc");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_Player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mp.start();
            }
        });

        btn_Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });


        btn_Pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });



    }

    //click item of the menu back

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id_Select = item.getItemId();
        if (id_Select == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }




}
