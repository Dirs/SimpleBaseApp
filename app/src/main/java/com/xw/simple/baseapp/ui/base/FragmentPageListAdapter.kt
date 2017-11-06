package com.xw.simple.baseapp.ui.base

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by XWCHQ on 2017/11/6-18:54
 */

class FragmentPageListAdapter (fm: FragmentManager, val fragmentList: List<FragmentBean> = ArrayList()) : FragmentPagerAdapter(fm) {

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
