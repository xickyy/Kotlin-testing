data class FullName(
        val name: String,
        val surname: String
    )

    fun main() {
        val name = FullName("Marie", "Sklodowska")
        val newName = name.copy(surname = "Sklodowska-Curie")
        println(newName)
    } 
