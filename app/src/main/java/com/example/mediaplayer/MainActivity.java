package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //widgets
    Button forward_btn,backward_btn,play_btn,stop_btn;
    TextView time_txt, title_txt;
    SeekBar seekBar;
    //
    MediaPlayer mediaPlayer;

    //Handlers

    Handler handler =  new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}