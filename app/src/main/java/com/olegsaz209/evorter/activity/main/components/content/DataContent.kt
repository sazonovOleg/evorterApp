package com.olegsaz209.evorter.activity.main.components.content

import com.olegsaz209.evorter.R

data class DataContent(
    val namePlace: Int,
    val nameCountry: Int,
    val placeInfo: Int,
    val placeImage: Int
)

val dataContentList = listOf(
    DataContent(
        R.string.spb_place,
        R.string.spb_name,
        R.string.spb_place_info,
        R.drawable.img_3,
    ),
    DataContent(
        R.string.spb_place,
        R.string.spb_name,
        R.string.spb_place_info,
        R.drawable.img_3,
    ),
    DataContent(
        R.string.spb_place,
        R.string.spb_name,
        R.string.spb_place_info,
        R.drawable.img_3,
    ),
    DataContent(
        R.string.spb_place,
        R.string.spb_name,
        R.string.spb_place_info,
        R.drawable.img_3,
    )
)