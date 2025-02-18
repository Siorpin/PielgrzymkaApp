package com.example.pielgrzymkabielskozywiecka.pielgrzymka.presentation.authorsScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.pielgrzymkabielskozywiecka.pielgrzymka.presentation.shared.SecondaryScreenTopBar

@Composable
fun AuthorsScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        SecondaryScreenTopBar(
            name = "Autorzy",
            navController = navController
        )
        Text("Aplikację stworzył Kuba Sierpień")
    }
}