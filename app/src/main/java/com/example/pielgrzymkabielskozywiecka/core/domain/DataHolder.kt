package com.example.pielgrzymkabielskozywiecka.core.domain

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import com.example.pielgrzymkabielskozywiecka.core.navigation.Screen
import com.example.pielgrzymkabielskozywiecka.core.presentation.BottomBarUI
import com.example.pielgrzymkabielskozywiecka.core.presentation.ZakladkiUI

object DataHolder {
    val bottomBarButtons = mutableListOf(
        BottomBarUI(
            name = "Dom",
            screen = Screen.HOME,
            icon = Icons.Default.Home,
            isOnFocus = true
        ),
        BottomBarUI(
            name = "Zakładki",
            screen = Screen.ZAKLADKI,
            icon = Icons.Default.Star,
        ),
        BottomBarUI(
            name = "Duchowi",
            screen = Screen.DUCHOWI,
            icon = Icons.Default.AccountCircle,
        )
    )

    val zakladki = listOf(
        ZakladkiUI(
            name = "Śpiewnik",
            destination = Screen.SPIEWNIK
        ),
        ZakladkiUI(
            name = "Modlitewnik",
            destination = Screen.MODLITEWNIK
        ),
        ZakladkiUI(
            name = "Tajemnice różańca",
            destination = Screen.TAJEMNICE
        ),
        ZakladkiUI(
            name = "Strona internetowa",
            destination = Screen.WWW
        ),
        ZakladkiUI(
            name = "Autorzy",
            destination = Screen.AUTORZY
        )
    )
}