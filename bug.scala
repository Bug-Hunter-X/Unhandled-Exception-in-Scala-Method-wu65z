```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (x > 0) {
      return x + y 
    } else {
      throw new IllegalArgumentException("x must be positive") 
    }
  }
}

 object Main extends App {
  val obj = new MyClass(-1)
  try {
    println(obj.myMethod(5))
  } catch {
    case e: IllegalArgumentException => println("Caught exception: " + e.getMessage)
  }
}
```