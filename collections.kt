// collection datatypes are not mutable by default but do have mutable vairents
// for example val mutableList = mutableListOf("blah", "blah")

//Step  1
class Comment(
    val userId: Int,
    val message: String
)

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




       // Step  2
       val comments: List<Comment> = listOf(
        Comment(5241, "Nice code"),
        Comment(6624, "Like it"),
        Comment(5224, "What’s going on?"),
        Comment(9001, "Check out my website"),
        Comment(8818, "Hello everyone :)")
    )

    // Step 3
    val blockedUserIds: Set<Int> = setOf(5224, 9001)

    // Step 4
        val userIdToRelation: Map<Int, String> = mapOf(
        5241 to "friend",
        6624 to "close friend"
    )

    // Step 5
    for (comment in comments) {

        // Step 6
        if (comment.userId !in blockedUserIds) {

            val relation = userIdToRelation[comment.userId] ?: "unknown"

            // Step 7
            println("Comment ${comment.message} from $relation")
        }
    }
}
