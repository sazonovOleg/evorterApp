package com.olegsaz209.evorter.activity.main.components.slider

import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.pager.*
import com.olegsaz209.evorter.activity.main.MainActivityVM
import kotlinx.coroutines.delay
import kotlinx.coroutines.yield

@OptIn(ExperimentalPagerApi::class)
@Composable
fun AppHeaderSlider(vm: MainActivityVM = viewModel()) {
    val pagerState = rememberPagerState(
        pageCount = sliderList.size
    )

    LaunchedEffect(Unit) {
        while (true) {
            yield()
            delay(800000)
            pagerState.animateScrollToPage(
                page = (pagerState.currentPage + 1) % (pagerState.pageCount),
                animationSpec = tween(600)
            )
        }
    }

    Column(
        Modifier
            .height(390.dp)
            .offset(y = (-20).dp)
    ) {
        HeaderPagerSlider(pagerState)
    }
}