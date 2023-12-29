import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext

object SparkDemo {


//  def main(args : Array[String]): Unit ={
//    Logger.getLogger("org").setLevel(Level.ERROR)
//    val sc = new SparkContext("local[*]" , "SparkDemo")
//    val lines = sc.textFile("/Users/divanshukapoor/test.txt");
//    val words = lines.flatMap(line => line.split(' '))
//    val wordsKVRdd = words.map(x => (x,1))
//
//    val count = wordsKVRdd.reduceByKey((x,y) => x + y) //.map(x => (x._2,x._1)).sortByKey(false).map(x => (x._2, x._1)).take(10)
//
//    //top 10 words based on values
//
//    //val reversed_tupple= count.map(x => (x._2,x._1))
//    //val sorted_results = reversed_tupple.sortByKey(false).map(x => (x._2, x._1)).take(10)
//
//    val sorted_results = count.sortBy(x => x._2, false).take(10)
//
//
//    sorted_results.foreach(println)
//  }


  def squareIt(x: Int): Int = {

    x*x
  }

  def transformIt(x:Int, f: Int => Int): Int = {
    f(x)
  }

  def main(args: Array[String]): Unit = {
    println("hello there")

    var a: Int = 1

    println(a)


    //s interpolation f interpolation raw interpolation

    var name: String = "Div"

    println(s"hello $name")

    println(raw"hello how \n are you")


    var n1: String = "sumit"

    var n2: String = "sumit"

    println(n1==n2)

    val i: Int = 3

    i match {
      case 1 => println("one")

      case 2 => println("two")

      case _ => println("default")
    }


    for(x <- 1 to 10) {

      println(x)
    }


    println({
      val x = 10

      x + 20

      60

    })


    println(squareIt(3))

    println(transformIt(5, x => x*x*x))


    // Scala Collections

    var l = List(1,2,3,4)

    println(l(0))
//    10 :: l

    println(l.tail)


    var t = ("str" , 1, 2)

    println(t._1)


    val mp = Map(1 -> "str", 2 -> "tst")

    print(mp(1))

    var aa = 1 to 10

    def doubler(i: Int): Int = {
      i*2
    }


    println(aa.map((_*2)))


    def areaCircle = {val pi = 3.14; x:Int => pi*x*x}

    val area = areaCircle(10)

    println(area)

    val dd = 5

    println(dd.+(6))



    def genericSum(x: Int, y: Int, f:Int => Int) = {
      f(x) + f(y)
    }

    //partially applied functions
    val squareSum = genericSum(_: Int,_: Int, (x: Int) => x * x)


    println(squareSum(4,6))


    //currying

    def genericSum1(f:Int => Int) (x: Int, y: Int)  = {
      f(x) + f(y)
    }

    val squareSum1 = genericSum1((x: Int) => x * x)_

    println(squareSum1(4,6))


  }

}