package com.example.dasherfinancetracker.ui.dashboard

import com.example.dasherfinancetracker.model.RecurringExpense

data class DashboardParameters(
    val hourly: String,
    val daily: String,
    val weekly: String,
    val monthly: String,
    val yearly: String,
    val allTime: Double,
    val lineChart: Any, // Replace with the actual type
    val upcomingExpenses: List<RecurringExpense>, // Replace with the actual type
    val remainingExpenses: List<Float>, // Replace with the actual type
    val dailyIncomeGoal: Double,
    val weeklyIncome: Double,
    val monthlyIncome: Double,
    val yearlyIncome: Double,
    val allTimeIncome: Double,
    val yearlyDeductions: Double
)
