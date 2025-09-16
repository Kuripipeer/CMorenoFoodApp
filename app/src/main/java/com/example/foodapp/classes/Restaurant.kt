package com.example.foodapp.classes

data class Restaurant(
    val name: String,
    val image: String
)

val Restaurants = listOf(
    Restaurant("Burger King", "https://cdn-icons-png.flaticon.com/512/5977/5977578.png"),
    Restaurant("McDonald's", "https://cdn-icons-png.flaticon.com/512/732/732217.png"),
    Restaurant("KFC", "https://imgs.search.brave.com/3J09IDXsHy-R77aVN_cuTRRURg7XEN0otctc88hpmnE/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly91cGxv/YWQud2lraW1lZGlh/Lm9yZy93aWtpcGVk/aWEvZW4vdGh1bWIv/NS81Ny9LRkNfbG9n/by1pbWFnZS5zdmcv/MjUwcHgtS0ZDX2xv/Z28taW1hZ2Uuc3Zn/LnBuZw"),
    Restaurant("Starbucks", "https://cdn-icons-png.flaticon.com/512/5977/5977591.png"),
    Restaurant("Subway", "https://imgs.search.brave.com/TvZbMLhTUjenL-7uhGeUTS-ro7mv0VseBennsQFLACc/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9pbWFn/ZXMuc2Vla2xvZ28u/Y29tL2xvZ28tcG5n/LzI4LzIvc3Vid2F5/LWxvZ28tcG5nX3Nl/ZWtsb2dvLTI4NzM0/OC5wbmc"),
    Restaurant("Dominos", "https://imgs.search.brave.com/_S3fo-VkuW4PHhKSpCk1-jcVa4qrnydMHjCe31BYVPA/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9pbWFn/ZXMuc2Vla2xvZ28u/Y29tL2xvZ28tcG5n/LzE2LzIvZG9taW5v/cy1sb2dvLXBuZ19z/ZWVrbG9nby0xNjg0/ODgucG5n"),
    Restaurant("Pizza Hut", "https://imgs.search.brave.com/yHA04xEFxs6kEZFrIelfUmuyGJsxZjQFMXBkg05W3h4/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9pbWFn/ZXMuc2Vla2xvZ28u/Y29tL2xvZ28tcG5n/LzUwLzIvcGl6emEt/aHV0LWxvZ28tcG5n/X3NlZWtsb2dvLTUw/MTM2NC5wbmc")
)
