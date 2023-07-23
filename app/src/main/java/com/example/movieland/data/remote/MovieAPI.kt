package com.example.movieland.data.remote

import com.example.movieland.data.remote.dto.MovieDetailDto
import com.example.movieland.data.remote.dto.MoviesDto
import com.example.movieland.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {

    //https://www.omdbapi.com/?i=tt3896198&apikey=b55d0c32&s=Batman
    //https://www.omdbapi.com/?i=tt3896198&apikey=b55d0c32

    @GET(".")
    suspend fun getMovie(
        @Query("s") searchString : String,
        @Query("apikey") apiKey : String = API_KEY
    ) : MoviesDto

    @GET(".")
    suspend fun getMovieDetails(
        @Query("i") imdbId : String,
        @Query("apikey") apiKey : String = API_KEY
    ) : MovieDetailDto
}