public class MagicEightBall
{
    private final String fortune;
    public MagicEightBall(String fortuneIn)
    {
        fortune = fortuneIn;
    }
    public double getFortune()
    {
        return Math.random();
    }
    public String ask()
    {
        double randomNumber = Math.random();
        if (randomNumber < .05)
            return "It is certain";
        else if (randomNumber < .1 && randomNumber > .05)
            return "It is decidedly so";
        else if (randomNumber < .2 && randomNumber > .1)
            return "Without a doubt";
        else if (randomNumber < .25 && randomNumber > .2)
            return "Yes definitely";
        else if (randomNumber < .3 && randomNumber > .25)
            return "You may rely on it";
        else if (randomNumber < .35 && randomNumber > .3)
            return "As I see it, yes";
        else if (randomNumber < .4 &&  randomNumber > .35)
            return "Most likely";
        else if (randomNumber < .45 &&  randomNumber > .4)
            return "Outlook good";
        else if (randomNumber < .5 &&  randomNumber > .45)
            return "Yes";
        else if (randomNumber < .55 &&  randomNumber > .5)
            return "Signs point to yes";
        else if (randomNumber < .6 && randomNumber > .55)
            return "Reply hazy, try again";
        else if (randomNumber < .65 && randomNumber > .6)
            return "Ask again later";
        else if (randomNumber < .7 && randomNumber > .65)
            return "Better not tell you now";
        else if (randomNumber < .75 && randomNumber > .7)
            return "Cannot predict now";
        else if (randomNumber < .8 && randomNumber > .75)
            return "Concentrate and ask again";
        else if (randomNumber < .85 && randomNumber > .8)
            return "Don't count on it";
        else if (randomNumber < .87 && randomNumber > .85)
            return "My reply is no";
        else if (randomNumber < .89 && randomNumber > .87)
            return "My sources say no";
        else if (randomNumber < .91 && randomNumber > .89)
            return "Outlook not good";
        else if (randomNumber < 1 && randomNumber > .89)
            return "Very doubtful";
        else 
            return "Try again";
    }
}