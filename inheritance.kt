open class Drone {
  open val look = "black and white"
  val type : String = "Drone"

  open fun setOff(){
    move(0.0, 10.0, 0.0)
  }

  open fun move(front: Double, up: Double, rotate: Double) {
    println("moving front:$front up:$up rotate:$rotate")
  }
}

class SuperheroDrone(): Drone() {
  override val look: String = "Superhero look"

  override fun move(front: Double, up: Double, rotate: Double) {
    println("moving fast front:$front up:$up rotate:$rotate")
  }

  override fun setOff() {
    move(0.0, 15.0, 0.0)
  }
}

fun main() {
  val regDrone = Drone()
  val drone: Drone = SuperheroDrone()
  drone.setOff()
  drone.move(10.0, 2.0, 12.0)
  regDrone.setOff()
  println(regDrone.type)
  println(drone.type)
}
