package com.example.weather_app.Repository

import com.example.weather_app.Server.ApiServices

class WeatherRepository(val api:ApiServices) {

    fun getCurrentWeather(lat: Double,lng:Double,unit:String) =
        api.getCurrentWeather(lat,lng,unit, "d6fe1abdc8efd080cd33cbb42019aebe")

    fun getForecastWeather(lat: Double,lng:Double,unit:String) =
        api.getForecastWeather(lat,lng,unit, "d6fe1abdc8efd080cd33cbb42019aebe")
}