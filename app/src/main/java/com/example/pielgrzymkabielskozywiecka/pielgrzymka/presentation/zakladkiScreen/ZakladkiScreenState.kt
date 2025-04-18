package com.example.pielgrzymkabielskozywiecka.pielgrzymka.presentation.zakladkiScreen

import com.example.pielgrzymkabielskozywiecka.core.data.DataHolder
import com.example.pielgrzymkabielskozywiecka.core.presentation.uiModels.ZakladkiUI

data class ZakladkiScreenState(
    val zakladki: List<ZakladkiUI> = DataHolder.zakladki
)
