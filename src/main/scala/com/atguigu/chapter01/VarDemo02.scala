package com.atguigu.chapter01


object VarDemo02 {
  def main(args: Array[String]): Unit = {
    //类型推导
    var num=10//这是num就是Int
    //方式1，可以利用idea的提示来证明，给出的提示
    //方式2，使用isInstanceOf[Int]来判断
    println(num.isInstanceOf[Int])
    //类型确定后，就不能修改，说明Scala是强数据类型语言（）
    //num=2.3 错误

    //声明/定义一个变量事，可以使用var或者val来修饰，var修饰的变量是可以改变，va;修饰的变量不可改

    var age=10//即age是可以改变的
    age=30 //ok
    val num2=30
    //num2=40 //val修饰的变量是不可以改变的
    //scala设计者为什么设计var和val
    //在实际编程，我们更多的需求是获取/创建一个对象后，读取该对象的属性，
    //或者是修改对象的属性值，但是我们很少去改变这个对象本身
    //这时，我们就可以使用val
    //因为val没有线程安全问题，因此效率高，Scala的设计者推荐我们val
    //如果需改变对象，则使用var

    var dog=new Dog
    dog.age=90
    dog.name="xiaoming"

  }
}

