package com.example.hasanzian.hackerearth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by hasanZian on 26-12-2017.
 */

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen_activity);

        TextView listOfSong = (TextView)findViewById(R.id.home_screen_textview);

        listOfSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songlistIntent = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(songlistIntent);
            }
        });

        TextView favourite = (TextView)findViewById(R.id.fav_screen_textview);

        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favIntent = new Intent(HomeActivity.this,FavouriteSongActivity.class);
                startActivity(favIntent);
            }
        });




        TextView downloadTextview = (TextView)findViewById(R.id.download_screen_textview);

        downloadTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favIntent = new Intent(HomeActivity.this ,DownloadedSongsActivity .class);
                startActivity(favIntent);
            }
        });








    }





}
