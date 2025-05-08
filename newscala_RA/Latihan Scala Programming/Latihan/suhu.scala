// suhu.scala

@main def konversiSuhu(): Unit = {
  print("Masukkan suhu dalam Celsius: ")
  val celsius = scala.io.StdIn.readDouble()
  val fahrenheit = (celsius * 9.0 / 5.0) + 32
  println(f"Suhu dalam Fahrenheit: $fahrenheit%.2f °F")
}
