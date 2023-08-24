package com.example.dasherfinancetracker.database

import com.example.dasherfinancetracker.model.RecurringExpense
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete

@Dao
interface RecurringExpenseDao {

    @Insert
    suspend fun insertExpense(expense: RecurringExpense): Long

    @Update
    suspend fun updateExpense(expense: RecurringExpense)

    @Delete
    suspend fun deleteExpense(expense: RecurringExpense)

    @Query("SELECT * FROM recurring_expenses")
    suspend fun getAllExpenses(): List<RecurringExpense>
}
