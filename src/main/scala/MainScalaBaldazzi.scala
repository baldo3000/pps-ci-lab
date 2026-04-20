/**
 * This main function creates a new pair and prints its values, then prints a "Hello Scala!"
 */
@main
def main(): Unit =
  val pair = Pair(1, 2)
  println(s"Pair(${pair.x}, ${pair.y})")
  println("Hello Scala!")