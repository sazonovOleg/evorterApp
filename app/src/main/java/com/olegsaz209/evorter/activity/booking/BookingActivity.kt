package com.olegsaz209.evorter.activity.booking

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

class BookingActivity: ComponentActivity() {
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        setContent {
            BookingView()
        }
    }
}

@Composable
fun BookingView() {
    Column() {
        Text(text = "Booking")
    }
}