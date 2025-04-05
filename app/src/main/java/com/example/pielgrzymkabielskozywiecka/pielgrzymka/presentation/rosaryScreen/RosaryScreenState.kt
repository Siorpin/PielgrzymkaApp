package com.example.pielgrzymkabielskozywiecka.pielgrzymka.presentation.rosaryScreen

import com.example.pielgrzymkabielskozywiecka.core.data.DataHolder
import com.example.pielgrzymkabielskozywiecka.core.presentation.enumClasses.Days
import com.example.pielgrzymkabielskozywiecka.core.presentation.uiModels.RosaryMysteryUI

data class RosaryScreenState(
    val currentDay: Int = 1,
    val primaryMystery: RosaryMysteryUI = RosaryMysteryUI("","", emptyList()),
    val secondaryMystery: List<RosaryMysteryUI> = DataHolder.rosaryMysteries
)