package com.olegsaz209.evorter.activity.splashactivity

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.AndroidViewModel
import com.olegsaz209.evorter.activity.main.MainActivity

class SplashActivityVM(application: Application) : AndroidViewModel(application) {
    fun startMainActivity(context: Context) {
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
            (context as Activity).finish()
        }, 1000)
    }
}