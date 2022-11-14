package com.bmk.data.doa

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [TableData::class],
    version = 1, exportSchema = false
)
abstract class RoomDB : RoomDatabase() {
    abstract fun doaService(): DoaService
}