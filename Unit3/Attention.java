public class Attention
{
    public static boolean attention(String input)
    {
        return input.startsWith("Hey, you!");
    }
    
    public static void testAttention(String input, boolean expected)
    {
        boolean result = attention(input);
        System.out.print("input: " + input + "expected: " + expected + "result: " + result + " ");
        
         if (result == expected)
    
            System.out.println("true");
        
        else
            System.out.println("false");
    }
    
    public static void main(String[] args)
    {
        testAttention("Hey, you! Nice to meet you.", true);
        testAttention("Hello, nice to meet you.", false);
        testAttention("Hey, you! What's up?", true);
    }
        
}