public class AccountInformation
{
  private double balance;
  private String name;
  private long acctNum;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public AccountInformation(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
    
  }

  
 
  public String toString()
    {String report = " ";
    
    report+= "\n acctNum\t" + acctNum;
    report += "\n name\t\t"   + name;
    report += "\n balance\t" + balance;
    return report;
    } 
     
      
      
      
      
  

    public  static void myFunction()
   
   AccountInformation w,x;
 int 15; 
 int x = 20;

 y = new AccountInformation(10000, "John", 1000);
      
  z = new AccountInformation(15000, "Joe", 1001);


 System.out.println(w);
      System.out.println(x);
      System.out.println(y);
      System.out.println(z);
     {
 
 
     
     
    
  }

}
