public class Greetings
{
    public static String greetings(String name)
    {
        return "Hi, " + name + " what's up?";
    }
    
    public static void testGreetings(String name, String expected)
    {
        String result = greetings(name);
        System.out.print("name: " + name + "expected: " + expected + "result: " + result + " ");
        
        if (result.equals(expected))
    
            System.out.println("true");
        
        else
            System.out.println("false");
    }
    
    public static void main(String[] args)
    {
        testGreetings("Tessa", "Hi, Tessa what's up?");
        testGreetings("Dr. Kessner", "Hi, Dr. Kessner what's up?");
    }
}