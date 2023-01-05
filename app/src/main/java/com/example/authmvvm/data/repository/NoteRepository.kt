package com.example.authmvvm.data.repository

import com.example.authmvvm.data.model.Note

interface NoteRepository {
    fun getNotes(): List<Note>{
        return arrayListOf()
    }
}