package com.example.hasanzian.hackerearth;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hasanZian on 24-12-2017.
 */

public class MusicModelAdaptor extends ArrayAdapter<MusicModel> {


    public MusicModelAdaptor(Activity context, ArrayList<MusicModel> musicModels){

        super(context,0,musicModels);


    }


    @NonNull
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null){

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.listview_music_model,parent,false);
        }

        MusicModel currentMusicModel = getItem(position);

        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        songNameTextView.setText(currentMusicModel.getmSongname());

        TextView artistNameTextView = (TextView)listItemView.findViewById(R.id.artist_name);
        artistNameTextView.setText(currentMusicModel.getmArtistName());


        ImageView coverIamge =(ImageView)listItemView.findViewById(R.id.albumart);
        coverIamge.setImageResource(currentMusicModel.getmAlbumArt());


        return listItemView;
    }
}
