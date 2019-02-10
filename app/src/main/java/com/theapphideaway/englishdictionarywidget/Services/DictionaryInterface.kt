package com.theapphideaway.englishdictionarywidget.Services

import com.theapphideaway.englishdictionarywidget.Models.WordResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface DictionaryInterface {
    @GET("words/example")
    fun getSpecificHeadlines(
    ): Deferred<WordResponse>
}