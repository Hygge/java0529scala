package com.atguigu.chapter01

object Testprint {
  def main(args: Array[String]): Unit = {
    var name : String="tom"
    var sal : Double=1.2
    println("hello"+sal+name)

    //使用格式化方式的printf
    printf("name=%s sal=%f\n",name,sal)
    //使用￥引用的方式，输出变量，类似php
    println(s"第三种方式name=$name sal=${sal+1}")
  }
}
