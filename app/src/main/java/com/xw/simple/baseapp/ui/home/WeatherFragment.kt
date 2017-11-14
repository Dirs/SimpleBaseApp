package com.xw.simple.baseapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xw.simple.baseapp.R
import com.xw.simple.baseapp.api.retrofit.MobApi
import com.xw.simple.baseapp.ui.base.BaseFragment
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.fragment_weather.*
import okhttp3.ResponseBody
import javax.inject.Inject

/**
 * Created by XWCHQ on 2017/11/6-16:51
 */

class WeatherFragment : BaseFragment() {

    @Inject
    @JvmField
    var mMobApi: MobApi? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_weather, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var observable = mMobApi?.getWeatherCities()
        observable?.subscribe(object:Observer<ResponseBody>{
            override fun onError(e: Throwable) {
            }

            override fun onSubscribe(d: Disposable) {
            }

            override fun onComplete() {
            }

            override fun onNext(t: ResponseBody) {
                tvContent.text = t.string()
            }

        })
    }
}
