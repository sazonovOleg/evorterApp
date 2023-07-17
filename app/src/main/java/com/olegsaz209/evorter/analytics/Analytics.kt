package com.olegsaz209.evorter.analytics

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.util.Log
import com.google.firebase.analytics.FirebaseAnalytics

class Analytics private constructor() {
    private val FIRST_OPEN = "app_first_open"

    fun init(app: Application) {
        val context = app.applicationContext
    }

    fun logFirstOpen(context: Context) {
        val bundle = Bundle()
        FirebaseAnalytics.getInstance(context).logEvent(FIRST_OPEN, bundle)
    }

    fun logEvent(context: Context?, key: String?, bundle: Bundle?) {
        FirebaseAnalytics.getInstance(context!!).logEvent(key!!, bundle)
    }

    companion object {
        private var inst: Analytics? = null

        @JvmStatic
        fun instance(): Analytics {
            if (inst == null) {
                inst = Analytics()
            }
            return inst!!
        }
    }
}