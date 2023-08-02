package com.olegsaz209.evorter

import android.app.Application
import android.content.Intent
import com.google.firebase.FirebaseApp
import com.olegsaz209.evorter.infrastructure.analytics.Analytics
import com.olegsaz209.evorter.infrastructure.remote_config.RemoteConfig
import com.olegsaz209.evorter.ui.screens.splashactivity.SplashActivity

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        FirebaseApp.initializeApp(applicationContext)

        RemoteConfig.remoteConfigInit()

        Analytics.instance().init(this)

        startMainActivity()
    }

    private fun startMainActivity() {
        val intent = Intent(baseContext, SplashActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }
}