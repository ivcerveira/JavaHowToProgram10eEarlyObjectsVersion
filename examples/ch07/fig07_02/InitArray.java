// Fig. 7.2: InitArray.java
// Initializing the elements of an array to default values of zero.
package ch07.fig07_02;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class InitArray
{
   public static void main(String[] args)
   {
      // declare variable array and initialize it with an array object  
      AtomicIntegerArray array = new AtomicIntegerArray(new int[10]); // new creates the array object

      System.out.printf("%s%8s%n", "Index", "Value"); // column headings
   
      // output each array element's value 
      for (int counter = 0; counter < array.length(); counter++)
         System.out.printf("%5d%8d%n", counter, array.get(counter));
   } 
} // end class InitArray
