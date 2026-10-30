package com.blackoutnance.ghidramobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GhidraApp()
        }
    }
}

@Composable
fun GhidraApp() {
    val background = Color(0xFF10141C)
    val panel = Color(0xFF1B2330)
    val accent = Color(0xFF00D6A0)

    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(background)
                .padding(24.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "GHIDRA",
                color = accent,
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "MOBILE AI",
                color = Color.White,
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Reverse Engineering Assistant",
                color = Color.LightGray
            )

            Spacer(modifier = Modifier.height(40.dp))

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = panel
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "ANÁLISE DE ARQUIVOS",
                        color = accent,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Seu laboratório portátil de engenharia reversa.",
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = { },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("IMPORTAR ARQUIVO")
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "AI Assistant • Em desenvolvimento",
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}
