package net.soy.watermelon.model

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

class HeatWaveShelterRetrofitFactory {
    companion object {
        private val BASE_URL = "http://openapigw.mpss.go.kr"
        fun build(): Retrofit {
            return Retrofit.Builder()
                .addConverterFactory(SimpleXmlConverterFactory.create()) //SimpleXmlConverterFactory 추가
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())  //RxJava2CallAdapterFactory 추가
                .baseUrl(BASE_URL)
                .build()
        }
    }
}