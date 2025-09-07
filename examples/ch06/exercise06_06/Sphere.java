package ch06.exercise06_06;// Exercise 6.6: Sphere.java
// Calculate the volume of a sphere.
import java.util.Scanner;

@SuppressWarnings("UnnecessaryLocalVariable")
public class Sphere
{
   // obtain radius from user and display volume of sphere
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter radius of sphere: ");
      double radius = input.nextDouble();

      System.out.printf("Volume is %f%n", sphereVolume(radius));
   } // end method determineSphereVolume

   // calculate and return sphere volume
   public static double sphereVolume(double radius)
   {
      double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
      return volume;
   } // end method sphereVolume
} // end class Sphere
