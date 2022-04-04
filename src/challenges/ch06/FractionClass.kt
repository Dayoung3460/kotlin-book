package challenges.ch06

class Fraction(var numerator: Int, var denominator: Int) {
  override fun toString(): String {
    return "${numerator}/${denominator}"
  }

  fun toDouble(): Double {
    return numerator.toDouble()/denominator
  }

  private fun lcm(a: Int, b: Int): Int {
    return (a * b) / gcd(a, b)
  }

  private fun gcd(a: Int, b: Int): Int {
    var gcd = 1
    for (i in 2..kotlin.math.min(a, b)) {
      if(a % i == 0 && b % i == 0) {
        gcd = i
      }
    }
    return gcd
  }

  infix fun add(f: Fraction) : Fraction {
    if(this.denominator == f.denominator) {
      return Fraction(this.numerator + f.numerator, this.denominator)
    } else {
      var lcm = lcm(this.denominator, f.denominator)

      return Fraction(this.numerator * (lcm / this.denominator) +
        f.numerator * (lcm / f.denominator),lcm)
    }
  }

  infix fun sub(f: Fraction) : Fraction {
    if(this.denominator == f.denominator) {
      return Fraction(this.numerator - f.numerator, this.denominator)
    } else {
      var lcm = lcm(this.denominator, f.denominator)

      return Fraction(this.numerator * (lcm / this.denominator) -
        f.numerator * (lcm / f.denominator), lcm)
    }
  }
}

fun main() {
  var f1 = Fraction(3, 4)
  var f2 = Fraction(1, 10)
//
//  println(f1)
//  println(f2)
//
  var f3 = Fraction(3, 4)
//  println(f3.toDouble())

  var f4 = f1.add(f2)
  var f5 = f1.sub(f2)

  println(f4)
  println(f5)
}