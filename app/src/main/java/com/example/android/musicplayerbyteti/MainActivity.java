package com.example.android.musicplayerbyteti;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the app category
        TextView allSongs = (TextView) findViewById(R.id.all_songs);
        TextView artists = (TextView) findViewById(R.id.artists);


        // Set a click  listener on that All Songs View
        allSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the  All Songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent allSongsIntent = new Intent(MainActivity.this, AllSongs.class);
                startActivity(allSongsIntent);
            }
        });

        // Set a click listener on that Artists View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Artists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(artistsIntent);
            }
        });

    }
}