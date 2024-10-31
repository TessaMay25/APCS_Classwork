public class TestRectangle
{
    public static void main(String[] args)
    {
        Rectangle test = new Rectangle(2,2);
        
        System.out.println("Base: " + test.getBase());
        System.out.println("Height: " + test.getHeight());
        System.out.println("Area: " + test.getArea());
        System.out.println("Perimeter: " + test.getPerimeter());
        System.out.println("Diagonal: " + test.getDiagonal());
    }
}