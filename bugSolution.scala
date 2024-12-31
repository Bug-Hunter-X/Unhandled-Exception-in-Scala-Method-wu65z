```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (x > 0) {
      x + y 
    } else {
      //Handle Exception in more graceful way
      println("Error: x must be positive. Returning 0")
      0 
    }
  }
}

object Main extends App {
  val obj = new MyClass(-1)
  println(obj.myMethod(5))  //Output: Error: x must be positive. Returning 0
  val obj2 = new MyClass(1)
  println(obj2.myMethod(5)) // Output: 6
}
```