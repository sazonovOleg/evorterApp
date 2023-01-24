package com.olegsaz209.evorter.activity.main.components

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.olegsaz209.evorter.R
import com.olegsaz209.evorter.activity.main.MainActivityVM
import com.olegsaz209.evorter.ui.colors.AppColors

@Composable
fun Body() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 11.dp, vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

    }
}

@Preview
@Composable
fun BodyPreview() {
    Body()
}