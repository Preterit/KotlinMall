package com.kotlin.user.presenter

import android.support.annotation.MainThread
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.UserService
import com.kotlin.user.service.impl.UserServiceImpl
import rx.Scheduler
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

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
                .observeOn(AndroidSchedulers.mainThread())  // 监听在主线程
                .subscribeOn(Schedulers.io())               // 注册在io线程
                .subscribe(object : Subscriber<Boolean>() {
                    override fun onNext(t: Boolean)  {
                        mVIew.registerResult(t)
                    }

                    override fun onCompleted() {
                    }

                    override fun onError(e: Throwable?) {
                    }

                })
    }
}