package com.example.hasanzian.hackerearth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by hasanZian on 25-12-2017.
 */

//TODO list 1. CoverIamge Parsing
//

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_player);


        TextView songPlayingNow = (TextView)findViewById(R.id.song_textview);
        TextView artistPlayingNow = (TextView)findViewById(R.id.artist_textview);
        Bundle songData =getIntent().getExtras();

        if(songData==null){
            return;

        }

        String song =songData.getString("title");
        String artist =songData.getString("artistName");
        songPlayingNow.setText(song);
        artistPlayingNow.setText(artist);


    }






}