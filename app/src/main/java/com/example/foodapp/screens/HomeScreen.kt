package com.example.foodapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodapp.components.CategoriesRow
import com.example.foodapp.components.FoodVerticalGrid
import com.example.foodapp.components.Header
import com.example.foodapp.components.RestaurantsRow
import com.example.foodapp.ui.theme.FoodAppTheme

@Composable
fun HomeScreen(innerPadding : PaddingValues){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(start = 20.dp, end = 20.dp)
    ){
        // Header usuario
        Header()

        //Categorias
        CategoriesRow()

        // Restaurantes
        RestaurantsRow()

        // Comidas
        FoodVerticalGrid()
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