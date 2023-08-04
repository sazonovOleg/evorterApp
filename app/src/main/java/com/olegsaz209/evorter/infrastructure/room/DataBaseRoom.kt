package com.olegsaz209.evorter.infrastructure.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DataBase::class], version = 1)
abstract class DataBaseRoom : RoomDatabase() {
    abstract fun currencyDao(): DataBaseDao

//    companion object {
//        @Volatile
//        private var instance: CurrencyDatabase? = null
//        private val LOCK = Any()
//
//        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
//            instance ?: createDatabase(context).also { instance = it }
//        }
//
//        private fun createDatabase(context: Context): CurrencyDatabase {
//            return Room.databaseBuilder(
//                context,
//                CurrencyDatabase::class.java, "currency_database"
//            ).build()
//        }
//    }
}