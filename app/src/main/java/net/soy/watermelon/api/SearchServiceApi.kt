package net.soy.watermelon.api

import io.reactivex.Single
import net.soy.watermelon.response.BookSearchResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface SearchServiceApi {

    @GET("/v3/search/book")
    fun searchBook(@Header("Authorization") auth:String,
                    @Query("query") query:String,
                    @Query("sort") sort:String?,
                    @Query("page") page:Int?,
                    @Query("size") size:Int?,
                    @Query("target") target:String?): Single<BookSearchResponse>

}