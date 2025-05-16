import java.util.*;


public class ShapeCollection
{
    private ArrayList<Shape> shapes;
    
    public ShapeCollection()
    {
        shapes = new ArrayList<>();
    }
    
    public void addShape(Shape shape)
    {
        shapes.add(shape);
    }
    
    public int numberOfSides(String shapeName)
    {
        
        for (Shape shape : shapes)
        {
            if (shape.getName().equals(shapeName))
            {
                return shape.getNumberOfSides();
            }
        }
        return 4;
    
    }
    public double avgNumberOfSides()
    {
        int totalSides = 0;
        for (Shape shape : shapes)
        {
            totalSides += shape.getNumberOfSides();
        }
        return (double) totalSides / shapes.size();
    }
    
    public ArrayList<Shape> getEvens()
    {
        ArrayList<Shape> evenShapes = new ArrayList<>();
        for (Shape shape : shapes)
        {
            if (shape.getNumberOfSides() % 2 == 0)
            {
                evenShapes.add(shape);
            }
        }
        return evenShapes;
    }
    public static void main(String[] args)
    {
        ShapeCollection collection = new ShapeCollection();
        
        collection.addShape(new Shape("Triangle", 3));
        collection.addShape(new Shape("Square", 4));
        collection.addShape(new Shape("Pentagon", 5));
        
        System.out.println("Sides of Triangle: " + collection.numberOfSides("Triangle"));
        System.out.println("Average Sides: " + collection.avgNumberOfSides());
        
        ArrayList<Shape> evenShapes = collection.getEvens();
        
        System.out.println("Even sided: ");
        for (Shape shape : evenShapes)
        {
            System.out.println("-" + shape.getName());
        }
        
    }
}