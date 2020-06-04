package net.soy.watermelon.network

import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import net.soy.watermelon.HEAT_WAVE_SHELTER_SERVICE_API_KEY
import net.soy.watermelon.api.HeatWaveShelterApi
import net.soy.watermelon.api.SearchServiceApi
import net.soy.watermelon.model.HeatWaveShelterRetrofitFactory
import net.soy.watermelon.model.RetrofitFactory
import net.soy.watermelon.request.BookSearchRequest
import okhttp3.ResponseBody
import org.junit.Test
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

class heatwaveShelterServiceApiTest {

//    @Test
//    fun test() {
//        val urlBuilder =
//            StringBuilder("http://openapigw.mpss.go.kr/openapi/service/heatwaveShelterService/RegionalShelterTypeCrntSt") /*URL*/
//        urlBuilder.append(
//            "?ServiceKey=$HEAT_WAVE_SHELTER_SERVICE_API_KEY"
//        ) /*Service Key*/
//        urlBuilder.append("&" + URLEncoder.encode("equpType","UTF-8") + "=" + URLEncoder.encode("004", "UTF-8")); /*연도*/
////        urlBuilder.append("&" + URLEncoder.encode("areaCd","UTF-8") + "=" + URLEncoder.encode("4476034000", "UTF-8")); /*지역코드*/
////        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
////        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*목록 건수*/
//        val url = URL(urlBuilder.toString())
//        val conn = url.openConnection() as HttpURLConnection
//        conn.requestMethod = "GET"
//        conn.setRequestProperty("Content-type", "application/json")
//        println("Response code: " + conn.responseCode)
//        val rd: BufferedReader
//        rd = if (conn.responseCode >= 200 && conn.responseCode <= 300) {
//            BufferedReader(InputStreamReader(conn.inputStream))
//        } else {
//            BufferedReader(InputStreamReader(conn.errorStream))
//        }
//        val sb = StringBuilder()
//        var line: String?
//        while (rd.readLine().also { line = it } != null) {
//            sb.append(line)
//        }
//        rd.close()
//        conn.disconnect()
//        println(sb.toString())
//    }

    @Test
    fun requestAllList(){
        val bookSearchRequest = BookSearchRequest(query = "테스트", sort = null, page = 1, size = null, target = null)
        val build = HeatWaveShelterRetrofitFactory.build().create(SearchServiceApi::class.java).searchBook(
            auth = "KakaoAK $",
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

    companion object {
        private val TAG = heatwaveShelterServiceApiTest::class.java.simpleName
    }
}