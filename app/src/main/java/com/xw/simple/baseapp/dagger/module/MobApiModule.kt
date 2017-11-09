package com.xw.simple.baseapp.dagger.module

import com.xw.simple.baseapp.BuildConfig
import com.xw.simple.baseapp.api.okhttp3.LogLogger
import com.xw.simple.baseapp.api.retrofit.MobApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Created by XWCHQ on 2017/11/9-10:57
 */
@Module
class MobApiModule {

    @Provides
    fun provideLogger(): HttpLoggingInterceptor.Logger {
        return LogLogger()
    }

    @Provides
    fun provideOkHttpClient(logger: HttpLoggingInterceptor.Logger): OkHttpClient {
        var loggingInterceptor = HttpLoggingInterceptor(logger)
        loggingInterceptor.level =
                if (BuildConfig.DEBUG)
                    HttpLoggingInterceptor.Level.BODY
                else
                    HttpLoggingInterceptor.Level.NONE
        val client = OkHttpClient.Builder()
                .readTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(15, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .build()
        return client
    }

    @Provides
    @Singleton
    fun provideMobApi(client: OkHttpClient): MobApi {
        return MobApi.getInstance(client)
    }
}
