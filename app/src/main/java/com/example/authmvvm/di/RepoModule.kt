package com.example.authmvvm.di

import com.example.authmvvm.data.repository.NoteRepoImp
import com.example.authmvvm.data.repository.NoteRepository
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepoModule {

    //FirebaseFirestoreInjection
    @Provides
    @Singleton
    fun provideNoteRepo(
        database: FirebaseFirestore
    ): NoteRepository{
        return NoteRepoImp(database)
    }
}