package com.xw.simple.baseapp.mvp.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import java.lang.ref.WeakReference

/**
 * Created by XWCHQ on 2017/11/14-09:37
 */

class RxPresenter<T : BaseContact.BaseView> : BaseContact.BasePresenter<T> {

    var mViewReference:WeakReference<T>?=null

    val mCompositeDisposable:CompositeDisposable by lazy {
        CompositeDisposable()
    }

    override fun attachView(view: T) {
        mViewReference = WeakReference(view)
    }

    fun addDisposable(disposable:Disposable){
        mCompositeDisposable.add(disposable)
    }

    fun dispose(){
        mCompositeDisposable.dispose()
    }

    override fun detachView() {
        mViewReference?.clear()
        mViewReference = null
        dispose()
    }

    fun getView():T?{
        return mViewReference?.get()
    }
}
