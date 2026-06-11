/*
 * Copyright 2026 Vincent Tsen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package vtsen.hashnode.dev.newemptycomposeapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Un contenedor básico con el tema de Material Design
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PantallaPrueba()
                }
            }
        }
    }
}

// Esta anotación le dice a Kotlin que esta función "dibuja" interfaz gráfica
@Composable
fun PantallaPrueba() {
    // Variables de estado: Si esta variable cambia, la interfaz se actualiza sola
    var mensaje by remember { mutableStateOf("Esperando confirmación...") }

    // Column organiza los elementos verticalmente, como una lista
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = mensaje,
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(24.dp)) // Espacio vacío

        Button(onClick = {
            mensaje = "¡Jetpack Compose y compilación en la nube funcionando! 🎉"
        }) {
            Text("Probar Aplicación")
        }
    }
}