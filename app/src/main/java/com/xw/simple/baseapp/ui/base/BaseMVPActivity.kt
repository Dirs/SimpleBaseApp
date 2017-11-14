package com.xw.simple.baseapp.ui.base

import android.os.Bundle
import com.xw.simple.baseapp.mvp.base.BaseContact
import javax.inject.Inject

/**
 * Created by XWCHQ on 2017/11/14-10:21
 */

abstract class BaseMVPActivity<T : BaseContact.BasePresenter<Any>> : BaseFragmentActivity(){
    @Inject
    @JvmField
    var mPresenter:T? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        attachView()
    }

   fun attachView(){
       mPresenter?.attachView(this)
   }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.detachView()
    }
}
