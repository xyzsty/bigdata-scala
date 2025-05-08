// fib3.scala

class InvalidInputException(msg: String) extends Exception(msg)

@main def fibonacciInput(): Unit = {
  try {
    print("Masukkan bilangan antara 1 hingga 10: ")
    val input = scala.io.StdIn.readInt()

    if (input < 1 || input > 10)
      throw new InvalidInputException("Input harus antara 1 hingga 10!")

    println(s"Bilangan Fibonacci yang lebih besar dari $input dan kurang dari 30:")
    var a = 0
    var b = 1

    while (b < 30) {
      if (b > input) println(b)
      val temp = b
      b = a + b
      a = temp
    }

  } catch {
    case e: InvalidInputException => println(s"Kesalahan: ${e.getMessage}")
    case _: NumberFormatException => println("Input harus berupa angka bulat.")
    case e: Exception             => println(s"Terjadi kesalahan: ${e.getMessage}")
  }
}
