package com.xw.simple.baseapp.dagger.base

import com.xw.simple.baseapp.dagger.module.AllActivityModule
import com.xw.simple.baseapp.dagger.module.AllFragmentModule
import com.xw.simple.baseapp.dagger.module.MobApiModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by XWCHQ on 2017/11/6-15:42
 */

@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class, AllActivityModule::class, AllFragmentModule::class,MobApiModule::class))
interface AppComponent {
    fun inject(app: DaggerBaseApplication)
}
