package com.example.apinewsmvvm.network

import com.example.apinewsmvvm.model.Source
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("top-headlines/source")
    fun getAllSources(
        @Query("category") category : String,
        @Query("apikey") apikey : String = "d2322e22def24dcd9113a21891c736b0"
    ) : Call<List<Source>>

//    @GET("top-headlines")
//    fun getAllArikel(
//        @Query("sources") sources : String,
//        @Query("apikey") apikey: String = "cd459e27cc2641ca9730cb92b61828ce"
//    ) : Call<List<>>
}