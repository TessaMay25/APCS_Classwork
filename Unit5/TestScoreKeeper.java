public class TestScoreKeeper
{
    public static void main(String[] args)
    {
        ScoreKeeper keeper = new ScoreKeeper();
        System.out.println("Starting score: " + keeper.getScore());
        keeper.scoreNormal();
        System.out.println("Score when scoreNormal(): " + keeper.getScore());
        keeper.scoreBonus();
        System.out.println("Score when scoreBonus(): " + keeper.getScore());
    }
}