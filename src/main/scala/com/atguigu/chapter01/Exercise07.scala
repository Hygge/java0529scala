package com.atguigu.chapter01

import scala.io.StdIn

object Exercise07 {
  def main(args: Array[String]): Unit = {
    val classNum = 3
    val stuNum = 5
    var score = 0.0
    var classScore = 0.0
    var totalScore = 0.0
    var passNum = 0
    for (i <- 1 to classNum){
      classScore = 0.0
      for (j <- 1 to stuNum){
        score = StdIn.readDouble()
        if(score >= 60){
          passNum += 1
        }
        classScore += score
      }
      totalScore += classScore
      printf("第%d班级的平均分为%.2f\n", i, classScore)
    }
  }
}
