package com.atguigu.chapter01
import scala.io.StdIn

object InputDemo01 {
  def main(args: Array[String]): Unit = {

    println("请输入姓名")
    val name = StdIn.readLine()
    println("请输入年龄：")
    val age = StdIn.readInt()
    println("请输入薪水")
    val sal = StdIn.readDouble()
    printf("用户的信息为name=%s age=%d sal=%.2f",name, age, sal)
  }
}
