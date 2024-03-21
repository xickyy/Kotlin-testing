fun main () {
  try{
    val num: Int = "ABC".toInt()
    print(num)
  } catch (t: Throwable) {  //can specify the type of exception to catch in place of "Throwable"
    println("caught")
  } catch (t: ArithmeticException) {
    //can add as many catches with throwable error times as i want
    println("this will never be hit cause Throwable will catch everything")
  }
}
