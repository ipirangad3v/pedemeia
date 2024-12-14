package com.example.pedemeia.ui.components

import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CashVisor(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = spacedBy(8.dp),
    ) {
        Text(
            modifier = modifier,
            text = "R$",
        )
        Text(
            modifier = modifier,
            text = "0,00",
        )
    }
}
