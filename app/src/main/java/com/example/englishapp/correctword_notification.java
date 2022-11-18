package com.example.englishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class correctword_notification extends AppCompatActivity {
    TextView Txt1;
    Button BT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correctword_notification);
        Txt1 = (TextView)findViewById(R.id.TxtThongbao);
        BT = (Button) findViewById(R.id.BtnBacktb);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer =
                        MediaPlayer.create(correctword_notification.this,R.raw.click );
                mediaPlayer.start();
                finish();
            }
        });
    }
}