package com.olegsaz209.evorter.activity.main

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

class MainActivityVM(application: Application) : AndroidViewModel(application) {
    fun logApplication() {
        Log.d("devv", "devv log work")
    }
}