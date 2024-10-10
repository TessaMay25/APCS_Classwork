public class BackAround
{
    public static String backAround(String str) 
{
  String last = str.substring(str.length() -1);
  return last + str + last;
}
    public static void testBackAround(String str, String expected)
    {
        String result = backAround(str);
        System.out.print("str: " + str + "expected: " + expected + "result: " + result + " ");
        
        if (result.equals(expected))
            System.out.println("true");
        else 
        System.out.println("false");
    
    }
    
    public static void main(String[] args)
    {
        testBackAround("cat", "tcatt");
        testBackAround("dog", "gdog");
        testBackAround("lunabooger", "rlunabooger");
    }

}