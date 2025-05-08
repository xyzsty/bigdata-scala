@main def main(): Unit = {
  // Membuat array untuk menyimpan 5 angka bulat
  val angka = new Array[Int](5)  // Specify type Int and size 5

  // Mengisi array dengan input dari keyboard
  for (i <- 0 until 5) {
    print(s"Masukkan angka ke-${i + 1}: ")
    angka(i) = scala.io.StdIn.readInt()
  }

  // Menghitung total dan rata-rata
  val total = angka.sum
  val rataRata = total.toDouble / angka.length

  // Menampilkan hasil
  println(f"Rata-rata dari angka yang dimasukkan adalah: $rataRata%.2f")
}