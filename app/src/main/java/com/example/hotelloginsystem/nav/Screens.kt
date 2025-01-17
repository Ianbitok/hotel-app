package com.example.hotelloginsystem.nav


sealed class Screens(val route: String) {
    object MainScreen:Screens(route = "main_screen")
    object AddDataScreen:Screens(route = "add_data_screen")
    object GetDataScreen:Screens(route = "get_data_screen")
}