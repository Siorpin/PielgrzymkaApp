package com.example.pielgrzymkabielskozywiecka.core.presentation.mappers

import com.example.pielgrzymkabielskozywiecka.core.data.database.tables.Prayers
import com.example.pielgrzymkabielskozywiecka.core.presentation.uiModels.PrayerUI

fun Prayers.toPrayerUI(): PrayerUI {
    return PrayerUI(
        title = title,
        lyrics = lyrics
    )
}