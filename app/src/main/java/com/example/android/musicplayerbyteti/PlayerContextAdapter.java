package com.example.android.musicplayerbyteti;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayerContextAdapter extends ArrayAdapter<PlayerContext> {


    public PlayerContextAdapter(Activity context, ArrayList<PlayerContext> contexts) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, contexts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        // Get the {@link Context} object located at this position in the list
        PlayerContext currentContext = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID cover_image
        ImageView coverImageTextView = (ImageView) listItemView.findViewById(R.id.cover_image);
        // Get the image resource ID from the current Context object and
        // set the image to coverImageTextView
        coverImageTextView.setImageResource(currentContext.getCoverImageId());


        // Find the TextView in the list_item.xml layout with the ID artist_name
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        // Get the artist name  from the current Context object and
        // set this text on the artistNameTextView
        artistNameTextView.setText(currentContext.getArtistName());

        // Find the TextView in the list_item.xml layout with the ID song_name
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.description);
        // Get the song name  from the current Context object and
        // set this text on the songNameTextView
        songNameTextView.setText(currentContext.getDescription());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
