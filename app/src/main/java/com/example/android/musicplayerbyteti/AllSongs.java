package com.example.android.musicplayerbyteti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AllSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_container);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Create a list of Context
        ArrayList<PlayerContext> contexts = new ArrayList<PlayerContext>();
        contexts.add(new PlayerContext("Auditorium", "Yasiin Bey", R.drawable.autorium));
        contexts.add(new PlayerContext("Stronger", "Kanye West", R.drawable.stronger));
        contexts.add(new PlayerContext("Collard Greens", "ScHoolboy Q", R.drawable.collard_greens));
        contexts.add(new PlayerContext("Humble", "Kendrick Lamar", R.drawable.humble));
        contexts.add(new PlayerContext("VVS", "Ufo361", R.drawable.vvs));
        contexts.add(new PlayerContext("Ya indi,Ya Heç Vaxt", "Paster", R.drawable.ya_indi_ya_hec_vaxt));
        contexts.add(new PlayerContext("Lord Pretty Flacko Jodye 2", "A$AP Rocky", R.drawable.lpfg2));
        contexts.add(new PlayerContext("A.P.I.D.T.A", "Jay Electronica", R.drawable.apidta));
        contexts.add(new PlayerContext("Nikes", "Frank Ocean", R.drawable.nikes));


        // Create an {@link ContextAdapter}, whose data source is a list of {@link Context}s. The
        // adapter knows how to create list items for each item in the list.
        PlayerContextAdapter adapter = new PlayerContextAdapter(this, contexts);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // main_container.xml layout file.
        ListView listView = findViewById(R.id.main_container);

        // Make the {@link ListView} use the {@link ContextAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Context} in the list.
        listView.setAdapter(adapter);
    }
}