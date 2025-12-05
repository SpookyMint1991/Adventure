package game;

import java.util.ArrayList;
import java.util.List;

import characters.GameCharacter;
import characters.Knight;
import characters.Mage;
import characters.Thief;

public class Adventure 
{
    public static void main(String[] args) 
    {
        Knight knight = new Knight();
        Mage mage = new Mage();
        Thief thief = new Thief();
        Story story = new Story();

        knight.setUPKnight(knight);
        mage.setUPMage(mage);
        thief.setUPThief(thief);

        story.intro();

        knight.getStats();
        mage.getStats();
        thief.getStats();

        story.tenDayStory(knight);

    }
}