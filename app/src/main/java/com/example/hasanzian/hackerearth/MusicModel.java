package com.example.hasanzian.hackerearth;

/**
 * Created by hasanZian on 24-12-2017.
 */

public class MusicModel {

    // Song Name i.e Afreen Afreen
    private String mSongname;
    // Artist Name i.e Rahat Fateh Ali Khan, Momina Mustehsan
    private String mArtistName;
    // cover_image
    private String mAlbumArt;

        /*
    * Create a new MusicModel object.
    *
    * @param mSongName is the name of the Song
    * @param mArtist is the Artist Name
    * @param image is drawable reference ID that corresponds to Album art
    * */

    public MusicModel(String Song, String Artist, String CoverImage) {
        mSongname = Song;
        mArtistName = Artist;
        mAlbumArt = CoverImage;
    }

    /* Get the name of Song
    * */
    public String getmSongname() {
        return mSongname;
    }

    /* Get the name of Artist
* */
    public String getmArtistName() {
        return mArtistName;
    }

    /* Get the image for CoverImage
* */

    public String getmAlbumArt() {
        return mAlbumArt;
    }
}