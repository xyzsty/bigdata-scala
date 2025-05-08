// diff.scala

object DiffScala {
  def main(args: Array[String]): Unit = {
    print("Masukkan bilangan pertama: ")
    val a = scala.io.StdIn.readInt()

    print("Masukkan bilangan kedua: ")
    val b = scala.io.StdIn.readInt()

    val selisih = (a - b).abs
    println(s"Selisih antara $a dan $b adalah: $selisih")
  }
}
