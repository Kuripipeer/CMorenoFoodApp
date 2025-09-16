package com.example.foodapp.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.ui.theme.PrincipalColor

@Composable
fun Header(){
    Row (
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(imageVector = Icons.Default.AccountCircle,
            contentDescription = "Usuario",
            tint = PrincipalColor,
            modifier = Modifier
                .size(40.dp)
        )
        Text(
            text = "Hola, Daniel",
            fontSize = 26.sp,
            fontWeight = FontWeight.Medium,
            color = Color.DarkGray,
            modifier = Modifier
                .padding(10.dp)
                .weight(1f)
        )
        Icon(imageVector = Icons.AutoMirrored.Filled.ExitToApp,
            contentDescription = "Usuario",
            tint = PrincipalColor,
            modifier = Modifier
                .size(40.dp)
        )
    }
}