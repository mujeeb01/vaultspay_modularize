package com.vaultspay.vaultspay_modularize.di

import android.content.Context
import com.vaultspay.core.local.datastore.DataStoreProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataStoreModules {
    @Singleton
    @Provides
    fun provideDataStore(@ApplicationContext appContext: Context) = DataStoreProvider(appContext)
}