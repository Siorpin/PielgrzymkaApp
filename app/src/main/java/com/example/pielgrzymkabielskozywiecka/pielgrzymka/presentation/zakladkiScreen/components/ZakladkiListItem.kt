package com.example.pielgrzymkabielskozywiecka.pielgrzymka.presentation.zakladkiScreen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pielgrzymkabielskozywiecka.core.presentation.uiModels.ZakladkiUI
import com.example.pielgrzymkabielskozywiecka.ui.theme.Poppins
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun ZakladkiListItem(
    zakladkiUI: ZakladkiUI,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    var isButtonEnabled by remember {
        mutableStateOf(true) }

    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = modifier
            .clickable(isButtonEnabled) {
                coroutineScope.launch {
                    isButtonEnabled = false
                    onClick()
                    delay(400)
                    isButtonEnabled = true
                }
            }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(20.dp)
        ) {
            Text(
                text = zakladkiUI.name,
                fontFamily = Poppins,
                fontSize = 20.sp,
                fontWeight = FontWeight.W400
            )
        }
        HorizontalDivider(
            color = MaterialTheme.colorScheme.primary,
            thickness = 2.dp,
            modifier = Modifier
                .padding(end = 20.dp)
        )
    }
}