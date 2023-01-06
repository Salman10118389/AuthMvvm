package com.example.authmvvm.data.repository

import com.example.authmvvm.data.model.Note
import com.google.firebase.firestore.FirebaseFirestore
import java.util.*

class NoteRepoImp(val database: FirebaseFirestore): NoteRepository{

    override fun getNotes(): List<Note> {
        //Get data From Firebase
        return arrayListOf(
            Note(
                id = "001",
                text = "Jogging",
                date = Date()
            ),
            Note(
                id = "002",
                text = "PushUps",
                date = Date()
            ),
            Note(
                id = "001",
                text = "Squat",
                date = Date()
            )
        )
    }
}