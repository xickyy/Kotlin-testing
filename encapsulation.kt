

class BankAccount {
  private var balance = 0.0

  //private means i can only use it within the class
  //protected meand i can use it within the class and in a subclass

  fun deposit(amount:Double) {
    //...file
    balance += amount
  }

  fun withdraw(amount:Double) {
    //...file
    balance -= amount
  }
}


fun main() {
  val account = BankAccount()

  account.deposit(1_000.0)
  account.withdraw(69.0)
  // println(account.balance) ----wont run because balance is private
}
