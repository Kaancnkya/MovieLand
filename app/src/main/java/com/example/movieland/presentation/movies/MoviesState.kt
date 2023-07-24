package com.example.movieland.presentation.movies

import com.example.movieland.domain.model.Movie

data class MoviesState(
    val isLoading : Boolean = false,
    val movies : List<Movie> = emptyList(),
    val error : String = "",
    val search : String = "Batman"
)