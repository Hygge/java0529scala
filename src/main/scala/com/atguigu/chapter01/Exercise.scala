package com.atguigu.chapter01

import scala.io.StdIn

object Exercise {
  def main(args: Array[String]): Unit = {
    println("请输入运动员的成绩")
    val speed = StdIn.readDouble()
    if(speed <= 8){
      println("请输入你的姓名：")
      val gender = StdIn.readLine()
      if (gender == "男"){
        println("进入男子组")
      }else{
        println("进入女子组")
      }
    }else{
      println("你已被淘汰！")
    }
  }
}
