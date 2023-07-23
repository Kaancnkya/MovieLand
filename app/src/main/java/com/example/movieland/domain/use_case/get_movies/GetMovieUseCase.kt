package com.example.movieland.domain.use_case.get_movies

import com.example.movieland.data.remote.dto.toMovieDetail
import com.example.movieland.data.remote.dto.toMovieList
import com.example.movieland.domain.model.Movie
import com.example.movieland.domain.model.MovieDetail
import com.example.movieland.domain.repository.MovieRepository
import com.example.movieland.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOError
import javax.inject.Inject

class GetMovieUseCase  @Inject constructor(private val repository : MovieRepository) {

    fun executeGetMovies(search: String) : Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            val movieList = repository.getMovies(search)
            if(movieList.Response.equals("True")) {
                emit(Resource.Success(movieList.toMovieList()))
            } else {
                emit(Resource.Error(message = "No movie found"))
            }
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Error!"))
        } catch (e: IOError) {
            emit(Resource.Error(message = "Could not reach internet"))
        }
    }

}