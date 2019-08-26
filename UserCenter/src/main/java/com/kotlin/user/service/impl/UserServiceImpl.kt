package com.kotlin.user.service.impl

import com.kotlin.base.data.protocol.BaseResq
import com.kotlin.base.rx.BaseException
import com.kotlin.user.data.UserRepository
import com.kotlin.user.service.UserService
import rx.Observable
import rx.functions.Func1

class UserServiceImpl : UserService {
    override fun rigister(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        val repository = UserRepository()
//        return repository.register(mobile, pwd, verifyCode).flatMap(Func1<BaseResq<String>, Observable<Boolean>> {
//            Observable.just(true)
//        })

        return repository.register(mobile, pwd, verifyCode).flatMap(object : Func1<BaseResq<String>, Observable<Boolean>> {
            override fun call(t: BaseResq<String>): Observable<Boolean> {
                if (t.status == 0) {
                    return Observable.error(BaseException(t.status, t.message))
                }
                return Observable.just(true)
            }
        })
    }
}