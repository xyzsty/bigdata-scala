// print.scala

@main def printPerHuruf(): Unit =
  print("Masukkan sebuah string: ")
  val input = scala.io.StdIn.readLine()

  for (c <- input) {
    println(c)
  }
