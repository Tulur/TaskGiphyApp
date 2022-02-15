package com.example.taskgiphyapp

import retrofit2.http.GET

interface DataService {

    @GET("gifs/trending?api_key=YGHnKKBGSydS6nSt6WAoUcICWwmgCfvL&q=&limit=25&offset=0&rating=g&lang=en")
    fun getGifs(): retrofit2.Call<DataResult>
}