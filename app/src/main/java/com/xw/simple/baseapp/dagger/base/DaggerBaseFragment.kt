package com.xw.simple.baseapp.dagger.base

import android.content.Context
import android.support.v4.app.Fragment
import dagger.android.support.AndroidSupportInjection

/**
 * Created by XWCHQ on 2017/11/9-11:55
 */

open class DaggerBaseFragment : Fragment(){
    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}
