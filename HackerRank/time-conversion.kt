import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    var timeConverted = s
    if (s.startsWith("12")) {
        timeConverted = s.replaceRange(0,2, "00")
    }
    if (timeConverted.contains("PM")) {
        var _hour = timeConverted.substring(0,2).toInt()
        var _newHour = _hour + 12
        timeConverted = s.replaceRange(0,2, _newHour.toString())
    }
    return timeConverted.substring(0,8)
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
