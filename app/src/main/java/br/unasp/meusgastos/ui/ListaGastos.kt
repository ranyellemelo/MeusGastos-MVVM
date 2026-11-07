
package br.unasp.meusgastos.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.unasp.meusgastos.model.Gasto

@Composable
fun ListaGastos(
    gastos: List<Gasto>,
    onRemover: (Long) -> Unit
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        gastos.forEach { gasto ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Color.White,
                        RoundedCornerShape(16.dp)
                    )
                    .padding(14.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = gasto.descricao,
                        color = Navy,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Text(
                        text = gasto.categoria.rotulo,
                        color = Muted,
                        fontSize = 13.sp
                    )
                }

                Text(
                    text = formatarReal(gasto.valor),
                    color = Navy
                )

                TextButton(
                    onClick = { onRemover(gasto.id) }
                ) {
                    Text(
                        text = "remover",
                        color = Coral
                    )
                }
            }
        }

        if (gastos.isEmpty()) {
            Text(
                text = "Nenhum gasto encontrado.",
                color = Muted
            )
        }
    }
}
