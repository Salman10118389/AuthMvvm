package com.example.authmvvm.data.repository

import com.example.authmvvm.data.model.Note

class NoteRepoImp: NoteRepository {

    override fun getNotes(): List<Note> {
        //Get data From Firebase
        return arrayListOf()
    }
}