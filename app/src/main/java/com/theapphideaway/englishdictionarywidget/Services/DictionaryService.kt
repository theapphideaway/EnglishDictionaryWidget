package com.theapphideaway.englishdictionarywidget.Services

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DictionaryService {

    private val BASE_URL = "https://wordsapiv1.p.mashape.com/"
    private var mRetrofit: Retrofit? = null

    init {

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(headersInterceptor())
            .build()

        mRetrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

        println(mRetrofit)
    }

    fun headersInterceptor() = Interceptor { chain ->
        chain.proceed(chain.request().newBuilder()
            .addHeader("X-Mashape-Key", "")
            .build())
    }

    fun getHeadlineApi(): DictionaryInterface {
        return mRetrofit!!.create<DictionaryInterface>(DictionaryInterface::class.java!!)
    }



}