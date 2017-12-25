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

        // Create an ArrayList of MusicModel objects
        ArrayList<MusicModel> musicModels =new ArrayList<MusicModel>();

        musicModels.add(new MusicModel("Afreen Afreen" ,"Rahat Fateh Ali Khan, Momina Mustehsan",R.drawable.music_note));
        musicModels.add(new MusicModel("Aik Alif" ,"Saieen Zahoor, Noori",R.drawable.music_note));
        musicModels.add(new MusicModel("Tajdar e haram" ,"Atif Aslam",R.drawable.music_note));
        musicModels.add(new MusicModel("Aaj Rung" ,"Amjad Sabri, Rahat Fateh Ali Khan",R.drawable.music_note));
        musicModels.add(new MusicModel("Ae dil  Ali Zafar" ,"Sara Haider",R.drawable.music_note));
        musicModels.add(new MusicModel("Man Amadeh am" ," Atif Aslam, Gul Panrra",R.drawable.music_note));
        musicModels.add(new MusicModel("Bewajah" ,"Nabeel Shaukat Ali",R.drawable.music_note));
        musicModels.add(new MusicModel("Dinae Dinae" ,"Harshadeep Kaur",R.drawable.music_note));
        musicModels.add(new MusicModel("Tera woh pya Momina" ," Mustehsan, Asim Azhar",R.drawable.music_note));
        musicModels.add(new MusicModel("Shamaan Pai gaiyan" ,"Rachel Viccaji, Kashif Ali",R.drawable.music_note));








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
                    startActivity(intent);

                }
            });









    }
}
