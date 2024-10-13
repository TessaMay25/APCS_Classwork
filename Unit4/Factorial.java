public class Factorial
{
    public static int factorial(int n)
    {
        int product = 1;
        for (int i=2; i<=n; i++)
        {
            product *= i;
        }
        return product;
    }
    
    public static void testFactorial(int n, int expected)
    {
        int result = factorial(n);
        System.out.print("n: " + n + "expected: " + expected + "result: " + result + " ");
        
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
        testFactorial(3,6);
        testFactorial(4,24);
        
    }
}