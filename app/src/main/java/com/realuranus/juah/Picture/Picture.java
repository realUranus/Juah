package com.realuranus.juah.Picture;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Picture {
    private int id;
    private int width;
    private int height;
    private String url;
    @SerializedName("photographer_url")
    private String authorUrl;
    private String photographer;
    private List<PictureSource> pictureSources;
    public String getPhotographer() {
        return photographer;
    }
}
