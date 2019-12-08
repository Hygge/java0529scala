package com.atguigu.chapter01

object IfDemo01 {
  def main(args: Array[String]): Unit = {
    var a = 19
    var b = 90
     if ((a + b ) > 50){
       println("Hello World!")
     }else{
       println("shabi")
     }
    val num1 = 10
    val num2 = 5
    val sum = num1 +num2
    if(sum % 3 == 0 && sum % 5 == 0){
      println("能被3整除又能被5整除 不成立~")
    }
    val year = readInt()
    if ((year % 4 == 0 && year % 100 ==0) || (year % 400 == 0)){
      println(s"${year} 是闰年。。。")
    }else{}
    println(s"${year} 不是闰年")
  }
}
