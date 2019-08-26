package com.kotlin.base.ext

import com.kotlin.base.rx.BaseSubscriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * @author :  lwb
 * Date: 2019/8/26
 * Desc:
 */
fun <T> Observable<T>.execute(baseSubscriber: BaseSubscriber<T>) {
    this.observeOn(AndroidSchedulers.mainThread())// 监听在主线程
            .subscribeOn(Schedulers.io())         // 注册在io线程
            .subscribe(baseSubscriber)
}