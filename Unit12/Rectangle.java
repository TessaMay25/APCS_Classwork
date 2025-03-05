public class Rectangle
{
    private String name;
    private double width;
    private double height;
    
    public Rectangle(String name, double width, double height)
    {
        this.name = name;
        this.width = width;
        this.height = height;
    }
    public String getName()
    {
        return name;
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public double getPerimeter()
    {
        return 2*(height + width);
    }
    public double getArea()
    {
        return height*width;
    }
    
    public static double avgP(Rectangle[][] rectangles)
    {
        double total = 0;
        double count = 0;
        for (Rectangle[] row : rectangles)
        {
            for (Rectangle rect : row)
            {
                total += rect.getPerimeter();
                count ++;
            }
        }
        return total/count;
    }
    public static Rectangle greatestArea(Rectangle[][] rectangles)
    {
        Rectangle maxRectangle = null;
        double max = 0;
        for (Rectangle[] row : rectangles)
        {
            for (Rectangle rect : row)
            {
                if (rect.getArea() > max)
                {
                    max = rect.getArea();
                    maxRectangle = rect;
                }
            }
        }
        return maxRectangle;
    }
    public static void main(String[] args)
    {
        Rectangle[][] rectangle = {
            {new Rectangle("A", 2, 4), new Rectangle("B", 3, 6)},
            {new Rectangle("C", 1, 5), new Rectangle("D", 4, 5)}
        
        };
        System.out.println("Average Perimeter: " + avgP(rectangle));
        Rectangle maxRect = greatestArea(rectangle);
        System.out.println("Greatest Area: " + maxRect.getName());
    }
}