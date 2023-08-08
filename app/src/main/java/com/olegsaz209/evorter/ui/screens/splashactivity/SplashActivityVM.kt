package com.olegsaz209.evorter.ui.screens.splashactivity

import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.olegsaz209.evorter.infrastructure.fbdb.FirebaseData
import com.olegsaz209.evorter.ui.navigation.Navigation
import kotlinx.coroutines.launch

class SplashActivityVM(application: Application) : AndroidViewModel(application) {
    private fun startApp(context: Context) {
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(context, Navigation::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            context.startActivity(intent)
        }, 2000)
    }

    fun init() {
        viewModelScope.launch {
            FirebaseData.getFromFirestore()
        }
        startApp(getApplication())
    }
}