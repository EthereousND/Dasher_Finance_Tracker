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
import androidx.compose.ui.viewinterop.AndroidView
import com.github.mikephil.charting.charts.LineChart

@Composable
fun TotalEarningsCurrentPeriod(
    daily: String,
    weekly: String,
    monthly: String,
    yearly: String,
    allTime: String,
    lineChart: LineChart // Pass the LineChart object for visualizing the data
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
            Text(text = "Total Earnings for the Current Period", style = MaterialTheme.typography.titleMedium)

            // Daily
            Text(text = "Daily: $daily", style = MaterialTheme.typography.bodyMedium)

            // Weekly
            Text(text = "Weekly: $weekly", style = MaterialTheme.typography.bodyMedium)

            // Monthly
            Text(text = "Monthly: $monthly", style = MaterialTheme.typography.bodyMedium)

            // Yearly
            Text(text = "Yearly: $yearly", style = MaterialTheme.typography.bodyMedium)

            // All Time
            Text(text = "All Time: $allTime", style = MaterialTheme.typography.bodyMedium)

            // Line Chart for visualizing the data
            // You can customize the LineChart object outside this composable
            AndroidView({ lineChart })
        }
    }
}
