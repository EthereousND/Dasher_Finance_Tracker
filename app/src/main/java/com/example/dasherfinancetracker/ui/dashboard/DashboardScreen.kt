package com.example.dasherfinancetracker.ui.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dasherfinancetracker.ui.components.*

@Composable
fun DashboardScreen(parameters: DashboardParameters) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Total Average Earnings
        TotalAverageEarnings(
            hourly = parameters.hourly,
            daily = parameters.daily,
            weekly = parameters.weekly,
            monthly = parameters.monthly,
            yearly = parameters.yearly
        )

        // Total Earnings for the Current Period
        TotalEarningsCurrentPeriod(
            daily = parameters.dailyEarningsCurrentPeriod,
            weekly = parameters.weeklyEarningsCurrentPeriod,
            monthly = parameters.monthlyEarningsCurrentPeriod,
            yearly = parameters.yearlyEarningsCurrentPeriod,
            allTime = parameters.allTimeEarningsCurrentPeriod,
            lineChart = parameters.lineChart
        )

        // Upcoming Expenses
        UpcomingExpenses(upcomingExpenses = parameters.upcomingExpenses)

        // Total Remaining Monthly Expenses and Daily Income Goal
        RemainingExpensesAndIncomeGoal(
            remainingExpenses = parameters.remainingExpenses,
            dailyIncomeGoal = parameters.dailyIncomeGoal
        )

        // Net Income
        NetIncome(
            weeklyIncome = parameters.weeklyIncome,
            monthlyIncome = parameters.monthlyIncome,
            yearlyIncome = parameters.yearlyIncome,
            allTimeIncome = parameters.allTimeIncome
        )

        // Total Deductions
        TotalDeductions(yearlyDeductions = parameters.yearlyDeductions)

        // Navigation Bar
        NavigationBar()
    }
}
