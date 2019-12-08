package com.atguigu.chapter01

object TypeDemo03 {
  def main(args: Array[String]): Unit = {
    println("long的最大值" + Long.MaxValue + "~"+ Long.MinValue)

    var i = 10 //i Int
    var j= 101 //j long
    var e = 92233722 //说超过Int
    var num1:Float = 2.31532543153f
    var num2:Double = 3.341325432
    println("num1=" + num1 + "num2=" + num2)
  }
}
