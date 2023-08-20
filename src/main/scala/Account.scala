class Account(accountBalance: Double) {
  private var balance: Double = accountBalance

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      val pre_balance = balance
      balance += amount
      println("Successfully Deposited. Deposit amount : " + amount)
      println("previous account balance : " + pre_balance)
      println("New account balance : " + balance)
    } else {
      println("Deposit amount should be greater than zero.")
    }
    println("-------------------------------------------------------------")
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      val pre_balance = balance
      balance -= amount
      println("Successfully Withdrawn. Withdrawn amount : " + amount)
      println("previous account balance : " + pre_balance)
      println("New account balance : " + balance)
    } else if (amount <= 0) {
      println("Withdrawal amount should be greater than zero.")
    } else {
      println("Insufficient balance for withdraw")
    }
    println("-------------------------------------------------------------")
  }

  def transfer(amount: Double, target_account: Account): Unit = {
    if (amount > 0 && amount <= balance) {
      val pre_balance = balance
      balance -= amount
      println("Transferred " + amount + " to target account.")
      println("previous account balance : " + pre_balance)
      println("New account balance : " + balance)
      println("------------------Target Account-----------------------------")
      target_account.deposit(amount)

    } else if (amount <= 0) {
      println("Transfer amount should be greater than zero.")
      println("-------------------------------------------------------------")
    } else {
      println("Insufficient balance for transfer.")
      println("-------------------------------------------------------------")
    }
  }

  def Interest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05
    } else {
      balance += balance * 0.1
    }
  }

  def getBalance: Double = balance

}

