package com.xw.simple.baseapp.api.okhttp3

import android.util.Log
import okhttp3.logging.HttpLoggingInterceptor

/**
 * Created by XWCHQ on 2017/11/9-11:42
 */

class LogLogger:HttpLoggingInterceptor.Logger{
    override fun log(message: String?) {
        Log.d("Http",message)
    }

}
