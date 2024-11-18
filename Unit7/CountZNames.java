public class CountZNames
{
    public static int countZNames(String[] values)
    {
        int count = 0;
       
        
        for (int i = 0; i < values.length; i++)
        {
            String value = values[i];
            if (value.startsWith("Z") || value.startsWith("z"))
            {
                count+=value.length();
            }
               
            
        }
        return count;
    }
    public static void testCountZNames(String[] values, int expected)
    {
        int result = countZNames(values);
        
        System.out.print(" expected: " + expected + "result: " + result + "");
        if (result == expected)
            System.out.println("Success");
        else
            System.out.println("fail");
        
    }
    public static void main(String[] args)
    {
        String[] values = {"Tessa", "Luna"};
        String[] values2 = {"Zorro", "zero", "zippy"};
        
        testCountZNames(values, 0);
        testCountZNames(values2, 14);
    }
}