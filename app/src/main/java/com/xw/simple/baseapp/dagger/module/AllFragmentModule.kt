package com.xw.simple.baseapp.dagger.module

import com.xw.simple.baseapp.ui.home.MobileAddressFragment
import com.xw.simple.baseapp.ui.home.PostcodeFragment
import com.xw.simple.baseapp.ui.home.WeatherFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by XWCHQ on 2017/11/6-17:56
 */

@Module
abstract class AllFragmentModule {
    @ContributesAndroidInjector()
    abstract fun bindWeatherFragment(): WeatherFragment

    @ContributesAndroidInjector()
    abstract fun bindPostcodeFragment(): PostcodeFragment

    @ContributesAndroidInjector()
    abstract fun bindMobileAddressFragment(): MobileAddressFragment
}