package com.xw.simple.baseapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xw.simple.baseapp.R
import com.xw.simple.baseapp.dagger.base.DaggerBaseFragment

/**
 * Created by XWCHQ on 2017/11/6-16:51
 */

class MobileAddressFragment : DaggerBaseFragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_mobile_address,container,false)
    }
}