package com.kotlin.base.presenter.view

/**
 * @author :  lwb
 * Date: 2019/8/23
 * Desc:
 */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError()
}