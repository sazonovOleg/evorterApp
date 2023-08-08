package com.olegsaz209.evorter.infrastructure.fbdb

import android.annotation.SuppressLint
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.olegsaz209.evorter.infrastructure.crashlytics.Crashlytics
import kotlinx.coroutines.*

object FirebaseData {
    @SuppressLint("StaticFieldLeak")
    private var firestore: FirebaseFirestore? = null
    private var firestoreMap: MutableMap<String, Any>? = null

    init {
        firestore = Firebase.firestore
    }

    //1. Берем данные из ДБ
    suspend fun getFromFirestore() {
        if (firestore != null) {
            firestore!!
                .collection("countrys")
                .document("rus_fed").get()
                .addOnCompleteListener { document ->
                    try {
                        if (document.isComplete) {
                            //2. Кладем в базу
                            firestoreMap = document.result.data
                            Log.d("devv", "devv result.data = ${firestoreMap}")
                            firestoreMap?.forEach {
                                Log.d("devv", "devv it key = ${it.key}")
                                Log.d("devv", "devv it value = ${it.value}")
                            }

                        }
                    } catch (throwable: Throwable) {
                        Crashlytics.logToCrashlytics(throwable, "AddOnCompleteListener. Crashly err dont get data from firestore")
                    }
                }
                .addOnCanceledListener {

                }
                .addOnFailureListener { err ->
                    Crashlytics.logToCrashlytics(err, "AddOnFailureListener. Crashly err dont get data from firestore.")
                }
        }
    }

    fun setDataInFirestore() {
        if (firestore != null) {
            firestore!!
                .collection("countrys")
                .document("rus_fed")
                .set("DATA")
                .addOnSuccessListener {

                }
                .addOnFailureListener {
                    Crashlytics.logToCrashlytics(it, "AddOnFailureListener. Crashly err dont set data in to firestore.")
                }
        }
    }
}