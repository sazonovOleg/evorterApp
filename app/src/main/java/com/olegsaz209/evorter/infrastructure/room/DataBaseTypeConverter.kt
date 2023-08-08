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
    fun fromMap(ratesList: Map<String, String>): String {
        return ratesList.toString()
    }

    @TypeConverter
    fun toMap(mapString: String): Map<String, String> {
        Log.d("devv", "devv what in toMap = $mapString")
        return mapString
            .split(",")
            .map { it.split(":") }
            .associate { it.first() to it.last() }.toMap()
    }
}