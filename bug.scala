```scala
import scala.collection.mutable.ListBuffer

class MyClass {
  private val myList = new ListBuffer[Int]()

  def add(x: Int): Unit = {
    myList += x
    println(s"Added $x to the list")
  }

  def printList(): Unit = {
    println("Elements in the list:")
    myList.foreach(println)
  }

  def getSum(): Int = {
    var sum = 0
    myList.foreach(sum += _)
    sum
  }
}

 object Main extends App{
  val obj = new MyClass()
  obj.add(10)
  obj.add(20)
  obj.printList()
  println("Sum: " + obj.getSum())
 }
```