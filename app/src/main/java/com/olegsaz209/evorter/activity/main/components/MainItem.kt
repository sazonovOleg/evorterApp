package com.olegsaz209.evorter.activity.main.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.olegsaz209.evorter.R

@Composable
fun MainItem() {
    Row(
        modifier = Modifier
            .padding(vertical = 10.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painterResource(R.drawable.img_2),
            modifier = Modifier
                .width(90.dp)
                .height(90.dp),
            contentDescription = ""
        )
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(start = 5.dp)
        ) {
            Text(
                text = "The Pink Beach",
                modifier = Modifier.padding(bottom = 5.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF414141),
            )
            Text(
                text = "Komodo Island, Indonesia",
                modifier = Modifier.padding(bottom = 5.dp),
                fontSize = 12.sp,
                fontWeight = FontWeight.Light,
                color = Color(0xFF006DC5),
            )
            Text(
                text = "This exceptional beach gets its striking color from microscopic animals called...",
                modifier = Modifier.padding(bottom = 5.dp),
                fontSize = 12.sp,
                fontWeight = FontWeight.Light,
                color = Color(0xFF696969),
            )
        }
    }
}