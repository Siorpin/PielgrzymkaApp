package com.example.pielgrzymkabielskozywiecka.pielgrzymka.presentation.homeScreen.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TopBar(
    modifier: Modifier = Modifier
) {
    Surface(
        color = Color(0xFF83B9F8),
        shape = CircleShape,
        modifier = modifier
            .padding(
                horizontal = 20.dp,
                vertical = 5.dp
            )
            .size(40.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Notifications,
            contentDescription = "Powiadomienia",
            modifier = Modifier
                .padding(7.dp)
        )
    }
}