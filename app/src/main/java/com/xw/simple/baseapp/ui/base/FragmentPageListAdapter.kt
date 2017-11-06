package com.xw.simple.baseapp.ui.base

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by XWCHQ on 2017/11/6-16:18
 */
open class FragmentPageListAdapter(private val fm:FragmentManager, private val fragmentList:List<FragmentBean> = ArrayList()):FragmentPagerAdapter(fm),List<FragmentBean> by fragmentList{

    override fun getItem(position: Int): Fragment {
        return fragmentList[position].fragment
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return fragmentList[position].title
    }
}