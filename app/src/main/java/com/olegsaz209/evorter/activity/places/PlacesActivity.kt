package com.olegsaz209.evorter.activity.places

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

class PlacesActivity : ComponentActivity() {
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        setContent {
            PlacesView()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}

@Composable
fun PlacesView() {
    Column() {
        Text(text = "Places")
    }
}