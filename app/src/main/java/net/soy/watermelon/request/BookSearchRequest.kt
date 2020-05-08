package net.soy.watermelon.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import net.soy.watermelon.model.SearchSortEnum

data class BookSearchRequest(
    val query : String,
    @Expose val sort : String?,
    @Expose val page : Int?,
    @Expose val size : Int?,
    @Expose val target : String?
)