package com.atguigu.chapter01

object ForDemo02 {
  def main(args: Array[String]): Unit = {
    var a= 0
    val numList = List(1,2,3,4,5,6,7,8,9,10)

    var retVal = for{
      a <- numList
      if a != 3
      if a < 5
    }yield a

    for ( a <- retVal){
      println("Value of a:" + a)
    }
  }
}
