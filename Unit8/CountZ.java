import java.util.ArrayList;
public class CountZ
{
    public static int countZ(ArrayList<String> string)
    {
        int count = 0;
        for (String str : string)
            if (str.startsWith("Z") || str.startsWith("z"))
            {
                count += str.length();
            }
        return count;
    }
    
    public static void testCountZ(ArrayList<String> string, int expected)
    {
        int result = countZ(string);
        
        for (String str : string)
            System.out.print(str + " ");
        System.out.print("expected: " + expected + "result: " + result + " ");
         if (Math.abs(result-expected) < 1e-6)     
            System.out.println("Success");
        else
            System.out.println("fail");
    }
    
    public static void main(String[] args)
    {
        ArrayList<String> string = new ArrayList<>();
        string.add("Dr. Kessner");
        string.add("Dr. Sands");
        ArrayList<String> string2 = new ArrayList<>();
        string2.add("Zorro");
        string2.add("zero");
        string2.add("zippy");
        
        testCountZ(string, 0);
        testCountZ(string2, 14);
    }
}