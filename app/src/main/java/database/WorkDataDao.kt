package com.example.dasherfinancetracker.database

import com.example.dasherfinancetracker.model.WorkData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete

@Dao
interface WorkDataDao {

    @Insert
    suspend fun insertWorkData(workData: WorkData): Long

    @Update
    suspend fun updateWorkData(workData: WorkData)

    @Delete
    suspend fun deleteWorkData(workData: WorkData)

    @Query("SELECT * FROM work_data")
    suspend fun getAllWorkData(): List<WorkData>
}
