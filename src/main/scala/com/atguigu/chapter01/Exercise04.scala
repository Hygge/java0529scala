package com.atguigu.chapter01

import scala.io.StdIn

object Exercise04 {
  def main(args: Array[String]): Unit = {
    println("成人、老人、儿童")
    println("请输入类别：")
    val leixing = StdIn.readLine()

    if (leixing == "成人"){
      println("票价60")
    }else if( leixing == "儿童"){
      println("半价30")
    }else if (leixing == "老人"){
      println("票价20")
    }
  }
}
