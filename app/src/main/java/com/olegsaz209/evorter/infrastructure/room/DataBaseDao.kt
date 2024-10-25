package com.olegsaz209.evorter.infrastructure.room

import androidx.room.*

@Dao
interface DataBaseDao {
    @Insert
    suspend fun addToDataBase(dataBaseInfo: DataBaseInfo)

    @Query("SELECT * FROM fb_data_base")
    suspend fun getDataBaseList(): List<DataBaseInfo>

    @Update
    suspend fun updateDataBase(dataBaseInfo: DataBaseInfo)

    @Update
    suspend fun deleteDataBase(dataBaseInfo: DataBaseInfo)
}