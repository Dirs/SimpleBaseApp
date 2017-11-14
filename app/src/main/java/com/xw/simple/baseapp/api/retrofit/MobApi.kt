package com.xw.simple.baseapp.api.retrofit

import com.xw.simple.baseapp.BuildConfig
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by XWCHQ on 2017/11/9-10:57
 */

class MobApi(okHttpClient: OkHttpClient) {
    private val apiService: MobApiService

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build()
        apiService = retrofit.create(MobApiService::class.java)
    }

    companion object {
        private var instance: MobApi? = null

        fun getInstance(okHttpClient: OkHttpClient): MobApi {
            if (instance == null) {
                synchronized(MobApi::class.java) {
                    if (instance == null) {
                        instance = MobApi(okHttpClient)
                    }
                }
            }
            return instance!!
        }
    }

    fun getWeatherCities(): Observable<ResponseBody> {
        return wrapSchedule(apiService.getWeatherCitys(BuildConfig.MOB_APP_KEY))
    }

    private fun <T> wrapSchedule(observer: Observable<T>): Observable<T> {
        return observer.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
    }
}
