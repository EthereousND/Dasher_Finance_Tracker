package com.example.dasherfinancetracker.expenses

import androidx.lifecycle.LiveData

class ExpenseRepository(private val expenseDao: ExpenseDao) {

    val allExpenses: LiveData<List<Expense>> = expenseDao.getAll()

    suspend fun insert(expense: Expense) {
        expenseDao.insert(expense)
    }

    suspend fun deleteById(id: Int) {
        expenseDao.deleteById(id)
    }
}
