package com.example.dasherfinancetracker.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NetIncome(
    weeklyIncome: Float,
    monthlyIncome: Float,
    yearlyIncome: Float,
    allTimeIncome: Float
) {
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
            // TODO: Line chart to visualize the net income
            // You can use MPAndroidChart library to set up the data and styling

            // Displaying the net income values
            IncomeValue(label = "Weekly Income", value = weeklyIncome)
            IncomeValue(label = "Monthly Income", value = monthlyIncome)
            IncomeValue(label = "Yearly Income", value = yearlyIncome)
            IncomeValue(label = "All Time Income", value = allTimeIncome)
        }
    }
}

@Composable
fun IncomeValue(label: String, value: Float) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
        shape = MaterialTheme.shapes.small
    ) {
        Text(
            text = "$label: $value",
            style = MaterialTheme.typography.labelLarge
        )
    }
}
