/**
  * This is main object with all function for all tasks.
  * @author Alex Sidorov
  * @version 1.0
  * @since 2018-05-13
  */

/**
  * The class implements a manager.
  */
class Manager()extends AnyRef{
  /**
    * The method is action's Manager.
    * @return Info of action's Manager.
    */
  def raisePayment():String = "Manager is raising payment."
}

/**
  * The class implements a developer.
  */
class Developer()extends AnyRef{
  /**
    * The method is action's Developer.
    * @return Info of action's Developer.
    */
  def work():String = "Developer is working."
}

/**
  * The class implements a granny.
  */
class Granny()extends AnyRef{
  /**
    * The method is action's Granny.
    * @return Info of action's Granny.
    */
  def knit():String = "Granny is knitting."
}

object Main {
  /**
    *This is main method for start application.
    *@param args This is the default parameter.
    */
  def main(args: Array[String]): Unit = {

    println("First task:")
    println("Result first task: "+answerTaskOne(6))

    println("\nSecond task:")
    println("Result second task: "+answerTaskTwo(new Developer))
  }

  /**
    * This is answer first task.
    * @param value This is input value.
    * @return This is output value.
    */
  def answerTaskOne(value:Int):Int = {
      def divValueSix(value: Int,divValue:Int):Int ={
        divValue match{
          case 0 =>value/3
          case _ => value
        }
      }

      def divValueFive(value:Int,divValue:Int):Int ={
        divValue match{
          case 0 => divValueSix(value*2,value%3)
          case _ => divValueSix(value,value%6)
        }
      }
   divValueFive(value,value%5)
  }
  /**
    * This is answer second task.
    * @param value This is input value.
    * @return This is output value.
    */
  def answerTaskTwo(value:AnyRef): String ={
    value match{
      case obj:Granny => obj.knit()
      case obj:Manager => obj.raisePayment()
      case obj:Developer => obj.work()
      case _ => "Unknown object."
    }
  }
}
