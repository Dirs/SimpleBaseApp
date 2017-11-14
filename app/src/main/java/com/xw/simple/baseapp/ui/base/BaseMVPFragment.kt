package com.xw.simple.baseapp.ui.base

import android.os.Bundle
import android.view.View
import com.xw.simple.baseapp.mvp.base.BaseContact
import javax.inject.Inject

/**
 * Created by XWCHQ on 2017/11/14-10:31
 */
class BaseMVPFragment<T:BaseContact.BasePresenter<Any>> :BaseFragment(){

    @Inject
    @JvmField
    var mPresenter:T?=null

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        attachView()
    }

    private fun attachView() {
        mPresenter?.attachView(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mPresenter?.detachView()
    }
}