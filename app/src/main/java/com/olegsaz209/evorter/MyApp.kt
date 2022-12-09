package com.olegsaz209.evorter

import android.app.Application
import android.content.Intent
import com.olegsaz209.evorter.activity.main.MainActivity
import com.olegsaz209.evorter.splashactivity.SplashActivity

class MyApp : Application()  {
    override fun onCreate() {
        super.onCreate()

        startMainActivity()
    }

    private fun startMainActivity() {
        val intent = Intent(baseContext, SplashActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }
}