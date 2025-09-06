package ch03.fig03_05_06;
// Fig. 3.6: AccountTest_1.java
// Using the Account_1 constructor to initialize the name instance
// variable at the time each Account_1 object is created.

public class AccountTest_1
{
   public static void main(String[] args)
   { 
      // create two Account_1 objects
      Account_1 account1 = new Account_1("Jane Green");
      Account_1 account2 = new Account_1("John Blue");

      // display initial value of name for each Account_1
      System.out.printf("account1 name is: %s%n", account1.getName());
      System.out.printf("account2 name is: %s%n", account2.getName());
   } 
} // end class AccountTest_1
