package com.kotlin.base.ext

import com.kotlin.base.rx.BaseSubscriber
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author :  lwb
 * Date: 2019/8/26
 * Desc:
 */
fun <T> Observable<T>.execute(baseSubscriber: BaseSubscriber<T>) {
    this.subscribeOn(Schedulers.io())// 注册在io线程
            .observeOn(AndroidSchedulers.mainThread())// 监听在主线程
            .subscribe(baseSubscriber)
}