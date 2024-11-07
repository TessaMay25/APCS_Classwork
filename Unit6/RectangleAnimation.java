import processing.core.*;
import java.util.*;
public class RectangleAnimation extends PApplet
{
   private ArrayList<Rectangle> rectangles;
   
   public void settings()
   {
    size(400,400);
   }
   public void setup()
   {
    rectangles = new ArrayList<Rectangle>();
    rectangles.add(new Rectangle(this));
   }
   public void draw()
   {
    background(0);
    for (Rectangle r : rectangles)
        r.display();
   }
   public void keyPressed()
   {
    for (int i =0; i<10; i++)
        rectangles.add(new Rectangle(this));
   }
   
   public static void main(String[] args)
   {
    PApplet.main("RectangleAnimation");
   }
   
}