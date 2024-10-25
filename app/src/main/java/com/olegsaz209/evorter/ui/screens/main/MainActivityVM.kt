package com.olegsaz209.evorter.ui.screens.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.olegsaz209.evorter.infrastructure.analytics.Analytics

class MainActivityVM(application: Application) : AndroidViewModel(application) {
    init {
        Analytics.instance().logFirstOpen(getApplication())
    }
}