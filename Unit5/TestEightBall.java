public class TestEightBall
{
    public static void main(String[] args)
    {
        MagicEightBall test = new MagicEightBall("Will I get an A on this assignment?");
        System.out.println("Will I get an A on this assignment?");
        System.out.println("Result: " + test.ask());
    }
}