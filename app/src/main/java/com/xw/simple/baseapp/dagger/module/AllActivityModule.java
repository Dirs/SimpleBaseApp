package com.xw.simple.baseapp.dagger.module;

import com.xw.simple.baseapp.ui.home.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by XWCHQ on 2017/11/6-17:56
 */

@Module
public abstract class AllActivityModule {
    @ContributesAndroidInjector(modules = {MainModule.class})
    public abstract MainActivity bindMainActivity();
}
