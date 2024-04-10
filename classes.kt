class Employee(
  val name: String,
  var position: String
) {
  var label: String = "Label - $name ($position)"
  fun fire() {
    println("$name, you're Fired!");
    this.position = "Fired"
  }
}

fun main() {
  val employee1 = Employee(name = "Alex", position = "Manager")
  val employee2 = Employee("bob", "Waiter")

  println(employee1.position)
  // employee1.position = "Fired!"
  employee1.fire()
  println(employee1.position)
  println(employee2.label)
//  employee2.label = "New Label"
//  println(employee2.label)
//

}
