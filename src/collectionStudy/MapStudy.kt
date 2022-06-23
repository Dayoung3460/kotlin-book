package collectionStudy

fun main() {
  var mutableMap = mutableMapOf("key" to 1, "key2" to 2)
  println(mutableMap)

  var emptyMutableMap = mutableMapOf<String, Int>()
  println(emptyMutableMap)

  var mutableMap2 = mutableMapOf("key1" to 1, "key2" to 2)
  mutableMap2.put("key3", 3)
  println(mutableMap2)

  mutableMap2.put("key1", 100)
  println(mutableMap2)

  var mutableMap3 = mutableMapOf("key" to 1, "key2" to 2)
  mutableMap3.remove("key2")
  println(mutableMap3)

  println()

  var mutableMap4 = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3)
  var valueFromKey3 = mutableMap4.get("key3")
  var valueFromKey3_ = mutableMap4["key3"]

  println(valueFromKey3)
  println(valueFromKey3_)

  println()

  var immutableMap = mapOf("key1" to 1, "key2" to 2)
  var valueFromKey1 = immutableMap["key1"]
  println(valueFromKey1)

  println()

  var empty = emptyMap<String, Int>()
  println(empty)

}
