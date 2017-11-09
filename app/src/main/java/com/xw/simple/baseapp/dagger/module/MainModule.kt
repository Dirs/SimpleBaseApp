package com.xw.simple.baseapp.dagger.module

import com.xw.simple.baseapp.ui.base.FragmentBean
import com.xw.simple.baseapp.ui.base.FragmentPageListAdapter
import com.xw.simple.baseapp.ui.home.MainActivity
import com.xw.simple.baseapp.ui.home.MobileAddressFragment
import com.xw.simple.baseapp.ui.home.PostcodeFragment
import com.xw.simple.baseapp.ui.home.WeatherFragment
import dagger.Module
import dagger.Provides

/**
 * Created by XWCHQ on 2017/11/6-17:07
 */

@Module
class MainModule {

    @Provides
    fun provideHomePageAdapter(activity: MainActivity): FragmentPageListAdapter {
        var pageListAdapter = FragmentPageListAdapter(activity.supportFragmentManager, listOf(FragmentBean(WeatherFragment(), "天气"),
                FragmentBean(PostcodeFragment(), "邮编"),FragmentBean(MobileAddressFragment(), "手机号归属")))
        return pageListAdapter
    }
}
