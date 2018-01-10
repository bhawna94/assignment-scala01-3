class Operations {

  def listOperation(List1: List[Int]): List[Int] = {
    val list2 = List1.map(x => x * 2)
    list2
  }

   /*def hof(shape: String,first: Int, second: Int, f:(Int,Int) => Int): String = {


     shape match {
       case "Rectangle" => hof(shape, first, second, f(a, b) => (a * b) )


     }
   }*/


  def listAddition(list1: List[Int], list2: List[Int]) = {
    if (list1.size == list2.size) {

      val list3 = for (i <- 0 until list1.length)
        yield list1(i) + list2(i)

      list3.toList
    }
  }



  def listCount(List1: List[Int]): Int = {
    val counter = 0
    val a = counting(List1, counter)
    return a

  }

  private def counting(list1: List[Int], counter: Int): Int = {
    list1 match {
      case head :: tail => counting(tail, counter + 1)
      case _ => counter

    }
  }


  def findElement(list1: List[Int], position: Int): Int = {
    list1.indexOf(position)
  }
}

object Operations extends App
{
  val l1 = 2
  val l2 = 4
  val l3 = 7
  val l4 = 9
  val l5 = 10
  val list1 = List(l1,l2,l3,l4)
  val list2 = List(l1,l2,l3,l5)
  val obj1 =new Operations
  val count = obj1.listCount(list1)
  println(s"$count")
  obj1.listOperation(list1)
  obj1.listAddition(list1,list2)

}
