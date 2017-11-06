package com.xw.simple.baseapp.dagger.base

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by XWCHQ on 2017/11/6-15:03
 */

abstract class DaggerBaseApplication : Application(), HasActivityInjector {

    @Inject
    @JvmField
    var mActivityInjector: DispatchingAndroidInjector<Activity>? = null

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.create().inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity>? {
        return mActivityInjector
    }
}
