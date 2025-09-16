package com.example.foodapp.classes

data class Category(
    val name: String,
    val image: String
)

val categories = listOf(
    Category("Fast Food", "https://cdn-icons-png.flaticon.com/512/706/706944.png"),
    Category("Chinese", "https://cdn-icons-png.flaticon.com/512/3259/3259027.png"),
    Category("Italian", "https://cdn-icons-png.flaticon.com/512/3511/3511307.png"),
    Category("Healthy", "https://cdn-icons-png.flaticon.com/512/706/706195.png"),
    Category("Mexican", "https://cdn-icons-png.flaticon.com/512/706/706856.png"),
    Category("Sea Food", "https://cdn-icons-png.flaticon.com/512/5391/5391916.png"),
    Category("Desserts", "https://cdn-icons-png.flaticon.com/512/1847/1847191.png")
)
