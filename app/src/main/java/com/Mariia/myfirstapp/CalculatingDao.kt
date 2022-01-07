package com.Mariia.myfirstapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update




@Dao
interface CalculatingDao {
    @Query("SELECT * FROM calculating")
    fun getAll(): List<Calculating>

    @Query("SELECT * FROM calculating WHERE cid IN (:calculatingIds)")
    fun loadAllByIds(calculatingIds: IntArray): List<Calculating>

    @Query("SELECT * FROM calculating WHERE numbers LIKE :first AND " +
            "result LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): Calculating

    @Insert
    fun insert(calculating: Calculating)

    @Update
    fun update(calculating: Calculating)

    @Delete
    fun delete(calculating: Calculating)
}