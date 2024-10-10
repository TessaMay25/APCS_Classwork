public class CoinFlip
{
    public static void main(String[] args)
    {
        for (int i=0; i<20; i++)
        {
            int value = (int) (Math.random() * 10 + 1);
            if (value%2==0)
                System.out.println("Heads");
            else
                System.out.println("Tails");
        }
    }
}