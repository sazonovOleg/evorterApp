package com.olegsaz209.evorter.activity.places

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.olegsaz209.evorter.R
import com.olegsaz209.evorter.ui.menu.Menu

class PlacesActivity : ComponentActivity() {
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        setContent {
            PlacesView()
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun PlacesView() {
    FlowRow(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFFFFFFFF),
                        Color(0x6B3E52B3),
                    )
                )
            )
            .verticalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        PlacesViewItem()
        PlacesViewItem()
        PlacesViewItem()
        PlacesViewItem()
    }
    Menu()
}

@Composable
fun PlacesViewItem() {
    Column(
        modifier = Modifier
            .fillMaxSize(0.49f)
            .clip(RoundedCornerShape(10.dp))
            .border(
                BorderStroke(1.dp, SolidColor(Color(0xF8FF623B))),
                shape = RoundedCornerShape(10.dp),
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            Modifier.padding(4.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            val contrast = 0.65f
            val brightness = 1f
            val colorMatrix = floatArrayOf(
                contrast, 0f, 0f, 0f, brightness,
                0f, contrast, 0f, 0f, brightness,
                0f, 0f, contrast, 0f, brightness,
                0f, 0f, 0f, 1f, 0f
            )

            Image(
                painterResource(R.drawable.places_test),
                "",
                modifier = Modifier
                    .fillMaxSize(1f)
                    .clip(RoundedCornerShape(10.dp)),
                colorFilter = ColorFilter.colorMatrix(ColorMatrix(colorMatrix))
            )
            Box(
                modifier = Modifier.fillMaxSize(1f).padding(start = 7.dp, bottom = 5.dp),
                contentAlignment = Alignment.BottomStart,
            ) {
                Text(
                    text = "Санкт-Петербург",
                    color = Color(0xF8FFF9F7),
                    fontWeight = FontWeight.Normal,
                    fontSize = 15.sp,
                )
            }
        }
    }
}