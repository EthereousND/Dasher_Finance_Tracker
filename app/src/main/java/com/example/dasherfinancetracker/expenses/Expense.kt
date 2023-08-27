package com.example.dasherfinancetracker.expenses

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Expense(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val cost: Double,
    val dueDate: Date,
    val frequency: String, // Can be "Daily", "Weekly", "Monthly", "Yearly", or "One-Time"
    val isDeductible: Boolean,
    val isOneTime: Boolean
)
