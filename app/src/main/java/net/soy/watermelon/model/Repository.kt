package net.soy.watermelon.model

import io.reactivex.Single
import net.soy.watermelon.request.BookSearchRequest
import net.soy.watermelon.response.BookSearchResponse

interface Repository {
    fun getBookData(bookSearchRequest: BookSearchRequest): Single<BookSearchResponse>
}