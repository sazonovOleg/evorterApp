package com.olegsaz209.evorter.activity.main

import android.app.Activity
import android.app.Application
import android.content.Intent
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.google.firebase.analytics.FirebaseAnalytics
import com.olegsaz209.evorter.activity.booking.BookingActivity
import com.olegsaz209.evorter.activity.places.PlacesActivity
import com.olegsaz209.evorter.activity.settings.SettingsActivity
import com.olegsaz209.evorter.analytics.Analytics

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
        activity.startActivity(Intent(activity, BookingActivity::class.java))
    }

    fun startSettingsActivity(activity: Activity) {
        activity.startActivity(Intent(activity, SettingsActivity::class.java))
    }
}