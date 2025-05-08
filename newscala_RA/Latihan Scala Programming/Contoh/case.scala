// case.scala

case class Rectangle(length: Double, breadth: Double) {
  def computeArea(): Double = length * breadth
}

@main def runCaseApp(): Unit = {
  val rect = Rectangle(6.0, 5.0)
  val area = rect.computeArea()
  println(s"Luas persegi panjang (case class): $area")
}
