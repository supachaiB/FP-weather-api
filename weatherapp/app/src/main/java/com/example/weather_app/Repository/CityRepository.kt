package com.example.weather_app.Repository

import com.example.weather_app.Server.ApiServices


class CityRepository(val api: ApiServices) {
    fun getCities(q: String, limit: Int) =
        api.getCitiesList(q, limit, "0773ade61d7e97ff9b2d9a906d7670bf")
}