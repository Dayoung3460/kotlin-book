package classStudy_part2

import java.math.BigDecimal
import kotlin.math.*

fun main() {
  println(PI)

  val minusTen = -10
  println(abs(minusTen))
  println(minusTen.absoluteValue)

  println(round(0.5))
  println(round(0.51))

  println("-------------------")

  val base = 2.0
  println(base.pow(3))
  println(sqrt(4.0))
  println(sqrt(2.0))

  println("-------------------")

  println(0.03 - 0.02)
  println(BigDecimal("0.03") - BigDecimal("0.02"))
  var sum = 0.0
  for(i in 0 .. 9999) {
    sum += 0.0001
  }
  println(sum)
  var sumBd = BigDecimal("0.0")
  for(i in 0 .. 9999) {
    sumBd += BigDecimal("0.0001")
  }
  println(sumBd)
}