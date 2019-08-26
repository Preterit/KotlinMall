package com.kotlin.user.data

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.data.protocol.BaseResq
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.data.protocol.RegisterReq
import rx.Observable

/**
 * @author :  lwb
 * Date: 2019/8/26
 * Desc:
 */
class UserRepository {
    fun register(mobile: String, pwd: String, verifyCode: String): Observable<BaseResq<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java).register(RegisterReq(mobile,pwd,verifyCode))
    }

}