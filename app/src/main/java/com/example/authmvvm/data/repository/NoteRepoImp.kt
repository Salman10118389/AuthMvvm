package com.example.authmvvm.data.repository

import com.example.authmvvm.data.model.Note
import com.google.firebase.firestore.FirebaseFirestore

class NoteRepoImp(val database: FirebaseFirestore): NoteRepository{

    override fun getNotes(): List<Note> {
        //Get data From Firebase
        return arrayListOf()
    }
}