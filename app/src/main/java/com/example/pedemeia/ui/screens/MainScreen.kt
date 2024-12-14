package com.example.pedemeia.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.pedemeia.domain.AccountAmount
import com.example.pedemeia.ui.components.CashVisor
import com.example.pedemeia.ui.navigation.Constants.ADD_TRANSACTION_ROUTE

@Composable
fun MainScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier.padding(16.dp),
                onClick = {
                    navController.navigate(ADD_TRANSACTION_ROUTE)
                },
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add transaction",
                )
            }
        },
        modifier =
            modifier
                .fillMaxSize()
                .padding(top = 32.dp),
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CashVisor(modifier, accountAmount = AccountAmount(100.0))
        }
    }
}
