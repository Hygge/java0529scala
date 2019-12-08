package com.atguigu.chapter01

import scala.io.StdIn

object Exercise06 {
  def main(args: Array[String]): Unit = {
   /* val z = new Array[Double](5)
    val i = 1
    val sumClass = 5
    var totalScore = 0
    val a = 1
    for (a <- 1 to 3) {
      for (i <- 1 to 5){
        val z = StdIn.readDouble()
        totalScore += z
      }
    }*/
    val classNum = 3
    val stuNum = 5
    var score = 0.0  //分数
    var classScore = 0.0  //班级分数
    var totalScore = 0.0 //总分数
    for( i <- 1 to classNum){
      //先将classScore 清零
      classScore = 0.0
      for (j <- 1 to stuNum){
        printf("请输入第%d班的第%d个学生的成绩\n",i,j)
        score = StdIn.readDouble()
        classScore += score
        print(classScore)
      }
      //累计 totalScore
      var average = classScore/stuNum
      totalScore += classNum
      printf("第%d班级的平均分为%.2f\n", i, average)
    }
    printf("所有班级的平均分为%.2f",totalScore/(stuNum*classNum))
  }
}
