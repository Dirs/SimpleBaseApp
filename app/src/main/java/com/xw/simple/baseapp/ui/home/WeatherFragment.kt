package com.xw.simple.baseapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xw.simple.baseapp.R
import com.xw.simple.baseapp.api.retrofit.MobApi
import com.xw.simple.baseapp.dagger.base.DaggerBaseFragment
import kotlinx.android.synthetic.main.fragment_weather.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject

/**
 * Created by XWCHQ on 2017/11/6-16:51
 */

class WeatherFragment : DaggerBaseFragment() {

    @Inject
    @JvmField
    var mMobApi:MobApi?=null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_weather,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if(mMobApi != null){
            var weatherCities = mMobApi?.getWeatherCities()
            weatherCities?.enqueue(object:retrofit2.Callback<ResponseBody>{
                override fun onResponse(call: Call<ResponseBody>?, response: Response<ResponseBody>?) {
                    activity.runOnUiThread{
                        tvContent.text = response?.body()?.string()
                    }
                }

                override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

                }

            })
        }
    }
}
