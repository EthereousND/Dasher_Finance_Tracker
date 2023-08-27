package com.example.dasherfinancetracker.workdata

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WorkDataDao {
    @Insert
    suspend fun insert(workData: WorkData)

    @Query("SELECT * FROM WorkData")
    suspend fun getAllWorkData(): List<WorkData>

    @Query("DELETE FROM WorkData WHERE id = :id")
    suspend fun deleteById(id: Int)

    @Query("UPDATE WorkData SET hoursWorked = :hours, earnings = :earnings WHERE id = :id")
    suspend fun updateById(id: Int, hours: Float, earnings: Float)






    // Add more queries as needed
}
