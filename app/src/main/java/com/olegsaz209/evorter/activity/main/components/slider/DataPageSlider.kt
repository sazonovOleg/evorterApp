package com.olegsaz209.evorter.activity.main.components.slider

import com.olegsaz209.evorter.R

data class DataSliderText(
    val image: Int,
    val title: Int,
    val subtitle: Int,
    val text: Int
)

val sliderList = listOf(
    DataSliderText(
        R.drawable.img_3,
        R.string.spb_title,
        R.string.spb_place,
        R.string.spb_name,
    ),
    DataSliderText(
        R.drawable.img_3,
        R.string.test,
        R.string.test,
        R.string.test,
    ),
    DataSliderText(
        R.drawable.img_3,
        R.string.test,
        R.string.test,
        R.string.test,
    )
)