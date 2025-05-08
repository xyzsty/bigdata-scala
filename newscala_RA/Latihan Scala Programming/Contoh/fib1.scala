// fib1.scala

@main def fibonacciFor(): Unit = {
  var a = 0
  var b = 1

  for (_ <- 1 to 20 if a < 40) {
    println(a)
    val temp = a
    a = b
    b = temp + b
  }
}
