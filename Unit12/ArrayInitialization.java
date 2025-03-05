import java.util.*;
public class ArrayInitialization
{
    
    
    public static void print(int[][] values)
    {
        for (int i=0; i<values.length; i++)
        {
            for (int j=0; j<values[i].length; j++)
            {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void print2(String[][] values)
    {
        for (String[] row : values)
        {
            for (String value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void print3(double[][] values)
    {
        for (int i=0; i<values.length; i++)
        {
            for (int j=0; j<values[i].length; j++)
            {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
    
    int[][] values2 = new int[10][10];
    for (int i=0; i<10; i++)
    {
        for (int j=0; j<10; j++)
        {
            if (i == j)
                values2[i][j] = 1;
            else 
                values2[i][j] = 0;
        }
    }
    String[][] values = {
        {"Tessa", "Luna", "Dr. Kessner"},
        {"Dog", "Cat"},
        {"Mustang"}
    };
        
    double[][] values3 = new double[5][5];
    for (int i=0; i<values3.length; i++)
    {
        for (int j = 0; j<values3[i].length; j++)
        {
            values3[i][j] = (i + 1) * 10 + (j + 1);
        }
    }
    int[][] values4 = new int[6][5];
    for (int i=0; i<6; i++)
    {
        for (int j=0; j<5; j++)
        {
            values4[i][j] = i+1;
        }
    }
    
   
    print(values2);
    print2(values);
    print3(values3);
    print(values4);
        
    
    
    
    
    }
    
}