import java.util.ArrayList;

public class CountLuckys
{

    
    public static int countLuckyN(ArrayList<Integer> numbers)
    {
        int count = 0;
        
        for (int num : numbers)
        {
            if (num%7 == 0 || Math.abs(num)%10 == 7)
                count ++;
        }
        return count;
    }
    
    public static void testCount(ArrayList<Integer> numbers, int expected)
    {
        int result = countLuckyN(numbers);
        for (int num : numbers)
            System.out.print(num + " ");
        
        System.out.print("expected: " + expected + " result: " + result + " ");
         if (Math.abs(result-expected) < 1e-6)
            System.out.println("success");
        else
            System.out.println("fail");
    }
    
        public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
            
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(7);
        numbers2.add(13);
        numbers2.add(17);
        
            
        testCount(numbers, 0);
        testCount(numbers2, 2);
    }
}