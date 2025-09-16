package com.example.foodapp.classes

import kotlin.reflect.typeOf

data class Food(
    val name: String,
    val image: String,
    val rating: Float,
    val price: Float
)

val foods = listOf(
    Food("McPollo", "https://api-middleware-mcd.mcdonaldscupones.com/media/image/product\$McPollo-SinRef.png/200/200/original?country=mx", 4.5f, 79.9f),
    Food("BigMac", "https://imgs.search.brave.com/o3xuEUh4yprBknAw-0rBjI9PYbexT5O3qzETnylqHgw/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly93d3cu/ZnJlZXBuZ2xvZ29z/LmNvbS91cGxvYWRz/L2J1cmdlci1wbmcv/ZG93bmxvYWQtaGFt/YnVyZ2VyLWJ1cmdl/ci1wbmctaW1hZ2Ut/cG5nLWltYWdlLXBu/Z2ltZy0zMi5wbmc", 4.7f, 98.9f),
    Food("McFlurry", "https://api-middleware-mcd.mcdonaldscupones.com/media/image/product\$k8Xdq9CL/200/200/original?country=mx", 4.2f, 89.9f),
    Food("Ensalada", "https://imgs.search.brave.com/utTB6305Avg3nW7-NWrGxNX3E3i1NcHCIvcKle9mm1I/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly93d3cu/cG5nYXJ0cy5jb20v/ZmlsZXMvMi9TYWxh/ZC1Eb3dubG9hZC1U/cmFuc3BhcmVudC1Q/TkctSW1hZ2UucG5n", 4.0f, 129.9f),
    Food("Pollo Frito", "https://imgs.search.brave.com/mdRtNWe6rfC7kI_O7YqHfWDYOoTo0vHE5AaclA5KoZA/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly93d3cu/cG5nbWFydC5jb20v/ZmlsZXMvMTcvRnJp/ZWQtTm9uLVZlZy1U/cmFuc3BhcmVudC1C/YWNrZ3JvdW5kLnBu/Zw", 4.3f, 199.9f),
    Food("Sushi", "https://imgs.search.brave.com/Kep9VAPsxRCeLL8hbCDXA9nWhy2Qenh-wVytp_wbSxU/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly93d3cu/cG5nYXJ0cy5jb20v/ZmlsZXMvMy9TdXNo/aS1QTkctSGlnaC1R/dWFsaXR5LUltYWdl/LnBuZw", 4.6f, 99.9f),
    Food("Pizza", "https://imgs.search.brave.com/4YfOJDeAbvtRxVzqCxmy69hK9-zV5eePMFcP20-Lnu8/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly93d3cu/cG5nYWxsLmNvbS93/cC1jb250ZW50L3Vw/bG9hZHMvNC9Eb21p/bm9zLVBpenphLVNs/aWNlLVBORy5wbmc", 3.8f, 149.9f)
)