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
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    if (arr.size == 0) return;
    val length = arr.size
    var i = 0
    var nPositives = 0.0
    var nNegatives = 0.0
    var nZeros = 0.0;
    while (i < length) {
        if (arr[i] > 0) nPositives++
        else if (arr[i] < 0) nNegatives++
        else nZeros++
        i++
    }
    
    println(String.format("%.6f", nPositives/length))
    println(String.format("%.6f", nNegatives/length))
    println(String.format("%.6f", nZeros/length))
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
