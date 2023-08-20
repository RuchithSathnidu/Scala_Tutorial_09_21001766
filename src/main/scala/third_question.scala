object third_question {
  def main(args: Array[String]): Unit = {
    val A_1 = new Account(25000.0)
    val A_2 = new Account(15000.0)

    A_1.deposit(5000.0)
    A_2.withdraw(4000.0)
    A_1.transfer(20000.0, A_2)

  }
}

