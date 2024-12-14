package com.example.pedemeia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pedemeia.ui.theme.PeDeMeiaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            PeDeMeiaTheme {
                App()
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun Preview() {
    PeDeMeiaTheme {
        App()
    }
}
