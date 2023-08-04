package com.olegsaz209.evorter.infrastructure.room

import androidx.room.Entity
import androidx.room.PrimaryKey

//@ColumnInfo(name = "published_author")


@Entity(tableName = "fb_data_base")
data class DataBase(
    @PrimaryKey(autoGenerate = false)
    var timestamp: String,
    var date: String,
    var rates: String
)

data class Rates(
    var currency: String,
    var currencyType: String,
)