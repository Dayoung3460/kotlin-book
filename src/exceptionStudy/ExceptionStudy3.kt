package exceptionStudy

import kotlin.math.sqrt

fun mySqrt(v: Double): Double {
  if(v < 0) {
    throw Exception("should not be a negative num")
  }
  return sqrt(v)
}

fun main() {
  try {
    println(mySqrt(4.0))
    println(mySqrt(-1.0))
  } catch (e: Exception) {
    println("$e")
  }
}