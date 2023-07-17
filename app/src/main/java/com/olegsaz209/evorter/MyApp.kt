package com.olegsaz209.evorter

import android.app.Application
import android.content.Intent
import android.util.Log
import com.google.android.gms.tasks.Task
import com.google.firebase.FirebaseApp
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.olegsaz209.evorter.activity.splashactivity.SplashActivity
import com.olegsaz209.evorter.analytics.Analytics

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        //Firebase initialize
        FirebaseApp.initializeApp(applicationContext)

        // FirebaseRemoteConfig Initialization
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

        Analytics.instance().init(this)

        startMainActivity()
    }

    private fun startMainActivity() {
        val intent = Intent(baseContext, SplashActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }
}