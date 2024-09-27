public class PosNeg
{
    public static boolean posNeg(int a, int b, boolean negative)
    {
        if(negative)
        {
            return (a<0 && b<0);
        }
        else
        {
            return ((a<0 && b>0) || (b<0 && a>0));
        }
    }
    
    public static void testPosNeg(int a, int b, boolean negative, boolean expected)
    {
        boolean result = posNeg(a,b,negative);
        System.out.print("a: " + a + " b: " +  b + "negative: " + negative + "expected: " + expected + "result: " + result + " ");
        
         if (result == expected)
            System.out.println("true");
        else 
            System.out.println("false");
    }
    public static void main(String[] args)
    {
        testPosNeg(-1,-1, false, true);
        testPosNeg(-4, -5, true, true);
        testPosNeg(1, 1, false, false);
    }
}