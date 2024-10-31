public class Rectangle
{
    private double base;
    private double height;
    public Rectangle(double baseIn, double heightIn)
    {
        base = baseIn;
        height = heightIn;
    }
    public double getBase()
    {
        return base;
    }
    public double getHeight()
    {
        return height;
    }
    public double getArea()
    {
        return base*height;
    }
    public double getPerimeter()
    {
        return height+height+base+base;
    }
    public double getDiagonal()
    {
        return Math.sqrt((height*height)+ (base*base));
    }
}