
package br.unasp.meusgastos.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.unasp.meusgastos.model.Categoria
import br.unasp.meusgastos.viewmodel.GastosViewModel

@Composable
fun TelaGastos(
    viewModel: GastosViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Fundo)
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        Text(
            text = "Meus Gastos",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Navy
        )

        FormularioGasto(viewModel)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Etiqueta(
                texto = "Todas",
                selecionada = viewModel.filtro == null,
                onClick = { viewModel.aoFiltrar(null) }
            )

            Categoria.entries.forEach { categoria ->
                Etiqueta(
                    texto = categoria.rotulo,
                    selecionada = viewModel.filtro == categoria,
                    onClick = {
                        viewModel.aoFiltrar(categoria)
                    }
                )
            }
        }

        ResumoGastos(
            total = viewModel.total,
            quantidade = viewModel.quantidade
        )

        ListaGastos(
            gastos = viewModel.gastosVisiveis,
            onRemover = viewModel::remover
        )
    }
}
