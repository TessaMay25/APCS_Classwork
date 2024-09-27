public class GoodDeal
{
    public static boolean goodDeal(double originalPrice, double salePrice)
    {
        if (salePrice<.75*originalPrice)
        {
            return (true);
        }
        else 
        {
            return (false);
        }
    }
    
    public static void testGoodDeal(double originalPrice, double salePrice, boolean expected)
    {
        boolean result = goodDeal(originalPrice, salePrice);
        System.out.print("originalPrice: " + originalPrice + "salePrice: " + salePrice + "expected: " + expected + "result: " + result + " ");
        
         if (result == expected)
            System.out.println("true");
        else 
            System.out.println("false");
    }
    
    public static void main(String[] args)
    {
        testGoodDeal(100, 20, true);
        testGoodDeal(100, 90, false);
    }
    
}