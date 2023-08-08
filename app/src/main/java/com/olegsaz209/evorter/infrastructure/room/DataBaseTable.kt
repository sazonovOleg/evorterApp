package com.olegsaz209.evorter.infrastructure.room

import androidx.room.Entity
import androidx.room.PrimaryKey

//@ColumnInfo(name = "published_author")


@Entity(tableName = "fb_data_base")
data class DataBaseInfo(
    @PrimaryKey var tableMap: String,
)