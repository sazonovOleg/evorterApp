package com.olegsaz209.evorter.activity.main.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Body() {
    Column(
        Modifier
            .padding(horizontal = 11.dp)
            .offset(y = (0).dp)
            .height(300.dp)
    ) {
        Text(
            text = "Popular Destination",
            color = Color(0xFF000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(bottom = 5.dp)
        )
        LazyColumn {
            items(5) {
                MainItem()
            }
        }
    }
}
