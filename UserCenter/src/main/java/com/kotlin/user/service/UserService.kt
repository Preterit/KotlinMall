package com.kotlin.user.service

import rx.Observable


interface UserService {
    fun rigister(mobile: String, verifyCode: String, pwd: String): Observable<Boolean>
}