package com.olegsaz209.evorter.activity.settings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

class SettingsActivity:ComponentActivity() {
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        setContent {
            SettingsView()
        }
    }
}

@Composable
fun SettingsView() {
    Column() {
        Text(text = "Settings")
    }
}