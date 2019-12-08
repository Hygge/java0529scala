package com.atguigu.chapter01

object WhileDemo02 {
  def main(args: Array[String]): Unit = {
    var a = 10
    do{
      println("10niu" + a)
      a = a + 1

    }while( a < 15)
  }
}
