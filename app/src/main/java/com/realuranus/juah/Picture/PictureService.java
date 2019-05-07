package com.realuranus.juah.Picture;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface PictureService {
    @Headers("Authorization: 563492ad6f9170000100000165f37ef6e33c4114b0c8e3ad19f1b868")
    @GET("v1/curated?per_page=15&page=1")
    Call<Picture> getCurated ();
}
