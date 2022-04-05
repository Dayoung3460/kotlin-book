package classStudy_part2

sealed class SealedParent {
  abstract fun abstractMethod()
}

class Child1 : SealedParent() {
  override fun abstractMethod() = println("from child1")
}

class Child2 : SealedParent() {
  override fun abstractMethod() = println("from child2")
}

class Child3 : SealedParent() {
  override fun abstractMethod() = println("from child3")
}

sealed class Quiz(val question: String)
enum class AnswerType {O, X}
class OXQuix(question: String, val answer: AnswerType): Quiz(question)
class MultiChoiceQuiz(question: String, val answer: String, val choices: List<String>): Quiz(question)
class ShortAnswerQuiz(question: String, val answer: String, val alternatives: List<String>?, val sanitize: (String) -> String = {it.trim()}): Quiz(question)


fun main() {
  val child1 = Child1()
  val child2 = Child2()
  val child3 = Child3()

  val parent: SealedParent = child1
  val childType1 = when(parent) {
    is Child1 -> 1
    is Child2 -> 2
    is Child3 -> 3
  }
  val childType2 = when(parent) {
    is Child1 -> 1
    else -> 2
  }
  println("----------------------")
  val quizzes = mutableListOf<Quiz>()
  quizzes.add(OXQuix("South Korea's capital is Seoul", AnswerType.O))
  quizzes.add(OXQuix("USA's capital is NY", AnswerType.X))
  quizzes.add(MultiChoiceQuiz("Where's korea's capital?", "Seoul", listOf("Seoul", "Daejeon", "Deagu", "Busan")))
  quizzes.add(ShortAnswerQuiz("What is 사과 in Eng?", "apple", null){it.trim().toLowerCase()})
  quizzes.add(ShortAnswerQuiz("What is JVM based programming language JetBrains made", "Kotlin", listOf("코틀린", "kotlin")))

  for(q in quizzes) {
    var question: String = q.question
    var answer: String

    var type = when(q) {
      is OXQuix -> {
        answer = when(q.answer) {
          AnswerType.O -> "O"
          AnswerType.X -> "X"
        }
        "OX quiz"
      }
      is MultiChoiceQuiz -> {
        answer = q.answer
        "N choices quiz"
      }
      is ShortAnswerQuiz -> {
        answer = q.answer
        "short Answer quiz"
      }
    }
    println("quiz type: $type\nquestion: ${q.question}\nanswer: $answer")
  }



}