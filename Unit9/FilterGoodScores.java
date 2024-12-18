import java.util.*;
public class FilterGoodScores
{
    public static ArrayList<Integer> filterGoodScores(ArrayList<Integer> scores)
    {
        ArrayList<Integer> total = new ArrayList<>();
        for (int value : scores)
        {
            if (value > 90)
                total.add(value);
        }
        
        return total;
    }
    
      public static void testGoodScores(ArrayList<Integer> scores, ArrayList<Integer> expected)
    {
        ArrayList<Integer> result = filterGoodScores(scores);
        
        for (int value : scores)
            System.out.print(value + " ");
        System.out.println();
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        if (result.equals(expected))
        {
            System.out.println("success");
    
        }
        else
        {
            System.out.println("Fail");
        }
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(51);
        scores.add(52);
        scores.add(53);
        scores.add(100);
        
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(100);
        
        testGoodScores(scores, expected);
       
    }
}