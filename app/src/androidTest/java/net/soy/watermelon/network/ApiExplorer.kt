package net.soy.watermelon.network

import net.soy.watermelon.HEAT_WAVE_SHELTER_SERVICE_API_KEY
import org.junit.Test
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

class ApiExplorer {

    @Test
    fun test(args: Array<String>) {
        val urlBuilder =
            StringBuilder("http://openapi.animal.go.kr/openapi/service/rest/abandonmentPublicSrvc/sido") /*URL*/
        urlBuilder.append(
            "?" + URLEncoder.encode(
                "ServiceKey",
                "UTF-8"
            ) + "=$HEAT_WAVE_SHELTER_SERVICE_API_KEY"
        ) /*Service Key*/
        val url = URL(urlBuilder.toString())
        val conn = url.openConnection() as HttpURLConnection
        conn.requestMethod = "GET"
        conn.setRequestProperty("Content-type", "application/json")
        println("Response code: " + conn.responseCode)
        val rd: BufferedReader
        rd = if (conn.responseCode >= 200 && conn.responseCode <= 300) {
            BufferedReader(InputStreamReader(conn.inputStream))
        } else {
            BufferedReader(InputStreamReader(conn.errorStream))
        }
        val sb = StringBuilder()
        var line: String?
        while (rd.readLine().also { line = it } != null) {
            sb.append(line)
        }
        rd.close()
        conn.disconnect()
        println(sb.toString())
    }
}