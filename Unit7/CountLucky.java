public class CountLucky
{
    public static double countLucky(double[] values)
    {
        double total = 0;

        for (int i = 0; i < values.length; i++)
        {
            double value = values[i];
            System.out.println("i: " + i + "values[i]: " + value);
            if (values[i]%7 == 0 || ((values[i]-7)%10 == 0))
                total += 1;
           
        }
         return total;
    }
    public static void testCountLucky(double[] values, double expected)
    {
        double result = countLucky(values);
        for (double value : values)
            System.out.print(value + " ");
        System.out.print("expected: " + expected + "result: " + result + " ");
        if (Math.abs(result-expected) < 1e-6)
            System.out.println("success");
        else
            System.out.println("fail");
    }
    public static void main(String[] args)
    {
        double[] values = {1,2,3};
        double[] values2 = {7,13,17};
        double[] values3 = {107,207};
        
        testCountLucky(values, 0);
        testCountLucky(values2, 2);
        testCountLucky(values3, 2);
    }
}