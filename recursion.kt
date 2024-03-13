fun main() {
  fun factorial(number:Int): Int {
    if (number <= 1) {
      return 1
    }
    println(number)
    return factorial(number - 1) * number
  }

  println(factorial(5))
}
