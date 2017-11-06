package com.xw.simple.baseapp.ui.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;

import com.xw.simple.baseapp.R;
import com.xw.simple.baseapp.dagger.base.DaggerBaseActivity;
import com.xw.simple.baseapp.ui.base.FragmentPageListAdapter;

import javax.inject.Inject;

/**
 * Created by XWCHQ on 2017/11/6-17:22
 */

public class MainActivity extends DaggerBaseActivity{
    @Inject
    FragmentPageListAdapter mPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        if(mPagerAdapter != null){
            viewPager.setAdapter(mPagerAdapter);
        }
    }
}
