package com.example.weather_app.Repository

import com.example.weather_app.Server.ApiServices

// Repository สำหรับจัดการข้อมูลเมือง
// ฟังก์ชันสำหรับการรับข้อมูลเมือง
// q: คำค้นหา
// limit: จำนวนเมืองที่ต้องการรับข้อมูล
// ใช้ API key เป็น "0773ade61d7e97ff9b2d9a906d7670bf" เพื่อขอข้อมูลเมือง

class CityRepository(val api: ApiServices) {
    fun getCities(q: String, limit: Int) =
        api.getCitiesList(q, limit, "0773ade61d7e97ff9b2d9a906d7670bf")
}