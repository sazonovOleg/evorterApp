package com.olegsaz209.evorter.activity.main.components.bodyContent

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
import com.olegsaz209.evorter.activity.main.components.MainItem

@Composable
fun Body() {
    val listBodyInfo = dataBodyInfoList

    Column(
        Modifier
            .padding(horizontal = 10.dp)
            .offset(y = (0).dp)
            .height(310.dp)
    ) {
        Text(
            text = "Popular Destination",
            color = Color(0xFF000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(bottom = 5.dp)
        )
        LazyColumn {
            item() {
                MainItem(
                    listBodyInfo[0].namePlace,
                    listBodyInfo[0].nameCountry,
                    listBodyInfo[0].placeInfo,
                    listBodyInfo[0].placeImage,
                )
            }
            items(listBodyInfo.size - 1) {
                MainItem(
                    listBodyInfo[it].namePlace,
                    listBodyInfo[it].nameCountry,
                    listBodyInfo[it].placeInfo,
                    listBodyInfo[it].placeImage,
                )
            }
        }
    }
}
