
package br.unasp.meusgastos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import br.unasp.meusgastos.ui.TelaGastos
import br.unasp.meusgastos.viewmodel.GastosViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface {
                    val gastosViewModel: GastosViewModel = viewModel()

                    TelaGastos(
                        viewModel = gastosViewModel
                    )
                }
            }
        }
    }
}
