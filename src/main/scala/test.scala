object test {
//  def main(args: Array[String]): Unit = {
  ////    lazy val output = {
  ////      println("hello");
  ////      1
  ////    }
  ////    println("Learning Scala")
  ////    println(output)
  ////  }

  class Person(name: String, age: Int) {

    //instance level functionality
    val x = 20

    def ageDoubler: Int = age * 2


    def salaryDoubler(salary: Int) :Int = salary * 2


  }

  object Person {

    //class level functionality same like java
    val n_eyes = 2
  }

  //companion design patterns


  def main(args: Array[String]): Unit = {
    val p = new Person("sumit", 30)


    println(p. x)

    val p2 = new Person("sumit11", 30)

    println(p2. x)

    println(p.x == p2.x)

    //class level functionaly object comes into picture

    println(Person.n_eyes)

  }


//  class Animal {
//    def canFly = true
//
//  }


//  class Lion extends Animal {
//
//  }
//
//
//  abstract class Person {
//    def isVeg
//  }
//
//  class Div extends Person {
//    def isVeg: Unit = {
//      println("yes")
//    }
//  }


  //can not have constructor parameter

//  trait Carnivore {
//    def preferredMeal
//  }
//
//  trait Coldvlooded
//
//
//  class Crocodile extends Animal with Carnivore with Coldvlooded {
//    def preferredMeal = println("sead")
//  }


//class parameter are automatically available as fields [doing less get more]
  //case classes have sensible toString

  case class Person1(name: String, age: Int)


  val per1 = new Person1("div", 34)

  println(per1.name)
  println(per1.toString)

  // per1 == per2  already implemented hashcode and equals method

  //case class already create companion objects

  //using apply method Person.apply("","")

  // have a handy method copy already available

  //case classes are serialazable

  //by default things are immutable

}
