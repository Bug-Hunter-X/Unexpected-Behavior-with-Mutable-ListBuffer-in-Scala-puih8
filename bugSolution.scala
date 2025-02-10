```scala
import scala.collection.immutable.List

class MyClass {
  private var myList: List[Int] = Nil

  def add(x: Int): MyClass = {
    this.copy(myList = myList :+ x) 
  }

  def printList(): Unit = {
    println("Elements in the list:")
    myList.foreach(println)
  }

  def getSum(): Int = {
    myList.sum
  }

  def copy(myList: List[Int] = this.myList): MyClass = new MyClass { override private val myList = myList}
}

object Main extends App {
  var obj = new MyClass()
  obj = obj.add(10)
  obj = obj.add(20)
  obj.printList()
  println("Sum: " + obj.getSum())
}
```