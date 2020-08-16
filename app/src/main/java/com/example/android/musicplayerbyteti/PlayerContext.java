package com.example.android.musicplayerbyteti;

public class PlayerContext {


    private String mDescription;

    private String mArtist;

    private int mCoverImageId;

    public PlayerContext(String description, String artist, int coverImageId) {

        mDescription = description;
        mArtist = artist;
        mCoverImageId = coverImageId;

    }

    public String getDescription() {

        return mDescription;

    }

    public String getArtistName() {

        return mArtist;

    }

    public int getCoverImageId() {

        return mCoverImageId;

    }


}
