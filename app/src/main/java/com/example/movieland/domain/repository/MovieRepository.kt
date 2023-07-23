package com.example.movieland.domain.repository

import com.example.movieland.data.remote.dto.MovieDetailDto
import com.example.movieland.data.remote.dto.MoviesDto

interface MovieRepository {

    suspend fun getMovies(search : String) : MoviesDto
    suspend fun getMovieDetail(imdb : String) : MovieDetailDto
}