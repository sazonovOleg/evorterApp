package com.olegsaz209.evorter.infrastructure.remote

import android.util.Log
import com.google.android.gms.tasks.Task
import com.google.firebase.remoteconfig.FirebaseRemoteConfig

object RemoteConfig {
    fun init() {
        FirebaseRemoteConfig.getInstance().fetchAndActivate()
            .addOnCompleteListener { task: Task<Boolean?> ->
                try {
                    if (task.isSuccessful) {
                        Log.d("Firebase", "Fetch and activate")
                    }
                } catch (e: Exception) {
                    Log.d("FirebaseError", "firebase error + $e")
                }
            }
    }
}