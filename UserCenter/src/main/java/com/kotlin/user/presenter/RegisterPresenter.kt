package com.kotlin.user.presenter

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.user.presenter.view.RegisterView

/**
 * @author :  lwb
 * Date: 2019/8/23
 * Desc:
 */
class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register() {
        mVIew.registerResult(true)
    }

}