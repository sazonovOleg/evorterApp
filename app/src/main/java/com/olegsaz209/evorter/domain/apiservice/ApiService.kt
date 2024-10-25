package com.olegsaz209.evorter.domain.apiservice

import android.content.Context
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.reflect.TypeToken
import com.olegsaz209.evorter.infrastructure.utils.Constants
import kotlinx.coroutines.suspendCancellableCoroutine
import org.json.JSONObject

class ApiService {
    suspend fun getJsonFromApi(context: Context): JSONObject = suspendCancellableCoroutine { emitter ->
        val queue = Volley.newRequestQueue(context)
        val url = ""

        try {
            val stringRequest = StringRequest(
                Request.Method.GET, url,
                { response ->
                    val stringResponse = response.toString()
                    val jsonObjRates = JSONObject(stringResponse)
                    if (emitter.isActive) {
                        emitter.resumeWith(Result.success(jsonObjRates))
                    }
                },
                { error -> error.printStackTrace() })
            queue.add(stringRequest)
        } catch (throwable: Throwable) {
            Throwable("getJsonFromApi error", throwable)
        }
    }

    fun getJsonFromAssets(context: Context): JSONObject {
        lateinit var jsonString: String
        object : TypeToken<Map<String, Any>>() {}.type

        try {
            jsonString = context.assets.open("last_date_currency.json")
                .bufferedReader()
                .use { it.readText() }
        } catch (throwable: Throwable) {
            Throwable("getJsonFromAssets error", throwable)
        }

        return JSONObject(jsonString)
    }
}