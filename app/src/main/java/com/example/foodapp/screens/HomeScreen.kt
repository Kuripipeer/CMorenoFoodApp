package com.example.foodapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.ui.theme.FoodAppTheme
import com.example.foodapp.ui.theme.PrincipalColor

@Composable
fun HomeScreen(innerPadding : PaddingValues){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(30.dp)
    ){
        // Header usuario
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = "Usuario",
                tint = PrincipalColor,
                modifier = Modifier
                    .size(35.dp)
            )
            Text(
                text = "Hola, Daniel",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                modifier = Modifier
                    .padding(10.dp)
                    .weight(1f)
            )
            Icon(imageVector = Icons.AutoMirrored.Filled.ExitToApp,
                contentDescription = "Usuario",
                tint = PrincipalColor,
                modifier = Modifier
                    .size(35.dp)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = "id:pixel_7"
)
@Composable
fun HomeScreenPreview() {
    FoodAppTheme {
        HomeScreen(innerPadding = PaddingValues(0.dp))
    }
}