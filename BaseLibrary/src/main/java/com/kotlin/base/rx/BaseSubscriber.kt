package com.kotlin.base.rx

import rx.Subscriber

/**
 * @author :  lwb
 * Date: 2019/8/26
 * Desc:
 */
open class BaseSubscriber<T> : Subscriber<T>() {
    override fun onNext(t: T) {
    }

    override fun onCompleted() {
    }

    override fun onError(e: Throwable?) {
    }
}