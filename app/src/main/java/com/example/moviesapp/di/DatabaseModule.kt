package com.example.moviesapp.di

import android.content.Context
import androidx.room.Room
import com.example.moviesapp.data.local.MovieDao
import com.example.moviesapp.data.local.MoviesAppDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class DatabaseModule {

    @Provides
    fun provideMoviesDao(appDataBase: MoviesAppDataBase): MovieDao {
        return appDataBase.movieDao()
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): MoviesAppDataBase {
        return Room.databaseBuilder(
            appContext,
            MoviesAppDataBase::class.java,
            "MoviesApp"
        ).build()
    }
}