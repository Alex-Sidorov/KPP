import scala.collection.mutable
import scala.annotation.tailrec
/**
  * This is main object with all function for all tasks.
  * @author Alex Sidorov
  * @version 1.0
  * @since 2018-04-16
  */
object Main {
  /**
    *This is main method for start application.
    *@param args This is the default parameter.
    */
  def main(args: Array[String]): Unit = {
    
    val listForOneTask = {
      mutable.MutableList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    }
    println("First task:")

    println("createNewListFilter:")
    println("Our list:" + listForOneTask)
    println("Result list:" +createNewListFilter(listForOneTask))

    println("createNewListRec:")
    println("Our list:" +listForOneTask)
    println("Result list:" +createNewListRec(listForOneTask))
    
    val listForTwoTask = mutable.MutableList(0, 1, 1, 0)
    println("\nSecond task:")

    println("findLocalExtremumRec:")
    println("Our list:" + listForTwoTask)
    println("Result list:" + findLocalExtremumRec(listForTwoTask))

    println("findLocalExtremumLoop:")
    println("Our list:" + listForTwoTask)
    println("Result list:" + findLocalExtremumLoop(listForTwoTask))
  }
  /**
    * The method is for solution first task with tail recursion.
    * @param oldList This is input list.
    * @return This is output list.
    */
  def createNewListRec(oldList: mutable.MutableList[Int]): mutable.MutableList[Int] = {
    def checksValueForAdd(newList: mutable.MutableList[Int], value: Int): Unit = {
      if(value % 2 == 0){
        newList += value
      }
    }
    @tailrec
    def createList(newList: mutable.MutableList[Int], oldList: mutable.MutableList[Int], index: Int): mutable.MutableList[Int] = {
      if(index < oldList.size) {
        checksValueForAdd(newList, oldList(index))
        createList(newList, oldList, index + 1)
      }
      else{
        newList
      }
    }
    createList(mutable.MutableList(), oldList, 0)
  }
  /**
    * The method is for solution first task with subexpression.
    * @param oldList This is input list.
    * @return This is output list.
    */
  def createNewListFilter(oldList: mutable.MutableList[Int]): mutable.MutableList[Int] =
    oldList.filter((value: Int) => value % 2 == 0)
  /**
    * The method is for solution second task with subexpression.
    * @param oldList This is input list.
    * @return This is output list.
    */
  def findLocalExtremumRec(oldList: mutable.MutableList[Int]): mutable.MutableList[Int] = {
    def checksValueForAdd(newList: mutable.MutableList[Int], valuePrev: Int, value: Int, valueSecond: Int): Unit = {
      if(((value > valuePrev) && (value > valueSecond)) || ((value < valuePrev) && (value < valueSecond))){
        newList += value
      }
    }
    @tailrec
    def findExtremum(newList: mutable.MutableList[Int], oldList: mutable.MutableList[Int], index: Int): mutable.MutableList[Int] = {
      if(index + 1 < oldList.size){
        checksValueForAdd(newList, oldList(index - 1), oldList(index), oldList(index + 1))
        findExtremum(newList, oldList, index + 1)
      }
      else{
        newList
      }
    }
    findExtremum(mutable.MutableList(), oldList, 1)
  }
  /**
    * The method is for solution second task with loop.
    * @param oldList This is input list.
    * @return This is output list.
    */
  def findLocalExtremumLoop(oldList: mutable.MutableList[Int]): mutable.MutableList[Int] ={
    def findExtremum(oldList: mutable.MutableList[Int], newList: mutable.MutableList[Int]): mutable.MutableList[Int] = {
      for(index <- 1 to oldList.size-2){
        if((oldList(index) > oldList(index-1)) && (oldList(index) > oldList(index+1)) || (oldList(index) < oldList(index-1)) && (oldList(index) < oldList(index+1)) )
          newList += oldList(index)
      }
      newList
    }
    findExtremum(oldList,mutable.MutableList())
  }
}