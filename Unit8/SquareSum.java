import java.util.ArrayList;
public class SquareSum
{
    public static int squareSum(ArrayList<Integer> numbers)
    {
        int total = 0;
        for (int nums : numbers)
            total += nums*nums;
        return total;
    }
    public static void testSquareSum(ArrayList<Integer> numbers, int expected)
    {
        int result = squareSum(numbers);
        
        for (int nums : numbers)
            System.out.print(nums + " ");
        System.out.print("expected: " + expected + "result: " + result + " ");
         if (Math.abs(result-expected) < 1e-6)     
            System.out.println("Success");
        else
            System.out.println("fail");
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        
        testSquareSum(numbers, 0);
        testSquareSum(numbers2, 14);
    }
}