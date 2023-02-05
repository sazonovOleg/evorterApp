package com.olegsaz209.evorter.activity.main.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.olegsaz209.evorter.R

@Composable
fun MainItem(
    nameOfPlace: Int,
    countryOfName: Int,
    infoOfPlace: Int,
    placeOfImage: Int,
) {
    Row(
        modifier = Modifier
            .padding(vertical = 10.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painterResource(placeOfImage),
            modifier = Modifier
                .width(95.dp)
                .height(90.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentDescription = ""
        )
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(start = 10.dp)
        ) {
            Text(
                stringResource(id = nameOfPlace),
                modifier = Modifier.padding(bottom = 3.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF414141),
            )
            Text(
                stringResource(id = countryOfName),
                modifier = Modifier.padding(bottom = 3.dp),
                fontSize = 12.sp,
                fontWeight = FontWeight.Light,
                color = Color(0xFF006DC5),
            )
            Text(
                stringResource(id = infoOfPlace),
                fontSize = 12.sp,
                fontWeight = FontWeight.Light,
                color = Color(0xFF696969),
            )
        }
    }
}