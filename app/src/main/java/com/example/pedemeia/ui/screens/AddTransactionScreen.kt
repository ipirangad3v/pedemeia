package com.example.pedemeia.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun AddTransactionScreen(navController: NavHostController) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(
            text = "Add Transaction",
            style = MaterialTheme.typography.displayLarge,
        )
    }
}
