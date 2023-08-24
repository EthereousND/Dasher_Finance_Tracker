package com.example.dasherfinancetracker.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RemainingExpensesAndIncomeGoal(
    remainingExpenses: Float,
    dailyIncomeGoal: Float
) {
    // Container for the section
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = MaterialTheme.shapes.large
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Remaining Expenses Progress Indicator
            CircularProgressIndicatorWithLabel(
                value = remainingExpenses,
                label = "Remaining Expenses"
            )

            // Daily Income Goal Progress Indicator
            CircularProgressIndicatorWithLabel(
                value = dailyIncomeGoal,
                label = "Daily Income Goal"
            )
        }
    }
}

@Composable
fun CircularProgressIndicatorWithLabel(value: Float, label: String) {
    Surface(
        modifier = Modifier.padding(100.dp),
        shape = MaterialTheme.shapes.large
    ) {
        CircularProgressIndicatorWithLabel(
            progress = value,
            color = MaterialTheme.colorScheme.primary,
            strokeWidth = ProgressIndicatorDefaults.CircularStrokeWidth
        )
    }
    // Label for the progress indicator
    Text(text = label, style = MaterialTheme.typography.labelMedium)
}

fun CircularProgressIndicatorWithLabel(progress: Float, color: Any, strokeWidth: Any) {
    TODO("Not yet implemented")
}
