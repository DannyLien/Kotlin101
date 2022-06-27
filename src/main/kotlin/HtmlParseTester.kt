import org.jsoup.Jsoup

fun main() {

    val doc =
        Jsoup.connect("https://developer.android.com/kotlin").get()
    val elements = doc.select(".devsite-wrapper")
    elements.forEach {
        println(it.text())
    }

}