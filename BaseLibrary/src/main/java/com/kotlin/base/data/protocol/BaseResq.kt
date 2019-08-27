package com.kotlin.base.data.protocol

/**
 * @author :  lwb
 * Date: 2019/8/26
 * Desc:
 */
class BaseResq<T>(val code: Int, val message: String, val data: T)