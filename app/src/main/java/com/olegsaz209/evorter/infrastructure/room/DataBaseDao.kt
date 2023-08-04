package com.olegsaz209.evorter.infrastructure.room

import androidx.room.*

@Dao
interface DataBaseDao {
    @Insert
    suspend fun addToDataBase(currencyData: DataBase)

    @Query("SELECT * FROM fb_database")
    suspend fun getDataBaseList(): List<DataBase>

    @Update
    suspend fun updateDataBase(currencyData: DataBase)

    @Update
    suspend fun deleteDataBase(currencyData: DataBase)
}