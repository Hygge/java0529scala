package com.atguigu.chapter01

object WhileDemo01 {
  def main(args: Array[String]): Unit = {
    var a = 10
    while(a <= 20){
      println("Value of a=" + a)
      a = a + 1
    }
  }
}
