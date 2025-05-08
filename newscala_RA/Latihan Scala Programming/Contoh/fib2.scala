// fib2.scala

@main def fibonacciWhile(): Unit = {
  var a = 0
  var b = 1

  while (a < 40) {
    println(a)
    val temp = a
    a = b
    b = temp + b
  }
}
