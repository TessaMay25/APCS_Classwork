public class Reverse
{
    public static String reverse(String input)
    {
        String result = "";
        for (int i = input.length(); i>0; i--)
        {
            result += input.substring(i-1, i);
        }
        return result;
    }
    public static void testReverse(String input, String expected)
    {
        String result = reverse(input);
        System.out.print("input: " + input + "expected: " + expected + "result: " + result + " ");
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
        testReverse("Tessa", "asseT");
        testReverse("hello", "olleh");
    }
}