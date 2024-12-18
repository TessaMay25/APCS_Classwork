import java.util.*;
public class ReverseAlls
{
    public static String reverse(String s)
    {
        
        String result = "";
        for (int i = s.length()-1; i>=0; i--)
        {
            result += s.substring(i, i+1);
        }
        return result;
       
    }
    public static ArrayList<String> reverseAll(String[] string)
    {
        ArrayList<String> reversed = new ArrayList<>();

        for (String str : string)
            reversed.add(reverse(str));
        System.out.println(reversed);
        return reversed;
        
    }
    
    public static void testReverseAlls(String[] string, ArrayList<String> expected)
    {
         ArrayList<String> result = reverseAll(string);
        
        for (String str : string)
            System.out.print(str + " ");
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
        String[] string = {"abcd", "xyz"};
        ArrayList<String> expected = new ArrayList<>();
        expected.add("dcba");
        expected.add("zyx");
        testReverseAlls(string, expected);
    }
}