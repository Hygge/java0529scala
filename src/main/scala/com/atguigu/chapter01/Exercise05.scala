package com.atguigu.chapter01

object Exercise05 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 100
    var count = 0
    var sum = 0
    for (i <- start to end){
      if(i % 9 == 0){
        count += 1
        sum += i
      }
    }
    printf("count=%d, sum=%d\n", count, sum)
  }
}
