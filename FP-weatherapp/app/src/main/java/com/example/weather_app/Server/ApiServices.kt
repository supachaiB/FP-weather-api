package com.example.weather_app.Server

import com.example.weather_app.model.CityResponseApi
import com.example.weather_app.model.CurrentReponseApi
import com.example.weather_app.model.ForecastResponseApi
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

// สร้าง HTTP GET request สำหรับข้อมูลสภาพอากาศปัจจุบัน
interface ApiServices {
    @GET("data/2.5/weather")
    fun getCurrentWeather(
        @Query("lat") lat:Double,
        @Query("lon") lon:Double,
        @Query("units") units:String,
        @Query("appid") ApiKey:String,
    ): Call<CurrentReponseApi>

    // สร้าง HTTP GET request สำหรับข้อมูลสภาพอากาศในอนาคต
    @GET("data/2.5/forecast")
    fun getForecastWeather(
        @Query("lat") lat:Double,
        @Query("lon") lon:Double,
        @Query("units") units:String,
        @Query("appid") ApiKey:String,
    ): Call<ForecastResponseApi>

    // สร้าง HTTP GET request สำหรับรายการเมือง
    @GET("geo/1.0/direct")
    fun getCitiesList(
        @Query("q") q: String,
        @Query("limit") limit: Int,
        @Query("appid") ApiKey: String
    ): Call<CityResponseApi>
}