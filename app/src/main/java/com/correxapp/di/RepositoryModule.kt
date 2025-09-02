package com.correxapp.di

import com.correxapp.data.repository.ClassRepositoryImpl
import com.correxapp.domain.repository.ClassRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindClassRepository(
        classRepositoryImpl: ClassRepositoryImpl
    ): ClassRepository

}