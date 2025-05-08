// palindrom.scala

@main def PalindromChecker(): Unit = {
  print("Masukkan string: ")
  val input = scala.io.StdIn.readLine().toLowerCase.replaceAll("\\s", "")

  val isPalindrome = input == input.reverse

  if (isPalindrome)
    println("String tersebut adalah palindrom.")
  else
    println("String tersebut bukan palindrom.")
}
