class User(
  val name: String?
) {
  fun flip() {
    if(this.name != null) {
      println("${this.name} just did a backflip!")
    } else {
      println("no one did any flips")
    }
  }
}

fun processUser(user: User?): User? {
  return user
}

fun main() {
  //adding a question mark after ther variable type allows for a value to be null
  var name: String? = null
  println(name)

  val rickyIsTheCoolest: Boolean = true

  if(rickyIsTheCoolest) {
    name = "Ricky"
  }
  println("$name is the coolest!")

  val user: User = User("ricky")
  user.flip()

  var user2: User? = null

  println(processUser(user2))

  val user3: User = User(name = null)
  user3.flip()

  println(user3?.name)
  // add a questionmark befroe usting the dot property tro make sure the value to let left of the dot is not null, for example "user3?.name" will only work if user3 is not null
}
