package collectionStudy

class FruitsIterable: Iterable<String> {
  val fruits = listOf("Apple", "Banana", "Grape")

  override fun iterator(): Iterator<String> {
    return object: Iterator<String> {
      var idx = 0
      override fun hasNext() = idx < 3
      override fun next() = fruits[idx++]
    }
  }
}

class MyList<T>(vararg val args: T): Iterable<T> {
  private class MyListIterator<T2>(val args: Array<T2>): Iterator<T2> {
    var currentIdx = 0
    override fun hasNext(): Boolean {
      return currentIdx < args.size
    }

    override fun next(): T2 {
      val r = args[currentIdx]
      currentIdx++
      return r
    }
  }
  override fun iterator(): Iterator<T> {
    return MyListIterator(args)
  }
}

fun main() {
  var myList1 = MyList(1, 2, 3, 4, 5)
  for(item in myList1) {
    print("$item ")
  }
  println()

  var myList2 = MyList("Hello", "World", "Kotlin")
  for(item in myList2) {
    print("$item ")
  }

  println("---------------------------------------------------")

  val fruitsIterable = FruitsIterable()
  var iterator = fruitsIterable.iterator()
  while (true) {
    if(iterator.hasNext()) {
      val next = iterator.next()
      print("$next ")
    } else {
      break
    }
  }

  println()
  for(fruit in fruitsIterable) {
    print("$fruit ")
  }
  println()
  fruitsIterable.forEach{fruit -> print("$fruit ")}
  println()
}