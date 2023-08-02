package com.olegsaz209.evorter.ui.screens.main.components.slider

import com.olegsaz209.evorter.R

data class DataSlider(
    val image: Int,
    val title: Int,
    val subtitle: Int,
    val text: Int
)

val sliderList = listOf(
    DataSlider(
        R.drawable.img_3,
        R.string.spb_title,
        R.string.spb_place,
        R.string.spb_name,
    ),
    DataSlider(
        R.drawable.img_3,
        R.string.test,
        R.string.test,
        R.string.test,
    ),
    DataSlider(
        R.drawable.img_3,
        R.string.test,
        R.string.test,
        R.string.test,
    )
)