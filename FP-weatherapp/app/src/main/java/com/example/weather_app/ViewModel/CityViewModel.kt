package com.example.weather_app.ViewModel

import androidx.lifecycle.ViewModel
import com.example.weather_app.Repository.CityRepository
import com.example.weather_app.Server.ApiClient
import com.example.weather_app.Server.ApiServices

//ใช้สำหรับการจัดการข้อมูลเมือง (cities)
class CityViewModel(val repository: CityRepository) : ViewModel() {
    constructor() : this(CityRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCity(q: String, limit: Int) =
        repository.getCities(q, limit)
}