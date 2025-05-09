```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age

  def age_=(newAge: Int): Unit = {
    if (newAge >= 0) {
      _age = newAge
    } else {
      throw new IllegalArgumentException("Age cannot be negative")
    }
  }
}

 object Main extends App{
 val myObj = new MyClass("John")
 myObj.age = 30
 println(myObj.age)
 myObj.age = -5 // This will throw an exception
 println(myObj.age)
}
```