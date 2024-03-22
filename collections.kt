// collection datatypes are not mutable by default but do have mutable vairents
// for example val mutableList = mutableListOf("blah", "blah")



fun main() {
  var shoppingList = listOf(
    "tomatoes",
    "eggs",
    "3d Printer",
    "240sx"
  )

  println(shoppingList)
  println("------------")

  for(item in shoppingList) {
    print("$item, ")
  }

  println("| this list has ${shoppingList.size} items")

  val newList = shoppingList + "Dirtbike" + "fancy car"

  println(newList)
  println("240sx" in newList)

  var newMap = mapOf("ricky" to 28, "shelbi" to 26, "dj" to 29)
  for(person in newMap) {
    println("${person.key} is ${person.value} years old!")
  }
}
