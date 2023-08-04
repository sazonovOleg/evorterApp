package com.olegsaz209.evorter.infrastructure.fbdb

import android.util.Log
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

object FirebaseData {
    private var database: DatabaseReference = Firebase.database.reference

    fun getFirebaseData() {
        Log.d("Devv", "devv database = ${database.database}")
    }
}