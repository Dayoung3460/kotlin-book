package classStudy_part2

class CompanionObjectClass(var x: Int) {
  fun instanceFunction() {
    println("from instance function $x")
  }

  companion object {
    var classVariable: Int = 100
    const val CLASS_CONSTANT: Int = 200

    fun classFunc() {
      classVariable++
      println("class variable value: $classVariable")
      println("class constant value: $CLASS_CONSTANT")
    }
  }
}

class Product(val name: String, val price: Double, var discountRate: Double) {
  companion object {
    fun calculatePrice(product: Product): Double {
      return product.price - (product.price * product.discountRate)
    }

    fun calculateTotal(products: List<Product>): Double {
      var total = 0.0
      for(p in products)
        total += Product.calculatePrice(p)
      return total
    }
  }
}

fun main() {
  var c = CompanionObjectClass(100)
  c.instanceFunction()
  println(c.x)

  CompanionObjectClass.classFunc()
  println(CompanionObjectClass.classVariable)
  println(CompanionObjectClass.CLASS_CONSTANT)

  val p1 = Product("toy", 1000.0, 0.1)
  val p2 = Product("book", 5000.0, 0.0)
  println(Product.calculatePrice(p1))
  println(Product.calculateTotal(listOf(p1, p2)))

}
