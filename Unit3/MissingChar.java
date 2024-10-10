public class MissingChar
{


public static String missingChar(String str, int n) 
{
  String front = str.substring(0,n);
  String back = str.substring(n+1, str.length());
  return front + back;
}

public static void testMissingChar(String str, int n, String expected)
{
    String result = missingChar(str, n);
    System.out.print("str: " + str + "n: " + n + "expected: " + expected + "result: " + result + " ");
    
    if (result.equals(expected))
    System.out.println("true");
    else 
    System.out.println("false");
    
}

public static void main(String[] args)
{
    testMissingChar("kitten", 1, "ktten");
    testMissingChar("kitten", 0, "itten");
    testMissingChar("kitten", 4, "kittn");
}
}
