package com.example.englishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class guidecw extends AppCompatActivity {
    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidecw);
        home=findViewById(R.id.homeBtn);
        home.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            MediaPlayer mediaPlayer =
                    MediaPlayer.create(guidecw.this, R.raw.click);
            mediaPlayer.start();
        });

    }
}