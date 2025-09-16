package com.example.foodapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.compose.SubcomposeAsyncImage
import com.example.foodapp.classes.categories
import com.example.foodapp.components.CategoriesRow
import com.example.foodapp.components.Header
import com.example.foodapp.ui.theme.FoodAppTheme
import com.example.foodapp.ui.theme.PrincipalColor

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