package com.example.hasanzian.hackerearth;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by hasanZian on 11-01-2018.
 *
 * This class parse Json and added respective field to there view
 *
 */

public final class QueryUtils {

    /** Sample JSON response for a Music stream site */
    private static final String SAMPLE_JSON_RESPONSE = "[\n" +
            "{\n" +
            "\"song\": \"Afreen Afreen\",\n" +
            "\"url\": \"http://hck.re/Rh8KTk\",\n" +
            "\"artists\": \"Rahat Fateh Ali Khan, Momina Mustehsan\",\n" +
            "\"cover_image\": \"http://hck.re/kWWxUI\"\n" +
            "},\n" +
            "{\n" +
            "\"song\": \"Aik Alif\",\n" +
            "\"url\": \"http://hck.re/ZeSJFd\",\n" +
            "\"artists\": \"Saieen Zahoor, Noori\",\n" +
            "\"cover_image\": \"http://hck.re/3Cm0IX\"\n" +
            "},\n" +
            "{\n" +
            "\"song\": \"Tajdar e haram\",\n" +
            "\"url\": \"http://hck.re/wxlUcX\",\n" +
            "\"artists\": \"Atif Aslam\",\n" +
            "\"cover_image\": \"http://hck.re/5dh4D5\"\n" +
            "},\n" +
            "{\n" +
            "\"song\": \"Aaj Rung\",\n" +
            "\"url\": \"http://hck.re/H5nMm3\",\n" +
            "\"artists\": \"Amjad Sabri,  Rahat Fateh Ali Khan\",\n" +
            "\"cover_image\": \"http://hck.re/U1bRnt\"\n" +
            "},\n" +
            "{\n" +
            "\"song\": \"Ae dil\",\n" +
            "\"url\": \"http://hck.re/2nCncK\",\n" +
            "\"artists\": \"Ali Zafar, Sara Haider\",\n" +
            "\"cover_image\": \"http://hck.re/eLtjUb\"\n" +
            "},\n" +
            "{\n" +
            "\"song\": \"Man Amadeh am\",\n" +
            "\"url\": \"http://hck.re/epOzj9\",\n" +
            "\"artists\": \"Atif Aslam, Gul Panrra\",\n" +
            "\"cover_image\": \"http://hck.re/KvT2Vv\"\n" +
            "},\n" +
            "{\n" +
            "\"song\": \"Bewajah\",\n" +
            "\"url\": \"http://hck.re/YkbDDP\",\n" +
            "\"artists\": \"Nabeel Shaukat Ali\",\n" +
            "\"cover_image\": \"http://hck.re/N29EEt\"\n" +
            "},\n" +
            "{\n" +
            "\"song\": \"Dinae Dinae\",\n" +
            "\"url\": \"http://hck.re/dMquYY\",\n" +
            "\"artists\": \"Harshadeep Kaur\",\n" +
            "\"cover_image\": \"http://hck.re/6l9QqH\"\n" +
            "},\n" +
            "{\n" +
            "\"song\": \"Tera woh pyar\",\n" +
            "\"url\": \"http://hck.re/64Tzod\",\n" +
            "\"artists\": \"Momina Mustehsan, Asim Azhar\",\n" +
            "\"cover_image\": \"http://hck.re/rlYqJY\"\n" +
            "},\n" +
            "{\n" +
            "\"song\": \"Shamaan Pai gaiyan\",\n" +
            "\"url\": \"http://hck.re/VhtQGh\",\n" +
            "\"artists\": \"Rachel Viccaji, Kashif Ali\",\n" +
            "\"cover_image\": \"http://hck.re/gs0grk\"\n" +
            "}\n" +
            "]";
    /**
     * Create a private constructor because no one should ever create a {@link QueryUtils} object.
     * This class is only meant to hold static variables and methods, which can be accessed
     * directly from the class name QueryUtils (and an object instance of QueryUtils is not needed).
     */
    private QueryUtils() {
    }

    /**
     * Return a list of {@link MusicModel} objects that has been built up from
     * parsing a JSON response.
     */
    public static ArrayList<MusicModel> extractEarthquakes() {

        // Create an empty ArrayList that we can start adding earthquakes to
        ArrayList<MusicModel>  musicModels = new ArrayList<>();

        // Try to parse the SAMPLE_JSON_RESPONSE. If there's a problem with the way the JSON
        // is formatted, a JSONException exception object will be thrown.
        // Catch the exception so the app doesn't crash, and print the error message to the logs.
        try {


            // build up a list of Earthquake objects with the corresponding data.

            JSONArray rootJsonArray = new JSONArray(SAMPLE_JSON_RESPONSE);

            for (int i = 0 ; i < rootJsonArray.length() ; i++){

                JSONObject indexObject = rootJsonArray.getJSONObject(i);
                String song = indexObject.getString("song");
                String artists = indexObject.getString("artists");
                String albumArt = indexObject.getString("cover_image");

                // creating MusicModel class object and setting data from josn
                // which we have just parse

                MusicModel musicModel = new MusicModel(song ,artists , albumArt);
                //
                musicModels.add(musicModel);


            }





        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.
            Log.e("QueryUtils", "Problem parsing the earthquake JSON results", e);
        }

        // Return the list of earthquakes
        return musicModels;
    }

}
