package com.atguigu.chapter01

//import scala.util.control.Breaks

object ForDemo01 {
  def main(args: Array[String]): Unit = {
/*    var a = 0
    val numList = List(1,2,3,4,5,6,7,8,9,10)

    val loop = new Breaks;
    loop.breakable{
      for (a <- numList){
        println("Value of a:" + a)
        if ( a == 4 ){
          loop.break
        }
      }
    }
    println("After the loop")*/

    var c = 0
    var b = 0
    for( c <- 1 to 3; b <- 1 to 3){
      println("Value of c:" + c)
      println("Value of b:" + b)
    }
  }
}
