package com.example.dasherfinancetracker.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun UpcomingExpenses(upcomingExpenses: List<Expense>) {
    // Container for the section
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = MaterialTheme.shapes.large
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Title
            Text(text = "Upcoming Expenses", style = MaterialTheme.typography.titleMedium)

            // List of upcoming expenses
            upcomingExpenses.forEach { expense ->
                Text(text = "${expense.name}: ${expense.cost} due on ${expense.dueDate}", style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}

// Data class to represent an expense
data class Expense(
    val name: String,
    val cost: String,
    val dueDate: String
)
