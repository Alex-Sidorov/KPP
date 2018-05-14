/**
  * This is main object with all function for all tasks.
  * @author Alex Sidorov
  * @version 1.0
  * @since 2018-04-28
  */
object Main {
  /**
    *This is main method for start application.
    *@param args This is the default parameter.
    */
  def main(args: Array[String]): Unit = {

    println("First task:")

    val listOneForTaskOne = List("Alex","Cun","Egor","Marta")
    println("One list:" + listOneForTaskOne)
    val listTwoForTaskOne = List("Bob","Don","Kris","Oliver")
    println("Two list:" + listTwoForTaskOne)

    println("Result first task(First answer):" + answerFirstTaskOne(listOneForTaskOne,listTwoForTaskOne))
    println("Result first task(Second answer):" + answerSecondTaskOne(listOneForTaskOne,listTwoForTaskOne))

    println("\nSecond task:")

    val listForTaskTwo = List(1.0,2.0,3.0,4.0,5.0,6.0)
    println("Our list:" + listForTaskTwo)
    println("Result second task:" + answerTaskTwo(listForTaskTwo))

    println("\nThird task:")

    val listForTaskThree = List(1,2,3,4,5)
    println("Our list:" + listForTaskThree)
    println("Result third task:" + answerTaskThree(listForTaskThree))
  }

  /**
    * The method is for solution first task.
    * @param listOne This is first input list.
    * @param listTwo This is second input list.
    * @return This is output list.
    */
  def answerFirstTaskOne(listOne: List[String],listTwo: List[String]):List[String] = {
    (listOne ::: listTwo).sorted
  }

  
  def answerSecondTaskOne(listOne: List[String],listTwo: List[String]):List[String] = {

    def returnResult(result:List[String],listOne:List[String],listTwo:List[String],indexOne:Int,indexTwo:Int):List[String]={
      if(listOne.size==indexOne){
        val endList = listTwo.drop(indexTwo)
        result:::endList
      }
      else{
        val endList = listOne.drop(indexOne)
        result:::endList
      }
    }
    def changeResult(listOne:List[String],listTwo:List[String],indexOne:Int,indexTwo:Int)={
      if(listOne(indexOne)<=listTwo(indexTwo)){
        (listOne(indexOne),indexOne+1,indexTwo)
      }
      else{
        (listTwo(indexTwo),indexOne,indexTwo+1)
      }
    }
    def loop(result:List[String],listOne:List[String],listTwo:List[String],indexOne:Int,indexTwo:Int):List[String]={
      if(listOne.size==indexOne || listTwo.size==indexTwo){
       returnResult(result,listOne,listTwo,indexOne,indexTwo)
      }
      else{
        val tuple = changeResult(listOne,listTwo,indexOne,indexTwo)
        loop(result:+tuple._1,listOne,listTwo,tuple._2,tuple._3)
      }
    }
    loop(List(),listOne,listTwo,0,0)
  }

  /**
    * The method is for solution second task.
    * @param list This is input list.
    * @return This is result.
    */
  def answerTaskTwo(list: List[Double]):Double={
    if(list.nonEmpty){
      list.foldLeft(0.0)((acc:Double,value:Double)=> acc + value)/list.size
    }
    else {
      0.0
    }
  }

  /**
    * The method is for solution third task.
    * @param list his is input list.
    * @return This is output list.
    */
  def answerTaskThree(list:List[Int]):List[Int]={
    list.map((value:Int)=>value*value*value)
  }

}