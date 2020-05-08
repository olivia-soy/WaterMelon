package net.soy.watermelon.network

import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import net.soy.watermelon.KAKAO_API_KEY
import net.soy.watermelon.api.SearchServiceApi
import net.soy.watermelon.model.RetrofitFactory
import net.soy.watermelon.request.BookSearchRequest
import net.soy.watermelon.viewmodel.AllListViewModel
import org.junit.Test

class SearchApiTest {
    companion object {
        private val TAG = SearchApiTest::class.java.simpleName
    }

    @Test
    fun requestAllList(){
        val bookSearchRequest = BookSearchRequest(query = "테스트", sort = null, page = 1, size = null, target = null)
        val build = RetrofitFactory.build().create(SearchServiceApi::class.java).searchBook(
            auth = "KakaoAK $KAKAO_API_KEY",
            query = bookSearchRequest.query,
            sort = bookSearchRequest.sort,
            page = bookSearchRequest.page,
            size = bookSearchRequest.size,
            target = bookSearchRequest.target)
        build.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.w(TAG, "response : $it")
            }, {e ->
                Log.w(TAG, "error : ${e.message}")
                e.printStackTrace()
            })
    }
}