package com.atguigu.chapter01
import scala.io.StdIn

object IfelseDemo02 {
  def main(args: Array[String]): Unit = {
    /*
    岳鹏参加Scala考试，
    成绩为100分时，奖励50
    成绩为（80~90）时，奖励10
    当成绩【60，80】时，挨揍
     */
    println("请输入成绩：")
    val score = StdIn.readDouble()
    if (score == 100){
      println("成绩100，奖励50")
    }else if(score > 80 && score <= 99){
      println("成绩良好，奖励10")
    }else if(score >= 60 && score <=80){
      println("奖励挨揍！")
    }
  }
}
