package com.example.dasherfinancetracker.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "recurring_expenses")
data class RecurringExpense(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,

    val name: String,
    val cost: Double,
    val dueDate: Date,
    val frequency: String, // Could be represented as days, weeks, or months
    val isDeductible: Boolean
)