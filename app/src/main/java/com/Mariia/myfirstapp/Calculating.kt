package com.Mariia.myfirstapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Calculating(
    @PrimaryKey(autoGenerate = true) var cid: Int,
    @ColumnInfo(name = "numbers") var numbers: String?,
    @ColumnInfo(name = "result") var result: String?
)

