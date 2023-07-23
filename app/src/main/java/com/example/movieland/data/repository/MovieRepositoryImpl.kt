package com.example.movieland.data.repository

import com.example.movieland.data.remote.MovieAPI
import com.example.movieland.data.remote.dto.MovieDetailDto
import com.example.movieland.data.remote.dto.MoviesDto
import com.example.movieland.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api : MovieAPI) : MovieRepository {
    override suspend fun getMovies(search: String): MoviesDto {
        return api.getMovie(searchString = search)
    }

    override suspend fun getMovieDetail(imdb: String): MovieDetailDto {
        return api.getMovieDetails(imdbId = imdb)
    }
}