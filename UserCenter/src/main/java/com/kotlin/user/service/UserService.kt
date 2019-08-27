package com.kotlin.user.service

import io.reactivex.Observable


interface UserService {
    fun rigister(mobile: String, verifyCode: String, pwd: String): Observable<Boolean>
}