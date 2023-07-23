package com.example.movieland.presentation.movies

sealed class MoviesEvent{

    data class Search(val searchString: String) : MoviesEvent()
}
