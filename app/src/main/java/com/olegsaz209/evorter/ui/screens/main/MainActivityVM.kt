package com.olegsaz209.evorter.ui.screens.main

import android.app.Activity
import android.app.Application
import android.content.Intent
import androidx.lifecycle.AndroidViewModel
import com.olegsaz209.evorter.ui.screens.travelservices.ServicesActivity
import com.olegsaz209.evorter.ui.screens.places.PlacesActivity
import com.olegsaz209.evorter.ui.screens.settings.SettingsActivity
import com.olegsaz209.evorter.infrastructure.analytics.Analytics

class MainActivityVM(application: Application) : AndroidViewModel(application) {
    init {
        Analytics.instance().logFirstOpen(getApplication())
    }

    fun startMainActivity(activity: Activity) {
        activity.startActivity(Intent(activity, MainActivity::class.java))
    }

    fun startPlacesActivity(activity: Activity) {
        activity.startActivity(Intent(activity, PlacesActivity::class.java))
    }

    fun startBookingActivity(activity: Activity) {
        activity.startActivity(Intent(activity, ServicesActivity::class.java))
    }

    fun startSettingsActivity(activity: Activity) {
        activity.startActivity(Intent(activity, SettingsActivity::class.java))
    }
}