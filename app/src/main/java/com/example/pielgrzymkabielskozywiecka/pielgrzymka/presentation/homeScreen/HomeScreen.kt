package com.example.pielgrzymkabielskozywiecka.pielgrzymka.presentation.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.pielgrzymkabielskozywiecka.pielgrzymka.presentation.homeScreen.components.AnnouncementsBox
import com.example.pielgrzymkabielskozywiecka.pielgrzymka.presentation.homeScreen.components.HelloSegment
import com.example.pielgrzymkabielskozywiecka.pielgrzymka.presentation.homeScreen.components.OptionsRow
import com.example.pielgrzymkabielskozywiecka.pielgrzymka.presentation.homeScreen.components.TopBar

@Composable
fun HomeScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .background(
                    color = MaterialTheme.colorScheme.surface,
                    shape = RoundedCornerShape(
                        topEnd = 16.dp,
                        topStart = 16.dp
                    )
                )
        ) {
            TopBar()
            HelloSegment()
            AnnouncementsBox()
            OptionsRow(navController)
        }
    }
}