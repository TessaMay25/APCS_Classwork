import java.util.*;
public class Fibonacci9
{
    public static int[] fibonacci(int n)
    {
        if (n<=0)
        {
            return new int[0];
        }
        int[] fibonacciSeq = new int[n];
        if (n>=1) fibonacciSeq[0]= 0;
        if (n>=2) fibonacciSeq[1] = 1;
        for (int i = 2; i < n; i++)
        {
            fibonacciSeq[i] = fibonacciSeq[i - 1] + fibonacciSeq[i - 2];
        }
        return fibonacciSeq;
        
        
    }
    public static void main(String[] args)
    {
        int n = 7;
        int[] result = fibonacci(n);
        
        System.out.println(n);
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]);
            if (i < result.length - 1)
            {
                System.out.print(",");
            }
        }
    }
}