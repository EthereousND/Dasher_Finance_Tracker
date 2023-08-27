package com.example.dasherfinancetracker.expenses

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ExpenseDao {
    @Insert
    suspend fun insert(expense: Expense)

    @Query("SELECT * FROM Expense")
    suspend fun getAllExpenses(): List<Expense>

    @Query("DELETE FROM Expense WHERE id = :id")
    suspend fun deleteById(id: Int)

    @Query("UPDATE Expense SET name = :name, cost = :cost, dueDate = :dueDate, frequency = :frequency, isDeductible = :isDeductible, isOneTime = :isOneTime WHERE id = :id")
    suspend fun updateById(id: Int, name: String, cost: Float, dueDate: String, frequency: String, isDeductible: Boolean, isOneTime: Boolean)



    // Add more queries as needed
}
