package net.soy.watermelon.model

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {
    companion object {
        private val BASE_URL = "https://dapi.kakao.com"
        fun build(): Retrofit {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create()) //GsonConverterFactory 추가
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())  //RxJava2CallAdapterFactory 추가
                .baseUrl(BASE_URL)
                .build()
        }
    }
}