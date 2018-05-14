import org.scalatest._

class MainTest extends FlatSpec with Matchers {

  it should "Test one for first task" in {
    Main.answerTaskOne(0) should be(0)
  }

  it should "Test two for first task" in {
    Main.answerTaskOne(30) should be(20)
  }

  it should "Test three for first task" in {
    Main.answerTaskOne(-30) should be(-20)
  }

  it should "Test four for first task" in {
    Main.answerTaskOne(-8) should be(-8)
  }

  it should "Test one for second task" in {
    Main.answerTaskTwo(new Granny) should be("Granny is knitting.")
  }

  it should "Test two for second task" in {
    Main.answerTaskTwo(new Developer) should be("Developer is working.")
  }

  it should "Test three for second task" in {
    Main.answerTaskTwo(new Manager) should be("Manager is raising payment.")
  }

  it should "Test four for second task" in {
    Main.answerTaskTwo(new String) should be("Unknown object.")
  }
}