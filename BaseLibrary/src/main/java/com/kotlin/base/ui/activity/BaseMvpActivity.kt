package com.kotlin.base.ui.activity

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.presenter.view.BaseView

/**
 * @author :  lwb
 * Date: 2019/8/23
 * Desc:
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {

    lateinit var presenter: T

    override fun hideLoading() {
    }

    override fun onError() {
    }

    override fun showLoading() {
    }

}