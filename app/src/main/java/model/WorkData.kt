package com.example.dasherfinancetracker.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "work_data")
data class WorkData(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,

    val date: Date,
    val hoursWorked: Double,
    val earnings: Double
)