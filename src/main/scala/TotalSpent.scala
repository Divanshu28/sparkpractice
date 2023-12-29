import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext

object TotalSpent {


  def main(args : Array[String]): Unit ={
    Logger.getLogger("org").setLevel(Level.ERROR)
    val sc = new SparkContext("local[*]" , "SparkDemo")

    val input = sc.textFile("/Users/divanshukapoor/downloads/customerorders-201008-180523.csv")



    val mapped_input = input.map(x => (x.split(',')(0), x.split(',')(2).toFloat))

    val totalbycustomer = mapped_input.reduceByKey((x,y) => x+y)

    val sorted = totalbycustomer.sortBy(x => x._2, false).take(5)



    sorted.foreach(println)

  }

}