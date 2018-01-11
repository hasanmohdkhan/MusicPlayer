package com.example.hasanzian.hackerearth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

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
        ImageView coverView = (ImageView)findViewById(R.id.cover_large_imageview);
        Bundle songData =getIntent().getExtras();

        if(songData==null){
            return;

        }

        String song =songData.getString("title");
        String artist =songData.getString("artistName");
        String cover = songData.getString("cover");
        Glide.with(this).load(cover).centerCrop().placeholder(R.drawable.music_note).into(coverView);
        songPlayingNow.setText(song);
        artistPlayingNow.setText(artist);


    }






}