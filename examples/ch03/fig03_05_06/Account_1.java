package ch03.fig03_05_06;
// Fig. 3.5: Account_1.java
// Account_1 class with a constructor that initializes the name.

public class Account_1
{
   private String name; // instance variable

   // constructor initializes name with parameter name
   public Account_1(String name) // constructor name is class name
   {                                                               
      this.name = name;
   }                                            

   // method to set the name
   public void setName(String name)
   {
      this.name = name; 
   } 

   // method to retrieve the name
   public String getName()
   {
      return name; 
   } 
} // end class Account_1

