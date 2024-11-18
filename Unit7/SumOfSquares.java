public class SumOfSquares
{
    public static double sumOfSquares(double[] values)
    {
        double total = 0;
        for (double x : values)
            total += x*x;
        return total;
    }
    public static void testSumOfSquares(double[] values, double expected)
    {
        double result = sumOfSquares(values);
        
        for (double value : values)
            System.out.print(value + "");
        System.out.print(" expected: " + expected + "result: " + result + "");
        if (Math.abs(result-expected) < 1e-6)
            System.out.println("Success");
        else
            System.out.println("fail");
        
    }
    
    public static void main(String[] args)
    {
        double[] values = {0};
        double[] values2 = {1.0, 2.0, 3.0};
        double[] values3 = {2.0, 2.0, 2.0};
        
        testSumOfSquares(values, 0);
        testSumOfSquares(values2, 14);
        testSumOfSquares(values3, 12);
        
    }
}