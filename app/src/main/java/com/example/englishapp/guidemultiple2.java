package com.example.englishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class guidemultiple2 extends AppCompatActivity {
    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidemultiple2);
        home=findViewById(R.id.homeBtn);
        home.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            MediaPlayer mediaPlayer =
                    MediaPlayer.create(guidemultiple2.this, R.raw.click);
            mediaPlayer.start();
        });

    }
}