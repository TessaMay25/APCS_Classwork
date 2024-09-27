public class IcyHot
{
    public static boolean icyHot(int temp1, int temp2)
    {
        if ((temp1<0 && temp2>100) || (temp2<0 && temp1>100))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void testIcyHot( int temp1, int temp2, boolean expected)
    {
        boolean result = icyHot(temp1, temp2);
        System.out.print("temp1: " + temp1 + "temp2: " + temp2 + "expected: " + expected + "result: " + result + " " );
        
        if (result == expected)
            System.out.println("true");
        else 
            System.out.println("false");
    }
    public static void main(String[] args)
    {
       
        
        testIcyHot(-1,200, true);
        testIcyHot(10, 20, false );
        testIcyHot(200,-1, true);
    }
}