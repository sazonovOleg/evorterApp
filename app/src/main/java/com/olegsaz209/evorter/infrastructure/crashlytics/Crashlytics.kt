package com.olegsaz209.evorter.infrastructure.crashlytics

import com.google.firebase.crashlytics.FirebaseCrashlytics

object Crashlytics {
    private val fc = FirebaseCrashlytics.getInstance()

    fun logToCrashlytics(throwable: Throwable,event: String) {
        fc.log("FirebaseCrashlytics log event = $event and throwable = $throwable")
        fc.recordException(throwable)
    }
}