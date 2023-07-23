package com.example.movieland.presentation.ui

sealed class Screen(val route : String){
    object MovieScreen : Screen("movie_screen")
    object MovieDetailScreen : Screen("movie_destil_screen")
}