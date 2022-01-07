package com.Mariia.myfirstapp

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Calculating::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun calculatingDao(): CalculatingDao
}