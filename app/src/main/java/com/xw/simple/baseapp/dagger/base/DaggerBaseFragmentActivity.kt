package com.xw.simple.baseapp.dagger.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

/**
 * Created by XWCHQ on 2017/11/6-15:54
 */

abstract class DaggerBaseFragmentActivity : AppCompatActivity(),HasSupportFragmentInjector {

    @Inject
    @JvmField
    var mFragmentInjector:DispatchingAndroidInjector<Fragment>?=null

    override fun supportFragmentInjector(): AndroidInjector<Fragment>? {
        return mFragmentInjector
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }
}