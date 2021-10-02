package com.example.moviesapp.di

import com.example.moviesapp.data.MoviesDataRepository
import com.example.moviesapp.domain.repository.MoviesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class DataModule {

    @Binds
    abstract fun bindsMoviesRepository(moviesDataRepository: MoviesDataRepository): MoviesRepository
}