package com.kotlin.user.data.api

import com.kotlin.base.data.protocol.BaseResq
import com.kotlin.user.data.protocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 * @author :  lwb
 * Date: 2019/8/26
 * Desc:
 */
interface UserApi {
    /**
     * 用户注册
     */
    @POST("")
    fun register(@Body req: RegisterReq): Observable<BaseResq<String>>
}