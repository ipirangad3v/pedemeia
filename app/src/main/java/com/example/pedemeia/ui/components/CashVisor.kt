package com.example.pedemeia.ui.components

import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pedemeia.domain.AccountAmount
import com.example.pedemeia.utils.formatToCurrency

@Composable
fun CashVisor(
    modifier: Modifier = Modifier,
    accountAmount: AccountAmount,
) {
    Row(
        horizontalArrangement = spacedBy(8.dp),
    ) {
        with(accountAmount) {
            Text(
                modifier = modifier,
                text = currency,
                fontSize = 24.sp,
            )
            Text(
                modifier = modifier,
                text = value.formatToCurrency(),
                fontSize = 24.sp,
            )
        }
    }
}
