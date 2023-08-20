object fourth_question {

  def negative_accounts(accounts: List[Account]): Unit = {
    val negative_balance_accounts = accounts.filter(_.getBalance < 0)
    val negative_balances = negative_balance_accounts.map(_.getBalance)
    println("Negative Accounts,")
    var i = 0;
    while (i < negative_balances.length) {
      println("Account : " + negative_balance_accounts(i) + " / Balance : " + negative_balances(i))
      i += 1
    }

    println("--------------------------------------------------------------------")

  }

  def get_total(accounts: List[Account]): Unit = {
    val totalBalance = accounts.map(_.getBalance).sum
    println("Total balance of all accounts : " + totalBalance)
    println("--------------------------------------------------------------------")
  }

  def get_interest(accounts: List[Account]): Unit = {
    accounts.foreach(_.Interest())
    println("Final balances after applying interest:")
    accounts.foreach(account => println("Account balance : " + account.getBalance))
    println("--------------------------------------------------------------------")
  }

  def main(args: Array[String]): Unit = {
    val accounts: List[Account] = List(
      new Account(50000.0),
      new Account(-5000.0),
      new Account(-2000.0),
      new Account( 30000.0)
    )

    negative_accounts(accounts)
    get_total(accounts)
    get_interest(accounts)

  }


}


