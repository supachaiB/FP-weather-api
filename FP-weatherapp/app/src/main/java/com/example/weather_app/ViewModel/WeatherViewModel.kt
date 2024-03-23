package com.example.weather_app.ViewModel

import androidx.lifecycle.ViewModel
import com.example.weather_app.Repository.WeatherRepository
import com.example.weather_app.Server.ApiClient
import com.example.weather_app.Server.ApiServices
import retrofit2.create

//ใช้สำหรับการจัดการสภาพอากาศ (weather)
class WeatherViewModel(val repository: WeatherRepository): ViewModel() {

    constructor():this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat: Double, lng: Double, unit: String) =
        repository.getCurrentWeather(lat, lng, unit)

    fun loadForecastWeather(lat: Double, lng: Double, unit: String) =
        repository.getForecastWeather(lat, lng, unit)
}