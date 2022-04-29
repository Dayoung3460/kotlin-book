package challenges.ch07

import javax.print.attribute.standard.PrinterInfo

enum class CardSuit {
  SPADE, DIAMOND, HEART, CLUB
}

class Card(val cardSuit: CardSuit, val cardNum: Int) {
  override fun toString(): String {
    var numToStr = when(cardNum) {
      1 -> "ACE"
      11 -> "Jack"
      12 -> "Queen"
      13 -> "King"
      else -> cardNum.toString()
    }
    return "$cardSuit $numToStr"
  }
}

class InvalidCardNumber(message: String = "wrong card number. should be 1 to 13"): Exception(message)

class CardWithException(val suit: CardSuit, var num: Int) {
  init {
    if(num !in 1 .. 13) {
      throw InvalidCardNumber()
    }
  }
}

fun main() {
  var card1 = Card(CardSuit.SPADE, 1)
  var card2 = Card(CardSuit.DIAMOND, 2)
  var card3 = Card(CardSuit.HEART, 3)
  var card4 = Card(CardSuit.CLUB, 4)

  println(card1)
  println(card2)
  println(card3)
  println(card4)

  var invalid = CardWithException(CardSuit.SPADE, 10)
}