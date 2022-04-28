package exceptionStudy

import java.io.File

fun main() {
  while(true) {
    try {
      println("Enter num")
      var input = readLine()
      var toNum = input?.toInt()
      println(toNum)
      break
    } catch (e: java.lang.NumberFormatException) {
      println(e.printStackTrace())
    }
  }
}