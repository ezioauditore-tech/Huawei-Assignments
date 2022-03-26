package com.example.lose_yourself;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton stop,play;
    ImageView lose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stop=findViewById(R.id.stop);
        play=findViewById(R.id.play);
        lose=findViewById(R.id.imageview);
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.lose_yourself_eminem);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stop.setEnabled(true);
                play.setEnabled(false);
                mediaPlayer.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play.setEnabled(true);
                stop.setEnabled(false);
                mediaPlayer.pause();
            }
        });
    }
}