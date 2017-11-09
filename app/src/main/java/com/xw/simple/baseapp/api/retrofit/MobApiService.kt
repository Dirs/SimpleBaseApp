package com.xw.simple.baseapp.api.retrofit

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by XWCHQ on 2017/11/9-10:57
 */

interface MobApiService{
    @GET("weather/citys")
    abstract fun getWeatherCitys(@Query("key") appKey: String): Call<ResponseBody>
}
