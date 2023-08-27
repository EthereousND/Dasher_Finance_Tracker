package com.example.dasherfinancetracker.workdata

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class WorkData(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date: Date,
    val hoursWorked: Double,
    val earnings: Double
)
