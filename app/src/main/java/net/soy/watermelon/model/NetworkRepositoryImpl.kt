package net.soy.watermelon.model

import io.reactivex.Single
import net.soy.watermelon.KAKAO_API_KEY
import net.soy.watermelon.api.SearchServiceApi
import net.soy.watermelon.request.BookSearchRequest
import net.soy.watermelon.response.BookSearchResponse

class NetworkRepositoryImpl(private val api: SearchServiceApi) : Repository {
    override fun getBookData(bookSearchRequest: BookSearchRequest): Single<BookSearchResponse> {
        return api.searchBook(
            auth = "KakaoAK $KAKAO_API_KEY",
            query = bookSearchRequest.query,
            sort = bookSearchRequest.sort,
            page = bookSearchRequest.page,
            size = bookSearchRequest.size,
            target = bookSearchRequest.target
        )
    }
}