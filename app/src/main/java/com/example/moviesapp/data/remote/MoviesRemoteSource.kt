package com.example.moviesapp.data.remote

import com.example.moviesapp.BuildConfig
import com.example.moviesapp.data.remote.model.RemoteMovie
import com.example.moviesapp.data.remote.model.RemoteMoviesResponse
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.logging.*
import io.ktor.client.request.*
import io.ktor.http.*
import javax.inject.Inject

class MoviesRemoteSource @Inject constructor() {

    private val client = HttpClient(CIO) {
        defaultRequest {
            url {
                protocol = URLProtocol.HTTPS
                host = "api.themoviedb.org"
                encodedPath = "/3" + url.encodedPath
            }
        }
        engine {
            endpoint {
                connectTimeout = 20_000
            }
        }
        install(JsonFeature) {
            serializer = GsonSerializer()
        }
        install(Logging) {
            logger = Logger.DEFAULT
            level = LogLevel.ALL
        }
    }

    suspend fun getPopularMovies(): List<RemoteMovie> {
        val response: RemoteMoviesResponse = client.get("movie/popular") {
            parameter("api_key", BuildConfig.APP_KEY)
        }

        return response
            .results
            .map { movie -> movie.copy(poster_path = BASE_IMAGE_URL + movie.poster_path) }
    }

    companion object {
        const val BASE_IMAGE_URL = "https://image.tmdb.org/t/p/w400"
    }
}