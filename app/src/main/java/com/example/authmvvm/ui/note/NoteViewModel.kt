package com.example.authmvvm.ui.note

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.authmvvm.data.model.Note
import com.example.authmvvm.data.repository.NoteRepository
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class NoteViewModel @Inject constructor(
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