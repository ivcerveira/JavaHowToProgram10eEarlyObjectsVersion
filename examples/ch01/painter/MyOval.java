package ch01.painter;// GCS Exercise 10.2 Solution: MyOval.java
// Declaration of class MyOval.
import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyBoundedShape
{

    // call superclass constructor passing parameters
   public MyOval(int x1, int y1, int x2, int y2,
      Color color, boolean isFilled)
   {
      super(x1, y1, x2, y2, color, isFilled);
   } // end MyOval constructor

   // draw oval
   public void draw(Graphics g)
   {
      g.setColor(getColor());
      
      if (isFilled())
         g.fillOval(getUpperLeftX(), getUpperLeftY(),
            getWidth(), getHeight());
      else
         g.drawOval(getUpperLeftX(), getUpperLeftY(),
            getWidth(), getHeight());
   } // end method draw
} // end class MyOval
