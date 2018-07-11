// Program Name      Account.java
//Course:            CSE1301J(Java)-section 002
//Student Name:      Juan Aguirre
//Assignment#        Lab6
//Due Date:          10/2/2014       
// Purpose:          A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account

public class Account
{
  private double balance;
  private String name;
  private long acctNum;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
    
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds");
  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }


  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString()
    {String report = " ";
    
    report+= "\n acctNum\t" + acctNum;
    report += "\n name\t\t"   + name;
    report += "\n balance\t" + balance;
    return report;
    } 
     
      
      
      
      
  

  //----------------------------------------------
  // Deducts $10 service fee
  //----------------------------------------------
  public void chargeFee()
  {
      balance -= 10;

  }

  //----------------------------------------------
  // Changes the name on the account 
  //----------------------------------------------
  public void changeName(String newName)
                          
  {
   newName = name;
  }

}
