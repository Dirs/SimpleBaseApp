package com.xw.simple.baseapp.dagger.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import dagger.android.AndroidInjection

/**
 * Created by XWCHQ on 2017/11/6-15:54
 */

abstract class DaggerBaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }
}
