import java.util.*;
public class FindMax
{
    public static double findMax(double[] values)
   {     
        if (values == null || values.length == 0)
        {
            return Double.NaN;
        }
    double total = values [0];
    for (double value : values)
    {
        if (value > total)
            total = value;
    }
    return total;
    
    }
    
    public static void testMax(double [] values, double expected)
    {
        double result = findMax(values);
        for (double value : values)
            System.out.print(" expected: " + expected + "result: " + result + "");
        if (Math.abs(result-expected) < 1e-6)
            System.out.println("Success");
        else
            System.out.println("fail");
        

    }
    
    public static void main(String[] args)
    {
        double[] values2 = {1.0, 2.1, 5.3};
        double[] values3 = {0.0, -35.0, 90.1};
        
        testMax(values2, 5.3);
        testMax(values3, 90.1);
    }
        
}