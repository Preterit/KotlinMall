package com.kotlin.base.presenter

import com.kotlin.base.presenter.view.BaseView

/**
 * @author :  lwb
 * Date: 2019/8/23
 * Desc:
 */
open class BasePresenter<T : BaseView> {
    lateinit var mVIew: T
}