package com.olegsaz209.evorter.infrastructure.room

import android.util.Log
import androidx.room.TypeConverter

class DataBaseTypeConverter {
    @TypeConverter
    fun fromList(listOfString: MutableList<String>): String {
        return listOfString.toString()
    }

    @TypeConverter
    fun toList(listOfString: String): MutableList<String> {
        return listOfString.split("=").toMutableList()
    }

    @TypeConverter
    fun fromMapRates(ratesList: Map<String, String>): String {
        return ratesList.toString()
    }

    @TypeConverter
    fun toMapRates(ratesString: String): Map<String, String> {
        Log.d("devv", "devv what in ratesString = $ratesString")
        return ratesString
            .split(",")
            .map { it.split(":") }
            .associate { it.first() to it.last() }.toMap()
    }
}