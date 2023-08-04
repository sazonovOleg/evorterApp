package com.olegsaz209.evorter.infrastructure.room

import android.content.Context
import androidx.room.Room

object DataBaseBuilder {
    fun createDatabase(applicationContext: Context): DataBaseRoom {
        return Room.databaseBuilder(
            applicationContext,
            DataBaseRoom::class.java, "fb_data_base"
        ).build()
    }
}