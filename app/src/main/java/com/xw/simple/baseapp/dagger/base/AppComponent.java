package com.xw.simple.baseapp.dagger.base;

import com.xw.simple.baseapp.dagger.module.MainModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by XWCHQ on 2017/11/6-15:42
 */

@Component(modules = {AndroidInjectionModule.class, MainModule.class})
public interface AppComponent {
    void inject(DaggerBaseApplication app);
}
