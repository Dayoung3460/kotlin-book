package challenges.ch07

sealed class Quiz(val question: String)
enum class AnswerType{ O, X }

class OXQuiz(question: String, val answer: AnswerType): Quiz(question)

class MultiChoiceQuiz(question: String, val answer: String, val choices: List<String>): Quiz(question)

class ShortAnswerQuiz(question: String, val answer: String, val alternatives: List<String>?, val sanitize: (String) -> String = { it.trim() }): Quiz(question)

fun main() {
  val quizzes = mutableListOf<Quiz>()

  quizzes.add(OXQuiz("The capital city of South Korea is Seoul", AnswerType.O))
  quizzes.add(OXQuiz("The capital city of USA is New York", AnswerType.X))
  quizzes.add(MultiChoiceQuiz("Where is the capital city of South Korea?", "Seoul", listOf<String>("Seoul", "Deajeon", "Deagu", "Busan")))
  quizzes.add(ShortAnswerQuiz("What is the programming language based on JVM by JetBrains?", "Kotlin", listOf<String>("kotlin", "ÄÚÆ²¸°")))

  var answerCount = 0
  for((quizIdx, q) in quizzes.withIndex()) {
    println("${quizIdx + 1}. ${q.question}")
    when(q) {
      is OXQuiz -> {
        print("> ")
        var answer = readLine()!!
        var correct = (answer.toLowerCase() == "o" && q.answer == AnswerType.O || answer.toLowerCase() == "x" && q.answer == AnswerType.X)
        if(correct) {
          answerCount++
          println("Correct")
        } else {
          println("Wrong")
        }
      }
      is MultiChoiceQuiz -> {
        for((idx, c) in q.choices.withIndex()) {
          println("${idx + 1}. ${c}")
        }
        print("> ")

        var answer = readLine()!!
        var selected = answer.toInt()
        if(selected == (q.choices.indexOf(q.answer) + 1)) {
          answerCount++
          println("Correct")
        } else {
          println("Wrong")
        }
      }

      is ShortAnswerQuiz -> {
        print("> ")
        var answer = q.sanitize(readLine()!!)
        if(answer == q.answer || answer in (q.alternatives?: listOf())) {
          answerCount++
          println("Correct")
        } else {
          println("Wrong")
        }
      }
    }
    println()
  }
  println("\nCorrect answer: ${answerCount} / Total: ${quizzes.size}")


}
