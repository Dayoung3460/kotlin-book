package iostudy

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

data class Person(var name: String, var age: Int): java.io.Serializable

fun main() {
  val personFile = File("persons.bin")
  personFile.createNewFile()

  val p1 = Person("Kim", 20)
  val p2 = Person("Lee", 20)

  var oos = ObjectOutputStream(FileOutputStream(personFile))

  oos.writeObject(p1)
  oos.writeObject(p2)

  oos.writeInt(100)
  oos.writeDouble(1.234)
  oos.writeBoolean(true)
  oos.writeUTF("Hello")

  oos.flush()
  oos.close()

  val ois = ObjectInputStream(FileInputStream(personFile))
  val p1FromFile = ois.readObject() as Person
  val p2FromFile = ois.readObject() as Person

  val intFromFile = ois.readInt()
  val doubleFromFile = ois.readDouble()
  val booleanFromFile = ois.readBoolean()
  val stringFromFile = ois.readUTF()

  ois.close()

  println(p1FromFile)
  println(p2FromFile)
  println(intFromFile)
  println(doubleFromFile)
  println(booleanFromFile)
  println(stringFromFile)
}

