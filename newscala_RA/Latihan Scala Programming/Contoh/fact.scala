// fact.scala

def factorial(n: Int): BigInt = {
  if (n == 0) 1
  else n * factorial(n - 1)
}

@main def faktorialApp(): Unit = {
  print("Masukkan bilangan non-negatif: ")
  val input = scala.io.StdIn.readInt()

  if (input < 0)
    println("Bilangan harus >= 0.")
  else
    println(s"Faktorial dari $input adalah ${factorial(input)}")
}
