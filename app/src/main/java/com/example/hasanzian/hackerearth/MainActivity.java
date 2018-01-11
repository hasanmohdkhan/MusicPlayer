package com.example.hasanzian.hackerearth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        //getActionBar().setDisplayHomeAsUpEnabled(true);

        // Create an ArrayList of MusicModel objects
        ArrayList<MusicModel> musicModels = QueryUtils.extractEarthquakes();








        // Create an {@link MusicModelAdaptor}, whose data source is a list of
        // {@link musicModels}s. The adapter knows how to create list item views for each item
        // in the list.

            final MusicModelAdaptor musicModelAdaptor =new MusicModelAdaptor(this,musicModels);

            ListView listView = (ListView) findViewById(R.id.listview);
            listView.setAdapter(musicModelAdaptor);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    MusicModel currentMusicModel =  musicModelAdaptor.getItem(i);
                    Intent intent = new Intent(getApplicationContext(),NowPlayingActivity.class);
                    String songTitle = currentMusicModel.getmSongname();
                    String artistName = currentMusicModel.getmArtistName();

                    intent.putExtra("title" ,songTitle);
                    intent.putExtra("artistName" ,artistName);




                    startActivity(intent);

                }
            });









    }
}
