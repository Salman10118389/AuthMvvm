package com.example.authmvvm.di

import com.google.firebase.firestore.FirebaseFirestore
import dagger.Provides
import javax.inject.Singleton

object FirebaseModule {
    @Provides
    @Singleton
    fun provideFirestoreInstance(): FirebaseFirestore {
        return FirebaseFirestore.getInstance()
    }


}