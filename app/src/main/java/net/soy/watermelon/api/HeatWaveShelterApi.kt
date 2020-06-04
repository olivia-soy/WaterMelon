package net.soy.watermelon.api

import io.reactivex.Single
import net.soy.watermelon.response.BookSearchResponse
import retrofit2.Call
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface HeatWaveShelterApi {

    @GET("/openapi/service/heatwaveShelterService/RegionalShelterTypeCrntSt")
    fun byRegionalShelterTypeCrntSt(@Header("Authorization") auth:String,
                                    @Query("ServiceKey") query:String): Single<BookSearchResponse>

}