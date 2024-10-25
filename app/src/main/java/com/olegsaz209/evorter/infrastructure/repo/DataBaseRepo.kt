package com.olegsaz209.evorter.infrastructure.repo

import android.content.Context
import com.olegsaz209.evorter.infrastructure.room.DataBaseBuilder
import com.olegsaz209.evorter.infrastructure.room.DataBaseInfo
import com.olegsaz209.evorter.infrastructure.room.DataBaseRoom
import kotlinx.coroutines.*

class DataBaseRepo(val context: Context, private val dataBaseInfo: DataBaseInfo) {
    private var db: DataBaseRoom = DataBaseBuilder.createDatabase(context)

    private suspend fun createDataBase() = coroutineScope {
        launch(Dispatchers.IO) {
            db.roomDBDao().addToDataBase(dataBaseInfo)
        }
    }

    suspend fun getDataBase(): List<DataBaseInfo> {
        createDataBase()
        return db.roomDBDao().getDataBaseList()
    }
}