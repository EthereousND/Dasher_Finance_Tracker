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
fun TotalAverageEarnings(
    hourly: String,
    daily: String,
    weekly: String,
    monthly: String,
    yearly: String
) {
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
            Text(text = "Total Average Earnings", style = MaterialTheme.typography.titleMedium)

            // Hourly
            Text(text = "Hourly: $hourly", style = MaterialTheme.typography.bodyMedium)

            // Daily
            Text(text = "Daily: $daily", style = MaterialTheme.typography.bodyMedium)

            // Weekly
            Text(text = "Weekly: $weekly", style = MaterialTheme.typography.bodyMedium)

            // Monthly
            Text(text = "Monthly: $monthly", style = MaterialTheme.typography.bodyMedium)

            // Yearly
            Text(text = "Yearly: $yearly", style = MaterialTheme.typography.bodyMedium)
        }
    }
}
