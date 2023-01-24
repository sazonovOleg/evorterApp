package com.olegsaz209.evorter.activity.main.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import androidx.compose.ui.zIndex
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.pager.*
import com.olegsaz209.evorter.R
import com.olegsaz209.evorter.activity.main.MainActivityVM
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield
import kotlin.math.absoluteValue

@OptIn(ExperimentalPagerApi::class)
@Composable
fun AppHeaderSlider(vm:MainActivityVM = viewModel()) {

    val pagerState = rememberPagerState(
        pageCount = onboardingList.size
    )

    val scope = rememberCoroutineScope()

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

//    fun nextSlide() {
//        scope.launch {
//            pagerState.animateScrollToPage(
//                page = (pagerState.currentPage + 1),
//            )
//        }
//    }
//
//    fun prevSlide() {
//        if (pagerState.currentPage >= 1) {
//            scope.launch {
//                pagerState.animateScrollToPage(
//                    page = (pagerState.currentPage - 1),
//                )
//            }
//        }
//    }

    HorizontalPager(state = pagerState) { page ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .graphicsLayer {
                    val pageOffset =
                        calculateCurrentOffsetForPage(page).absoluteValue
                    lerp(
                        start = 0.95f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    ).also { scale ->
                        scaleX = scale
                        scaleY = scale
                    }
                }
                .fillMaxWidth(1f)
        ) {
            val onBoardingSlide = onboardingList[page]
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(start = 10.dp, top = 10.dp)
            ) {
                Text(
                    text = "Hello Atiq",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Start,
                )
                Text(
                    "Wanna plan your next trip?",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    color = Color(0xFFFAFAFA),
                    modifier = Modifier.fillMaxWidth().padding(top = 3.dp),
                    textAlign = TextAlign.Start,
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp)
                    .offset(y = (-80).dp)
                    .zIndex(-1f)
            ) {
                Image(
                    painterResource(
                        id = when (page) {
                            0 -> R.drawable.img_1
                            1 -> R.drawable.img_1
                            2 -> R.drawable.img_1
                            else -> R.drawable.img_1
                        }
                    ),
                    contentDescription = "Scanero Icon",
                    modifier = Modifier
                        .height(490.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(bottomEnd = 16.dp, bottomStart = 16.dp))
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp).offset(y = (-100).dp).zIndex(1f)
                ) {
                    Text(
                        "Jasper National Park",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .fillMaxWidth(),
                        textAlign = TextAlign.Start,
                    )
                    Text(
                        " Alberta, Canada",
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp,
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier.fillMaxWidth().padding(top = 3.dp),
                        textAlign = TextAlign.Start,
                    )
                }
            }
        }
    }

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .offset(y = (-175).dp)
                .zIndex(1f)
                .padding(horizontal = 10.dp)
                .fillMaxWidth(),
        ) {
            HorizontalPagerIndicator(
                pagerState = pagerState,
                modifier = Modifier.padding(top = 15.dp, bottom = 15.dp),
                indicatorWidth = 5.dp,
                indicatorHeight = 5.dp,
                activeColor = Color(0xFFFFFFFF),
                inactiveColor = Color(0x8FAFAFAF),
                spacing = 15.dp
            )
        }
    }
}