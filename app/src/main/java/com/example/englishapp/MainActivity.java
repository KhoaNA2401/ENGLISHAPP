package com.example.englishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    Button quitBtn,playBtn,highScore,guideBtn;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        highScore = findViewById(R.id.highScoreBtn);
        quitBtn =findViewById(R.id.quitBtn);
        mAuth= FirebaseAuth.getInstance();
        playBtn=findViewById(R.id.playBtn);

        guideBtn=findViewById(R.id.guideBtn);
        guideBtn.setOnClickListener(view ->{
            startActivity(new Intent(MainActivity.this, guidegame.class));
            MediaPlayer mediaPlayer =
                    MediaPlayer.create(MainActivity.this,R.raw.click );
            mediaPlayer.start();
        });

        quitBtn.setOnClickListener(view ->{
            mAuth.signOut();
            startActivity(new Intent(MainActivity.this, login.class));
            MediaPlayer mediaPlayer =
                    MediaPlayer.create(MainActivity.this,R.raw.click );
            mediaPlayer.start();
        });

        playBtn.setOnClickListener(view ->{
            startActivity(new Intent(MainActivity.this, mode.class));
            MediaPlayer mediaPlayer =
                    MediaPlayer.create(MainActivity.this,R.raw.click );
            mediaPlayer.start();
        });
        highScore.setOnClickListener(view ->{
            startActivity(new Intent(MainActivity.this, history.class));
            MediaPlayer mediaPlayer =
                    MediaPlayer.create(MainActivity.this,R.raw.click );
            mediaPlayer.start();
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if (user == null){
            startActivity(new Intent(MainActivity.this, login.class));
        }
    }
}