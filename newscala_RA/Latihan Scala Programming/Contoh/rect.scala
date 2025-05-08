// rect.scala

class Rectangle(var length: Double, var breadth: Double) {
  var area: Double = 0.0

  def computeArea(): Unit = {
    area = length * breadth
  }
}

@main def RectApplication(): Unit = {
  val rect = new Rectangle(5.0, 4.0)
  rect.computeArea()
  println(s"Luas persegi panjang: ${rect.area}")
}
