package com.kotlin.user.data

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.data.protocol.BaseResq
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.data.protocol.RegisterReq
import io.reactivex.Observable

/**
 * @author :  lwb
 * Date: 2019/8/26
 * Desc:
 */
class UserRepository {

    private val userApi by lazy { RetrofitFactory.instance.create(UserApi::class.java) }

    fun register(mobile: String, pwd: String, verifyCode: String): Observable<BaseResq<RegisterReq>> {
        val map = HashMap<String,String>()
        map["phone"] = mobile
        map["pwd"] = pwd
        map["verification"] = verifyCode
//        return userApi.register(map)
        return userApi.register(mobile,pwd,verifyCode)
    }

    fun init(data: String): Observable<BaseResq<String>> {
        return userApi.init(data)
    }
}