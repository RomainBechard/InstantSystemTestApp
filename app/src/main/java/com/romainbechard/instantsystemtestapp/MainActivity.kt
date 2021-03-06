package com.romainbechard.instantsystemtestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.romainbechard.instantsystemtestapp.ui.screens.home.HomeScreen
import com.romainbechard.instantsystemtestapp.ui.screens.home.HomeViewModel
import com.romainbechard.instantsystemtestapp.ui.theme.InstantSystemTestAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstantSystemTestAppTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(topBar = { TopAppBar(title = { Text(text = "InstantSystemTest") }) }) {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        HomeScreen()
                    }
                }
            }
        }
    }
}