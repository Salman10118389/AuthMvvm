package com.example.authmvvm.ui.note

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.authmvvm.data.model.Note
import com.example.authmvvm.data.repository.NoteRepository

class NoteViewModel(
    val repo: NoteRepository
): ViewModel(){

    //Ambil smeua data notes
    val _notes = MutableLiveData<List<Note>>()
    val note: LiveData<List<Note>>
        get() = _notes

    fun getNotes(){
        _notes.value = repo.getNotes()
    }

}