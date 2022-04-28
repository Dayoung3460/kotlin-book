package exceptionStudy

fun main() {
  try {
    println("Enter num")
    var arr = arrayListOf(1, 2, 3, 4, 5)
    var num = readLine()!!.toInt()
    var div = (10 / num)

    var arrVal = arr[num]
    println("10 / $num = $div")
    println("arr[$num]: $arrVal")
  } catch (e: java.lang.Exception) {
    println("problem occur: ${e.message}")
  }
//  catch(e: ArithmeticException) {
//    println("calculation wrong")
//  } catch (e: Exception) {
//    println("problem occur: ${e.message}")
//  }
}