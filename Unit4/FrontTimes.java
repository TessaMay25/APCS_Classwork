public class FrontTimes
{
    public static String frontTimes(String str, int n)
    {
        int frontLen = 3;
  if (frontLen > str.length())
  {
    frontLen = str.length();
  }
  String front = str.substring(0, frontLen);
  String result = "";
  for (int i=0; i<n; i++)
  {
    result = result + front;
  }
  return result;
    }
    
    public static void testFrontTimes(String str, int n, String expected)
    {
        String result = frontTimes(str, n);
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
        testFrontTimes("Tessa", 2, "TesTes");
        testFrontTimes("Tessa", 4, "TesTesTesTes");
        testFrontTimes("Cat", 3, "CatCatCat");
    }
}