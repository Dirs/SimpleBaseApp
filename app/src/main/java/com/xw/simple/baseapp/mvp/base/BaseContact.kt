package com.xw.simple.baseapp.mvp.base

/**
 * Created by XWCHQ on 2017/11/14-09:24
 */
class BaseContact {
    interface BasePresenter<T>{
        fun attachView(view:T)
        fun detachView()
    }

    interface BaseView
}