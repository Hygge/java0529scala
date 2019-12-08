package com.atguigu.chapter01

object Exercise01 {
  def main(args: Array[String]): Unit = {
    /*
    假如还有97天放假，问：xx个星期零几天
     */
    val days = 97
    printf("统计结果是%d个星期零#d天\n",days/7, days % 7)

    /*
    定义一个变量保存华氏温度，华氏温度转换摄氏度的公式为：5/9*（华氏温度-100），
    求出华氏温度对应的摄氏温度
     */
    val huashi = 232.5
    val sheshi = 5.0 / 9 * (huashi - 100)
    println("对应的摄氏温度"+sheshi.formatted("%.2f C"))
  }
}
