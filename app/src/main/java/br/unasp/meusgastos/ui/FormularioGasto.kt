
package br.unasp.meusgastos.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.unasp.meusgastos.model.Categoria
import br.unasp.meusgastos.viewmodel.GastosViewModel

@Composable
fun FormularioGasto(
    viewModel: GastosViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color.White,
                RoundedCornerShape(18.dp)
            )
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        OutlinedTextField(
            value = viewModel.descricao,
            onValueChange = viewModel::aoDigitarDescricao,
            label = { Text("Descrição do gasto") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            OutlinedTextField(
                value = viewModel.valorTexto,
                onValueChange = viewModel::aoDigitarValor,
                label = { Text("Valor") },
                singleLine = true,
                modifier = Modifier.weight(1f)
            )

            Button(
                onClick = viewModel::adicionar,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Navy
                )
            ) {
                Text("Adicionar")
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Categoria.entries.forEach { categoria ->
                Etiqueta(
                    texto = categoria.rotulo,
                    selecionada =
                        viewModel.categoriaSelecionada == categoria,
                    onClick = {
                        viewModel.aoSelecionarCategoria(categoria)
                    }
                )
            }
        }

        viewModel.erro?.let { mensagem ->
            Text(
                text = mensagem,
                color = Erro
            )
        }
    }
}
