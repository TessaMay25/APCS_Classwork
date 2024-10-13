public class CountOccurences
{
    public static int countOccurences(String str, String substring)
    {
        int count = 0;
        int substringLen = substring.length();
        
        for (int i=0; i<= str.length() - substringLen; i++)
        {
            if (str.substring(i, i+substringLen).equals(substring))
            {
                count++;
            }
        }
         return count;
    }
   
    
    public static void testCount(String str, String substring, int expected)
    {
        int result = countOccurences(str, substring);
        System.out.print("str: " + str + "substring: " + substring + "expected: " + expected + "result: " + result + " ");
        if (result == expected)
        {
            System.out.println("true");
        }
        else 
        { 
            System.out.println("false");
        }
    }
    public static void main(String[] args)
    {
        testCount("Mississippi", "iss", 2);
        testCount("bananana", "na", 3);
    }
}