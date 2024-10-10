public class Dice 
{
  public static void diceRolling()
  {
      double a = Math.random();
      if (a <=.167)
      {
          System.out.println("1");
      }
      if (a >.167 && a<= .33)
      {
          System.out.println("2");
      }
      if (a > .33 && a<=.5)
      {
          System.out.println("3");
      }
      if (a > .5 && a <= .667)
      {
          System.out.println("4");
      }
      if (a>.667 && a<=.833)
      {
          System.out.println("5");
      }
      if (a > .833 && a<= 1);
      {
          System.out.println("6");
      }
  }
    
    public static void main(String[] args)
    {
        diceRolling();
        diceRolling();
        diceRolling();
        diceRolling();
        diceRolling();
        diceRolling();
        diceRolling();
        diceRolling();
        diceRolling();
        diceRolling();
        diceRolling();
        diceRolling();
        
        
    }
}