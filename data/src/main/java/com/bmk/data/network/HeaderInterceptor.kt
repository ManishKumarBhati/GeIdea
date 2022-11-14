package com.bmk.data.network


import com.bmk.data.util.AUTHORIZATION
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject

class HeaderInterceptor @Inject internal constructor() :
    Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request().newBuilder()
        original.header(AUTHORIZATION, "")

        return chain.proceed(original.build())
    }
}