package com.example.foodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.foodapp.classes.foods
import com.example.foodapp.ui.theme.PrincipalColor
import com.example.foodapp.ui.theme.StarIconColor

@Composable
fun FoodVerticalGrid() {
    Text(
        text = "Nuestras mejores comidas",
        fontSize = 26.sp,
        fontWeight = FontWeight.Medium,
        color = Color.DarkGray,
        modifier = Modifier
            .padding(top = 20.dp, bottom = 10.dp)
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
    ) {
        items(foods){ food ->
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .height(120.dp)
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    AsyncImage(
                        model = food.image,
                        contentDescription = food.name,
                        modifier = Modifier
                            .fillMaxSize()
                    )

                    Box(
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .clip(RoundedCornerShape(10.dp))
                            .background(PrincipalColor)
                            .padding(10.dp)
                            .height(30.dp)
                            .width(60.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "$${food.price}",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "${food.rating}",
                        tint = StarIconColor,
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Text(
                        text = food.rating.toString(),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.DarkGray,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                    Text(
                        text = food.name,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.DarkGray,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                }
            }
        }
    }
}