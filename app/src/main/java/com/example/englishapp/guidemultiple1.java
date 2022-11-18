package com.example.englishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class guidemultiple1 extends AppCompatActivity {
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidemultiple1);
        next=findViewById(R.id.nextBtn);
        next.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), guidemultiple2.class));
            MediaPlayer mediaPlayer =
                    MediaPlayer.create(guidemultiple1.this, R.raw.click);
            mediaPlayer.start();
        });

    }
}