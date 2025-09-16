package com.example.foodapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.foodapp.classes.Restaurants

@Composable
fun RestaurantsRow() {
    Text(
        text = "Busca los mejores restaurantes",
        fontSize = 26.sp,
        fontWeight = FontWeight.Medium,
        color = Color.DarkGray,
        modifier = Modifier
            .padding(top = 20.dp, bottom = 10.dp)
    )

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
    ) {
        items(Restaurants){ restaurant ->
            Column (
                modifier = Modifier
                    .padding(end = 15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .size(105.dp),
                    contentAlignment = Alignment.Center
                ) {
                    AsyncImage(
                        modifier = Modifier
                            .size(100.dp),
                        model = restaurant.image,
                        contentDescription = restaurant.name
                    )
                }
                Text(
                    text = restaurant.name,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.DarkGray,
                )
            }
        }
    }
}