package com.olegsaz209.evorter.activity.main.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.olegsaz209.evorter.R

@Composable
fun AppMenu() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            //.clip(shape = RoundedCornerShape(25.dp))
            .background(color = Color(0xCBFFFFFF))
            .padding(horizontal = 30.dp, vertical = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Image(
            painterResource(id = R.drawable.house),
            contentDescription = "",
            modifier = Modifier
                .width(24.dp)
                .height(24.dp)
        )
        Image(
            painterResource(id = R.drawable.date),
            contentDescription = "",
            modifier = Modifier
                .width(24.dp)
                .height(24.dp)
        )
        Image(
            painterResource(id = R.drawable.love),
            contentDescription = "",
            modifier = Modifier
                .width(24.dp)
                .height(24.dp)
        )
        Image(
            painterResource(id = R.drawable.chat),
            contentDescription = "",
            modifier = Modifier
                .width(24.dp)
                .height(24.dp)
        )
    }
}