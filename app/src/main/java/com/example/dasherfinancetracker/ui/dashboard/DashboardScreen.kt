package com.example.dasherfinancetracker.ui.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dasherfinancetracker.ui.components.*

@Composable
fun DashboardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Total Average Earnings
        TotalAverageEarnings()

        // Total Earnings for the Current Period
        TotalEarningsCurrentPeriod()

        // Upcoming Expenses
        UpcomingExpenses()

        // Total Remaining Monthly Expenses and Daily Income Goal
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            RemainingExpensesAndIncomeGoal()
        }

        // Net Income
        NetIncome()

        // Total Deductions
        TotalDeductions()

        // Navigation Bar (You can replace this with your actual navigation component)
        NavigationBar()
    }
}
