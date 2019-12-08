package com.atguigu.chapter01

object Exercise02 {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 100
    val c = 6
    val m = b * b - 4 * a * c

    if(m > 0){
      val x = (-b + math.sqrt(m)) / 2 * a
      println( "x = " + x)
    }else{
      val x = (-b - math.sqrt(m)) / 2 * a
      println( "x = " + x)
    }
  }
}
