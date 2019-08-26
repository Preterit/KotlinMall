package com.kotlin.base.data.protocol

/**
 * @author :  lwb
 * Date: 2019/8/26
 * Desc:
 */
class BaseResq<T>(val status: Int, val message: String, val data: T)