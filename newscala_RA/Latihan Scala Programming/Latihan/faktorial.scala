object FaktorialRekursif {
  def faktorial(n: Int): Long = {
    if (n == 0) 1
    else n * faktorial(n - 1)
  }

  def main(args: Array[String]): Unit = {
    print("Masukkan bilangan non-negatif: ")
    val input = scala.io.StdIn.readInt()
    
    if (input < 0) {
      println("Error: Masukkan bilangan non-negatif!")
    } else {
      val hasil = faktorial(input)
      println(s"Faktorial dari $input adalah: $hasil")
    }
  }
}