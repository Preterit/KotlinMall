package com.kotlin.user.service.impl

import android.util.Log
import com.kotlin.base.data.protocol.BaseResq
import com.kotlin.base.rx.BaseException
import com.kotlin.user.data.UserRepository
import com.kotlin.user.data.protocol.RegisterReq
import com.kotlin.user.service.UserService
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class UserServiceImpl : UserService {

    override fun rigister(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        val repository = UserRepository()

        repository.register(mobile, pwd, verifyCode).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe({
            Log.e("UserServiceImpl", "ok ok ok ok ")
        },{
            Log.e("UserServiceImpl", "${it.message}")
        })

        return repository.register(mobile, pwd, verifyCode)
                .flatMap(object : io.reactivex.functions.Function<BaseResq<RegisterReq>, Observable<Boolean>> {
                    override fun apply(t: BaseResq<RegisterReq>): Observable<Boolean> {
                        if (t.code != 200) {
                            return Observable.error(BaseException(t.code, t.message))
                        }
                        return Observable.just(true)
                    }
                })
    }

    fun init(data: String): Observable<Boolean> {
        val repository = UserRepository()

        return repository.init(data).flatMap(object : io.reactivex.functions.Function<BaseResq<String>, Observable<Boolean>> {
            override fun apply(t: BaseResq<String>): Observable<Boolean> {
                if (t.code != 200) {
                    return Observable.error(BaseException(t.code, t.message))
                }
                return Observable.just(true)
            }
        })
    }
}