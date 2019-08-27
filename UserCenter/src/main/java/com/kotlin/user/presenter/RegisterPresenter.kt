package com.kotlin.user.presenter

import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.impl.UserServiceImpl

/**
 * @author :  lwb
 * Date: 2019/8/23
 * Desc:
 */
class RegisterPresenter : BasePresenter<RegisterView>() {
    /**
     * 业务逻辑
     */
    fun register(mobile: String, verifyCode: String, pwd: String) {
        val userService = UserServiceImpl()
        userService.rigister(mobile, verifyCode, pwd)
                .execute(object : BaseSubscriber<Boolean>() {
                    override fun onNext(t: Boolean) {
                        mVIew.registerResult(t)
                    }
                })

//        userService.init("eyJ1aSI6IjMwMDAxMTAwIiwic2kiOiIyMDAwMzU0NyIsInYiOiIxMDEwNCIsInBpIjoiMSIsInNuIjoiRDRERTZDMzMxQ0FBQTgxRDY2Qzc3MUM4OTg4ODQ5MTMiLCJ0cyI6IjE1NjY4ODU4NTczMDkifQ==")
//                .execute(object : BaseSubscriber<Boolean>() {
//                    override fun onNext(t: Boolean) {
//                        mVIew.registerResult(t)
//                    }
//                })
    }
}