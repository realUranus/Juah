package com.realuranus.juah.Picture;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PageInfo {
    @SerializedName("page")
    private String page;
    @SerializedName("per_page")
    private String pageNumber;
    @SerializedName("photos")
    private List<Picture> pictures;
    @SerializedName("next_page")
    private String nextPage;

    public String getPage() {
        return page;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public String getNextPage() {
        return nextPage;
    }
}
