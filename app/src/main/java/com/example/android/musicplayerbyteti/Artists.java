package com.example.android.musicplayerbyteti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_container);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Create a list of Context
        ArrayList<PlayerContext> contexts = new ArrayList<PlayerContext>();
        contexts.add(new PlayerContext("Dante Terrell Smith", "Yasiin Bey", R.drawable.yasiin_bey));
        contexts.add(new PlayerContext("Kanye Omari West ", "Kanye West", R.drawable.kanye_west));
        contexts.add(new PlayerContext("Quincy Matthew Hanley", "ScHoolboy Q", R.drawable.schoolboy_q));
        contexts.add(new PlayerContext("Kendrick Lamar Duckworth", "Kendrick Lamar", R.drawable.kendrick_lamar));
        contexts.add(new PlayerContext("Ufuk Bayraktar", "Ufo361", R.drawable.ufo361));
        contexts.add(new PlayerContext("Pərviz Quluzadə", "Paster", R.drawable.paster));
        contexts.add(new PlayerContext("Rakim Athelaston Nakache Mayers", "A$AP Rocky", R.drawable.asap_rocky));
        contexts.add(new PlayerContext("Timothy Elpadaro Thedford", "Jay Electronica", R.drawable.jay_electronica));
        contexts.add(new PlayerContext("Christopher Edwin Breaux", "Frank Ocean", R.drawable.frank_ocean));


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