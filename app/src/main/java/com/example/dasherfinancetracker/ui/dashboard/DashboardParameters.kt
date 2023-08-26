package com.example.dasherfinancetracker.ui.dashboard

import com.example.dasherfinancetracker.ui.components.Expense

data class DashboardParameters(
    val hourly: Double,
    val daily: Double,
    val weekly: Double,
    val monthly: Double,
    val yearly: Double,
    val allTime: Double,
    val lineChart: Any, // Replace with the actual type
    val upcomingExpenses: List<Expense>, // Replace with the actual type
    val remainingExpenses: List<Any>, // Replace with the actual type
    val dailyIncomeGoal: Double,
    val weeklyIncome: Double,
    val monthlyIncome: Double,
    val yearlyIncome: Double,
    val allTimeIncome: Double,
    val yearlyDeductions: Double
)
