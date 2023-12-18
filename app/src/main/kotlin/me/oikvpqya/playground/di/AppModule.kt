package me.oikvpqya.playground.di

import android.content.Context
import coil.ImageLoader
import coil.util.DebugLogger
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun imageLoader(
        @ApplicationContext application: Context,
    ): ImageLoader = ImageLoader.Builder(application)
        .logger(DebugLogger())
        .build()
}
