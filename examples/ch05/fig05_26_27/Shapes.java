// Fig. 5.26: Shapes.java
// Demonstrates drawing different shapes.
package ch05.fig05_26_27;

import java.awt.Graphics; //handle the display
import javax.swing.JPanel;

public class Shapes extends JPanel
{
   private final int choice; // user's choice of which shape to draw
   
   // constructor sets the user's choice
   public Shapes(int userChoice)
   {
      choice = userChoice;
   } 
   
   // draws a cascade of shapes starting from the top-left corner
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      for (int i = 0; i < 10; i++)
      {
         // pick the shape based on the user's choice
         switch (choice)
         {
            case 1: // draw rectangles
               g.drawRect(10 + i * 10, 10 + i * 10, 
                  50 + i * 10, 50 + i * 10);
               break;
            case 2: // draw ovals
               g.drawOval(10 + i * 10, 10 + i * 10, 
                  50 + i * 10, 50 + i * 10);
               break;
         } 
      } 
   } 
} // end class Shapes
