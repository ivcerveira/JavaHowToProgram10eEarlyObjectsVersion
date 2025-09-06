package ch01.painter;
// GCS Exercise 14.17 Solution: Painter.java
// Test application to display a DrawFrame
import javax.swing.JFrame;

public class Painter
{
   public static void main(String[] args)
   {
      DrawFrame application = new DrawFrame();
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.setSize(500, 400);
      application.setVisible(true);
   } // end main
} // end class Painter
