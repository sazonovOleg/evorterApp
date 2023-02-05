package com.olegsaz209.evorter.activity.main.components.bodyContent

import com.olegsaz209.evorter.R

data class DataBodyInfo(
    val namePlace: Int,
    val nameCountry: Int,
    val placeInfo: Int,
    val placeImage: Int
)

val dataBodyInfoList = listOf(
    DataBodyInfo(
        R.string.spb_place,
        R.string.spb_name,
        R.string.spb_place_info,
        R.drawable.img_3,
    ),
    DataBodyInfo(
        R.string.spb_place,
        R.string.spb_name,
        R.string.spb_place_info,
        R.drawable.img_3,
    ),
    DataBodyInfo(
        R.string.spb_place,
        R.string.spb_name,
        R.string.spb_place_info,
        R.drawable.img_3,
    ),
    DataBodyInfo(
        R.string.spb_place,
        R.string.spb_name,
        R.string.spb_place_info,
        R.drawable.img_3,
    )
)