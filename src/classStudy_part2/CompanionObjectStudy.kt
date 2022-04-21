package classStudy_part2

class CompanionObjectClass(var x: Int) {
  fun instanceFunction() {
    println("from instance function $x")
  }

  companion object {
    var classVariable: Int = 100
    // const val: 컴파일 시간에 결정되는 상수, 함수나 클래스의 생성자에 할당 될 수 없음. 오직 문자열이나 기본 자료형으로만 할당 / val은 런타임에 할당됨
    const val CLASS_CONSTANT: Int = 200

    fun classFunc() {
      classVariable++
      println("class variable value: $classVariable")
      println("class constant value: $CLASS_CONSTANT")
    }
  }
}

class Product(val name: String, val price: Double, var discountRate: Double) {
  // 멤버 구성. 클래스 내부에 정의됨. 클래스 이름만으로도 참조 접근가능. 클래스 내 한개까지만 쓸 수 있음.
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
