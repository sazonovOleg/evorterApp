package com.olegsaz209.evorter.infrastructure.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [DataBaseInfo::class], version = 1)
//@TypeConverters(DataBaseTypeConverter::class)
abstract class DataBaseRoom : RoomDatabase() {
    abstract fun roomDBDao(): DataBaseDao

//    companion object {
//        @Volatile
//        private var instance: DataBaseRoom? = null
//        private val LOCK = Any()
//
//        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
//            instance ?: createDatabase(context).also { instance = it }
//        }
//
//        private fun createDatabase(context: Context): DataBaseRoom {
//            return Room.databaseBuilder(
//                context,
//                DataBaseRoom::class.java, "currency_database"
//            ).build()
//        }
//    }
}