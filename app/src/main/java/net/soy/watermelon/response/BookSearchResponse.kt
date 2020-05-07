package net.soy.watermelon.response

data class BookSearchResponse(
    val documents: ArrayList<Document>,
    val meta :Meta
) {
    data class Document(
        val authors: ArrayList<String>,
        val contents: String,
        val datetime: String,
        val isbn: String,
        val price: Int,
        val publisher: String,
        val sale_price: Int,
        val status: String,
        val thumbnail: String,
        val title: String,
        val translators: ArrayList<String>,
        val url: String
    )
    data class Meta(
        val is_end: Boolean,
        val pageable_count: Int,
        val total_count: Int
    )
}