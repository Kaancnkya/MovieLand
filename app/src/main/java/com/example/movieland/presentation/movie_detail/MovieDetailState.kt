package com.example.movieland.presentation.movie_detail

import com.example.movieland.domain.model.MovieDetail

data class MovieDetailState(
    val isLoading : Boolean = false,
    val movie : MovieDetail? = null,
    val error : String = ""
)