interface Animal {
  val breed: String
  fun pet()
}

class Cat(
  val name: String,
  override val breed: String
): Animal {
  override fun pet() {
    println("Meow")
  }
}

class Dog(
  val name: String,
  override val breed: String
): Animal {
  override fun pet() {
    println("Woof")
  }
}

class Emu: Animal {
  override val breed: String = "Emu"

  override fun pet() {
  }
}

fun pet(animal: Animal) {
  println("Petting ${animal.breed}")
  animal.pet()
}

fun main() {
  pet(Cat("jake", "munchkin"))
  pet(Dog("cookie", "border collie"))

  val kitty = Cat("meek", "tabby")
  var doggy = Dog("barky", "Ugly Dog")

  pet(Emu())

  kitty.pet()
  println(doggy.breed)
}
