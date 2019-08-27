package com.kotlin.base.rx

import io.reactivex.Observer
import io.reactivex.disposables.Disposable


/**
 * @author :  lwb
 * Date: 2019/8/26
 * Desc:
 */
open class BaseSubscriber<T> : Observer<T>{
    override fun onComplete() {
    }

    override fun onSubscribe(d: Disposable) {
    }

    override fun onNext(t: T) {
    }

    override fun onError(e: Throwable) {
    }


}