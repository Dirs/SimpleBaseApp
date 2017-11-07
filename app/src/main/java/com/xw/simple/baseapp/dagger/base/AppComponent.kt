package com.xw.simple.baseapp.dagger.base

import com.xw.simple.baseapp.dagger.module.AllActivityModule

import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 * Created by XWCHQ on 2017/11/6-15:42
 */

@Component(modules = arrayOf(AndroidInjectionModule::class, AllActivityModule::class))
interface AppComponent {
    fun inject(app: DaggerBaseApplication)
}
