package com.example.pielgrzymkabielskozywiecka.pielgrzymka.presentation.homeScreen

data class HomeScreenState(
    val isOgloszenieLoading: Boolean = false,
    val ogloszeniaText: String = "Chwilowo nie ma żadnych ogłoszeń :)"
)
