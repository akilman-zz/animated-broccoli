import org.json4s.native.Serialization.{write => swrite}
import org.json4s.{NoTypeHints, native}

object JsonBits {

  case class Person(val name: String, val age: Int)

  def main(args: Array[String]): Unit = {

    implicit val formats = native.Serialization.formats(NoTypeHints)

    val me = new Person("Bob", 92)
    val stuff = swrite(me)
    println(stuff)
  }
}
