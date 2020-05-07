package net.soy.watermelon.api

import io.reactivex.Single
import net.soy.watermelon.response.BookSearchResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface KakaoSearchServiceApi {

    @GET("/v2/search/book")
    fun searchBook(@Header("Authorization") auth:String,
                    @Query("query") query:String,
                    @Query("sort") sort:String,
                    @Query("page") page:Int,
                    @Query("target") target:Int,
                    @Query("size") size:Int): Single<BookSearchResponse>

}