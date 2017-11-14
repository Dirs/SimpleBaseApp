package com.xw.simple.baseapp.ui.home

import android.os.Bundle
import com.xw.simple.baseapp.R
import com.xw.simple.baseapp.ui.base.BaseFragmentActivity
import com.xw.simple.baseapp.ui.base.FragmentPageListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 * Created by XWCHQ on 2017/11/6-17:22
 */

class MainActivity : BaseFragmentActivity() {

    @Inject
    @JvmField
    var mPagerAdapter: FragmentPageListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (mPagerAdapter != null) {
            container.adapter = mPagerAdapter
        }
        tabs.setupWithViewPager(container)
    }
}
