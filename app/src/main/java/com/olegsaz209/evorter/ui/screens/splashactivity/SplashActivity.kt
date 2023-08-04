package com.olegsaz209.evorter.ui.screens.splashactivity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.olegsaz209.evorter.R

@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        val vm: SplashActivityVM by viewModels()
        vm.init()

        setContent {
            SplashScreen()
        }
    }
}

@Composable
private fun SplashScreen() {
    Surface(
        color = Color.White
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize(),
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(id = R.drawable.splash_background),
                    modifier = Modifier
                        .width(350.dp)
                        .height(350.dp),
                    contentDescription = "Splash logo"
                )
            }
        }
    }
}