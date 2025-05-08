// mahasiswa.scala

class Mahasiswa(val nama: String, val nim: String, val nilai: Int) {
  def getGrade(): String = {
    if (nilai >= 80) "A"
    else if (nilai >= 70) "B"
    else if (nilai >= 60) "C"
    else "D"
  }
}

@main def MahasiswaApp(): Unit = {
  // Membaca input data mahasiswa
  print("Masukkan nama mahasiswa: ")
  val nama = scala.io.StdIn.readLine()

  print("Masukkan NIM mahasiswa: ")
  val nim = scala.io.StdIn.readLine()

  print("Masukkan nilai mahasiswa: ")
  val nilai = scala.io.StdIn.readInt()

  // Membuat objek mahasiswa dan menampilkan grade
  val mahasiswa = new Mahasiswa(nama, nim, nilai)
  val grade = mahasiswa.getGrade()

  println(s"Mahasiswa ${mahasiswa.nama} (NIM: ${mahasiswa.nim}) memiliki grade: $grade")
}
