package com.example.musicapp

import retrofit2.Call
import retrofit2.http.Query
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiInterface {

    @Headers("X-RapidAPI-Key:f2817d0c08msha904ef8829903c0p13f480jsnf1fceee3ccba",
"X-RapidAPI-Host:deezerdevs-deezer.p.rapidapi.com"
        )
    @GET ("search")
    fun getData(@Query("q") query:String): Call<MusicSearch>
}