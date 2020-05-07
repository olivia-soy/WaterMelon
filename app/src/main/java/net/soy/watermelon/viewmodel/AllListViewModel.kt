package net.soy.watermelon.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.soy.watermelon.api.KakaoSearchServiceApi
import net.soy.watermelon.base.BaseViewModel
import net.soy.watermelon.response.BookSearchResponse

class AllListViewModel(private val bookSearchApi: KakaoSearchServiceApi) : BaseViewModel(){

    private val _bookSearchResponseLiveData = MutableLiveData<BookSearchResponse>()
    val bookSearchResponseLiveData: LiveData<BookSearchResponse>
        get() = _bookSearchResponseLiveData

    fun searchBook(){

    }

}