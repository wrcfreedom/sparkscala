package scala

class test1 {

  def main(args: Array[String]): Unit = {


    val array = Array[Int](2, 4, 6, 8, 9)

    val y = array map ((x: Int) => x * 2)


    println(y.toBuffer)
  }
}