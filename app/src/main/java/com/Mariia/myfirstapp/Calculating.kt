package com.Mariia.myfirstapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Calculating(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "numbers") var num: String?,
    @ColumnInfo(name = "result") var res: String?
)

