
package br.unasp.meusgastos.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ResumoGastos(
    total: Double,
    quantidade: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Navy,
                RoundedCornerShape(16.dp)
            )
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Total",
                color = AzulClaro
            )
            Text(
                text = formatarReal(total),
                color = Color.White,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Text(
            text = "$quantidade gasto(s)",
            color = AzulClaro
        )
    }
}
