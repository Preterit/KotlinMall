package com.kotlin.user.data.api

import com.kotlin.base.data.protocol.BaseResq
import com.kotlin.user.data.protocol.RegisterReq
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * @author :  lwb
 * Date: 2019/8/26
 * Desc:
 */
interface UserApi {
    /**
     * 用户注册
     */
    @FormUrlEncoded
    @POST("test_register/index.php")
    fun register(@Field("phone") phone: String, @Field("pwd") pwd: String, @Field("verification") verification: String): Observable<BaseResq<RegisterReq>>

    /**
     * 用户注册
     */
    @FormUrlEncoded
    @POST("test_register/index.php")
    fun register(@FieldMap map: HashMap<String, String>): Observable<BaseResq<Any>>
    //phone  pwd  verification
//    fun register(@Body req: RegisterReq): Observable<BaseResq<String>>

    /**
     * 用户注册
     */
    @FormUrlEncoded
    @POST("app/init")
    fun init(@Field("data") data: String): Observable<BaseResq<String>>
}