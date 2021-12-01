package com.camila.ortiz.ortiz_vid_final;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface servicio {

    @POST("N00029592")
    Call<Void> publicarPelicula(@Body pelicuala pelicuala);

    @GET("N00029592")
    Call<List<pelicuala>> mostrrListaPelicualas();
}
