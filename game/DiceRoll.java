package game;

import java.util.Random;

public class DiceRoll 
{
    public int rollDice() 
    {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }

    public int rollDice(int num)
    {
        Random rand = new Random();
        return rand.nextInt(num) + 1;
    }

    public int randNum()
    {
        Random rand = new Random();
        return rand.nextInt(2) + 1;
    }

    public int randNum(int n)
    {
        Random rand = new Random();
        return rand.nextInt(n) + 1;
    }
}
