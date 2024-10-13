public class StringTimes
{
    public static String stringTimes(String str, int n) {
  String result = "";
  for (int i =0; i<n; i++)
  {
    result = result + str;
    
  }
  return result;
}
public static void testStringTimes(String str, int n, String expected)
{
    String result = stringTimes(str, n);
    System.out.print("str: " + str + "n: " + n + "expected: " + expected + "result: " + result + " ");
    
    if (result.equals(expected))
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
        testStringTimes("Hi", 2, "HiHi");
        testStringTimes("Hi", 3, "HiHiHi");
        testStringTimes("Hi", 1, "Hi");
    }
}