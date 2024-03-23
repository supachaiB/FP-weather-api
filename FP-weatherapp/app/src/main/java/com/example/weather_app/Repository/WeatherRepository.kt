package com.example.weather_app.Repository

import com.example.weather_app.Server.ApiServices

class WeatherRepository(val api:ApiServices) {

    // ฟังก์ชัน getCurrentWeather ใช้สำหรับเรียกข้อมูลสภาพอากาศปัจจุบัน
    fun getCurrentWeather(lat: Double,lng:Double,unit:String) =
        api.getCurrentWeather(lat,lng,unit, "d6fe1abdc8efd080cd33cbb42019aebe")

    // ฟังก์ชัน getForecastWeather ใช้สำหรับเรียกข้อมูลสภาพอากาศที่พยากรณ์ข้างหน้า
    fun getForecastWeather(lat: Double,lng:Double,unit:String) =
        api.getForecastWeather(lat,lng,unit, "d6fe1abdc8efd080cd33cbb42019aebe")
}