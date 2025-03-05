public class Computations
{
    public static int findSmall(int[][] values)
    {
        int min = values[0][0];
        for (int[] row : values)
        {
            for (int value : row)
            {
                if (value < min )
                {
                    min = value;
                }
            }
        }
        return min;
    }
    public static float sum(float[][] values)
    {
        float total = 0;
        for (float[] row : values)
        {
            for (float value : row)
            {
                total+= value;
            }
        }
        return total;
    }
    public static int countA(String[][] values)
    {
        int count = 0;
        for (String[] row : values)
        {
            for (String value : row)
            {
                if (value.startsWith("A"))
                {
                    count += 1;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        int[][] numbers = {
            {1,2,3},
            {8,9,5},
            {2,7,3}
        };
        float[][] nums = {
            {1,2,3},
            {8,9,5},
            {2,7,3}
        };
        String[][] n = {
            {"Apple", "Bug", "Lemon"},
            {"Tree", "Amazing", "Orange"},
            {"Alive", "Ample", "Well"}
        };
        System.out.println("Smallest: " + findSmall(numbers));
        System.out.println("Sum: " + sum(nums));
        System.out.println("Starts with A: " + countA(n));
    }
}