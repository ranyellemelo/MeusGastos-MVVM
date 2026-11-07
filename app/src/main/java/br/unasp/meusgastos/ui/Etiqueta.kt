
package br.unasp.meusgastos.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Etiqueta(
    texto: String,
    selecionada: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Text(
        text = texto,
        color = if (selecionada) Color.White else Muted,
        fontWeight = if (selecionada) {
            FontWeight.Bold
        } else {
            FontWeight.Normal
        },
        modifier = modifier
            .background(
                color = if (selecionada) Coral else Card,
                shape = RoundedCornerShape(50)
            )
            .clickable(onClick = onClick)
            .padding(
                horizontal = 16.dp,
                vertical = 10.dp
            )
    )
}
