package com.xw.simple.baseapp.dagger.module;

import com.xw.simple.baseapp.ui.base.FragmentBean;
import com.xw.simple.baseapp.ui.base.FragmentPageListAdapter;
import com.xw.simple.baseapp.ui.home.MainActivity;
import com.xw.simple.baseapp.ui.home.PostcodeFragment;
import com.xw.simple.baseapp.ui.home.WeatherFragment;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

/**
 * Created by XWCHQ on 2017/11/6-17:07
 */

@Module
public class MainModule {

    @Provides
    public FragmentPageListAdapter providerHomePageAdapter(MainActivity activity) {
        ArrayList<FragmentBean> fragmentList = new ArrayList<>();
        fragmentList.add(new FragmentBean(new WeatherFragment(),"天气"));
        fragmentList.add(new FragmentBean(new PostcodeFragment(),"邮编"));
        fragmentList.add(new FragmentBean(new WeatherFragment(),"手机号归属"));
        FragmentPageListAdapter pageListAdapter = new FragmentPageListAdapter(activity.getSupportFragmentManager(), fragmentList);
        return pageListAdapter;
    }
}
