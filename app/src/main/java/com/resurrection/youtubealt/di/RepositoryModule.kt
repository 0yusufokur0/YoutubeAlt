package com.resurrection.youtubealt.di

import com.resurrection.base.component.NetworkManager
import com.resurrection.youtubealt.data.repository.HomeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule{

    @Singleton
    @Provides
    fun provideHomeRepository(networkManager: NetworkManager) = HomeRepository(networkManager)

}