// data class Student(val id: Int, val name: String, val grade: Double)

// class StudentDatabase(private val students: List<Student>) {
//     fun getStudentById(id: Int): Student? {
//         return students.find { it.id == id }
//     }

//     fun searchInStudents(name: String): Student? {
//         return students.find { it.name == name }
//     }
// }

// fun main() {
//     val studentList = listOf(
//         Student(1, "John", 85.0),
//         Student(2, "Alice", 92.5),
//         Student(3, "Bob", 78.3),
//         Student(4, "Emily", 88.9)
//     )

//     val database = StudentDatabase(studentList)

//     print("Enter student ID to search: ")
//     val searchId = readLine()?.toIntOrNull()

//     if (searchId != null) {
//         val studentById = database.getStudentById(searchId)
//         if (studentById != null) {
//             println("Student found: ${studentById.name}, Grade: ${studentById.grade}")
//         } else {
//             println("Student not found.")
//         }
//     } else {
//         println("Invalid input for student ID.")
//     }

//     print("Enter student name to search: ")
//     val searchName = readLine()

//     if (!searchName.isNullOrBlank()) {
//         val studentByName = database.searchInStudents(searchName)
//         if (studentByName != null) {
//             println("Student found: ${studentByName.name}, Grade: ${studentByName.grade}")
//         } else {
//             println("Student not found.")
//         }
//     } else {
//         println("Invalid input for student name.")
//     }
// }


//step 1
data class Student(val fullName: String, var id: Int,var grade:Double)

val students = listOf<Student>(
    Student("John", 223,140.0),
    Student("Mark", 548,120.0),
    Student("Natali", 342,150.0),
    Student("Sara", 781,130.0)
)


fun main() {
//    step 4
    println("Please, Enter the student's ID")
    val id = readln().toInt()
    println( getStudentById(id))
    println("Please, Enter the student's name")
    val name= readln()
    println(searchInStudents(name)?:"the student is not found")
}
//step 2
fun getStudentById(id:Int):Student{
  return  students.find { it.id==id }!!
}
//step 3
fun searchInStudents(name:String):Student?{
    return students.find { it.fullName.lowercase()==name.lowercase()}
}
