package collectionStudy

import kotlin.math.floor

data class Person(var name: String, var gender: String, var age: Int)
data class Account(val id: String, var person: Person)
data class Product(var name: String, var price: Double, var discountRate: Double)

var personList = listOf(
  Person("kim", "male", 25),
  Person("lee", "female", 30),
  Person("park", "male", 35),
  Person("yoon", "female", 28),
  Person("kimha", "female", 18),
)

var accountList = listOf(
  Account("chulsoo", Person("kim", "male", 25)),
  Account("hee0", Person("lee", "female", 30)),
  Account("ho_park", Person("park", "male", 35)),
  Account("suyoung1004", Person("yoon", "female", 28)),
  Account("khana", Person("kimha", "female", 18)),
)

var productList = listOf(
  Product("ramen", 500.0, 0.3),
  Product("donut", 800.0, 0.0),
  Product("drink", 1300.0, 0.1),
  Product("better drink", 1900.0, 0.2),
  Product("egg", 3500.0, 0.0),
)

fun main() {
  personList.forEach {
    println(it.name)
  }

  productList.forEachIndexed {
    idx, product ->
    println("$idx: $product")
  }

  println()

  var discountProducts = productList.map { it.name }
  println(discountProducts)

  var discountPrices = productList.map{ it.price - (it.discountRate * it.price) }
  println(discountPrices)

  var discountProductNameAndPrices = productList.map{ Pair(it.name, it.price - (it.discountRate * it.price)) }
  println(discountProductNameAndPrices)

  println()

  var keys = mapOf("key1" to 1, "key2" to 2).map { it.key }
  println(keys)

  println()

  var filtered1 = personList.filter {
    it.age in 20 .. 29
  }
  println(filtered1)

  var filtered2 = personList.filter {
    it.name.startsWith("kim")
  }
  println(filtered2)

  var filtered3 = personList.filter {
    it.gender == "female"
  }
  println(filtered3)

  var noDiscountProducts = productList.filter {
    it.discountRate == 0.0
  }
  println(noDiscountProducts)

  println()

  var oneToTen = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  var partitioned = oneToTen.partition { (it%2) == 0 }
  println("partitioned.first ${partitioned.first}")
  println("partitioned.second ${partitioned.second}")

  println()

  var oneToTen2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  var reduced1 = oneToTen2.reduce {
    acc,  num ->
    println("acc: $acc, num: $num")
    acc + num
  }
  println("reduced1: $reduced1")

  println()

  var strings = listOf("Hello", "World", "Kotlin")
  var reduced2 = strings.reduce{ acc, str -> "$acc, $str" }
  println("reduced: $reduced2")
  println("${strings.joinToString(",")}")

  println()

  var reduced3 = strings.reduceRight{ str, acc -> "$acc,$str" }
  println("reduced3: $reduced3")

  println()
  var personAgeOver30 = personList.count{ it.age >=30 }
  println("personAgeOver30: $personAgeOver30")

  println()

  var discountProductsWithPrice = discountProducts.zip(discountPrices)
  println(discountProductsWithPrice)

  println()

  var discountProductsWithPrice2 = discountProducts.zip(discountPrices) {
    prod, price ->
    mapOf("name" to prod, "price" to price)
  }
  println(discountProductsWithPrice2)

  println()

  var mapByIdKey = accountList.associate{ it.id to it.person }
  println(mapByIdKey)

  var mapByGenderKey = accountList.associate{ it.person.gender to it.person }
  println(mapByGenderKey)

  println()

  var grouped = productList.groupBy {
    floor(it.price / 1000)
  }
  println(grouped)

  println()

  var distinct1 = listOf(1, 2, 1, 2, 3, 3, ).distinct()
  var distinct2 = listOf('a', 'b', 'c', 'a', 'c').distinct()
  println(distinct1)
  println(distinct2)

}