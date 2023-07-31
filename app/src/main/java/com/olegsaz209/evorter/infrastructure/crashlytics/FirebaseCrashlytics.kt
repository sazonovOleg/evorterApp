package com.olegsaz209.evorter.infrastructure.crashlytics

import com.google.firebase.crashlytics.FirebaseCrashlytics

object FirebaseCrashlytics {
    val cl = FirebaseCrashlytics.getInstance()

    fun logToCrashlytics(throwable: Throwable,event: String) {
        cl.log("FirebaseCrashlytics log event = $event and throwable = $throwable")
        cl.recordException(throwable)
    }
}