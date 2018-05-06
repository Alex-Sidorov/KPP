import org.scalatest._

class MainTest extends FlatSpec with Matchers{

  it should "Test one for first task(First answer) " in {
    val listOne = List("Alex","Tom")
    val listTwo = List("Bob","John")
    Main.answerFirstTaskOne(listOne,listTwo) should be(List("Alex","Bob","John","Tom"))
  }

  it should "Test two for first task(First answer) " in {
    val listOne = List()
    val listTwo = List()
    Main.answerFirstTaskOne(listOne,listTwo) should be(List())
  }

  it should "Test three for first task(First answer) " in {
    val listOne = List("Cun")
    val listTwo = List("Tom")
    Main.answerFirstTaskOne(listOne,listTwo) should be(List("Cun","Tom"))
  }

  it should "Test four for first task(First answer) " in {
    val listOne = List()
    val listTwo = List("Tom")
    Main.answerFirstTaskOne(listOne,listTwo) should be(List("Tom"))
  }

  it should "Test one for first task(Second answer) " in {
    val listOne = List("Alex","Tom")
    val listTwo = List("Bob","John")
    Main.answerSecondTaskOne(listOne,listTwo) should be(List("Alex","Bob","John","Tom"))
  }

  it should "Test two for first task(Second answer) " in {
    val listOne = List()
    val listTwo = List()
    Main.answerSecondTaskOne(listOne,listTwo) should be(List())
  }

  it should "Test three for first task(Second answer) " in {
    val listOne = List("Cun")
    val listTwo = List("Tom")
    Main.answerSecondTaskOne(listOne,listTwo) should be(List("Cun","Tom"))
  }

  it should "Test four for first task(Second answer) " in {
    val listOne = List()
    val listTwo = List("Tom")
    Main.answerSecondTaskOne(listOne,listTwo) should be(List("Tom"))
  }

  it should "Test one for second task" in{
    val list = List(1,5,8,9,1.1,8,100,0)
    Main.answerTaskTwo(list) should be(16.5125)
  }

  it should "Test two for second task" in{
    val list = List()
    Main.answerTaskTwo(list) should be(0)
  }

  it should "Test three for second task" in{
    val list = List(5.0)
    Main.answerTaskTwo(list) should be(5)
  }

  it should "Test four for second task" in{
    val list = List(-8.0)
    Main.answerTaskTwo(list) should be(-8)
  }

  it should "Test one for third task" in{
    val list = List(1,9,0,-1)
    Main.answerTaskThree(list) should be(List(1,729,0,-1))
  }

  it should "Test two for third task" in{
    val list = List()
    Main.answerTaskThree(list) should be(List())
  }

  it should "Test three for third task" in{
    val list = List(0)
    Main.answerTaskThree(list) should be(List(0))
  }

  it should "Test four for third task" in{
    val list = List(-1,-2,-3)
    Main.answerTaskThree(list) should be(List(-1,-8,-27))
  }

}
