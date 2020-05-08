package net.soy.watermelon.api

import io.reactivex.Single
import net.soy.watermelon.response.BookSearchResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface AnimalInfoApi {

    @GET("/openapi/service/rest/abandonmentPublicSrvc/kind")
    fun searchByKind(@Query("query") query:String,
                    @Query("sort") sort:String?,
                    @Query("page") page:Int?,
                    @Query("size") size:Int?,
                    @Query("target") target:String?): Single<BookSearchResponse>

}