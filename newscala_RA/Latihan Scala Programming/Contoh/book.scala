// book.scala

class Price(val currencyName: String, val priceValue: Double)

class Book(val name: String, val price: Price, val quantity: Int) {
  def totalPrice(): Double = price.priceValue * quantity
}

@main def runBookApp(): Unit = {
  val price = new Price("IDR", 49999)
  val book = new Book("Pemrograman Scala", price, 3)

  println(s"Total harga untuk ${book.quantity} buku '${book.name}': ${price.currencyName} ${book.totalPrice()}")
}
