package com.example.authmvvm

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user: MutableMap<String, Any> = HashMap()

        user["name"] = "Muhammad Salman Al-farisi"
        user["born"] = 2000

        FirebaseFirestore.getInstance().collection("users")
            .add(user)
            .addOnSuccessListener {
                Log.d("TAG", "Document Snapshot added with ID: " + it.id)
            }.addOnFailureListener{
                Log.w("TAG", "Error Adding Document", )
            }
    }
}