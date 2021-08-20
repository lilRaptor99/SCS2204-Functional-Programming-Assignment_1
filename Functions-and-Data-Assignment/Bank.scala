object Bank extends App {
  class Account(id: String, n: Int, b: Double) {
    val nic: String = id
    val accNo: Int = n
    var balance: Double = b

    override def toString(): String =
      s"{NIC: $nic, Account no: $accNo, Balance: $balance}"

    def withdraw(a: Double) = this.balance -= a
    def deposit(a: Double) = this.balance += a
    def transfer(to: Account, amount: Double) = {
      this.balance -= amount
      to.balance += amount
    }
  }

  val myAccount = new Account("994539899V", 1235, 100.0)
  val otherAccount = new Account("994538899V", 1236, 500.0)

//   myAccount.deposit(100.0)
//   println(myAccount)
//   myAccount.withdraw(50.0)
//   println(myAccount)

//   myAccount.transfer(otherAccount, 50.0)
//   println(myAccount)
//   println(otherAccount)

  val find = (id: String, b: List[Account]) => b.filter(x => x.nic.equals(id))

  val overdraft = (b: List[Account]) => b.filter(x => x.balance < 0)

  val totalBalance = (b: List[Account]) =>
    b.reduce((x, y) => new Account("", 0, x.balance + y.balance))

  val calcInterest = (a: Account) => {
    if (a.balance >= 0) a.balance * 1.05
    else a.balance * 1.1
  }
  val interest = (b: List[Account]) =>
    b.map(a => new Account(a.nic, a.accNo, calcInterest(a)))

  var bank: List[Account] = List(
    new Account("1V", 1, -100),
    new Account("2V", 2, -200),
    new Account("3V", 3, 300),
    new Account("4V", 4, 200)
    // new Account("5V", 5, 500),
    // new Account("6V", 6, 600),
    // new Account("7V", 7, 700)
  )

  // println(find("3V", bank))
  // println(overdraft(bank))
  // println(totalBalance(bank))
  println(interest(bank))

}
