package game;

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

        story.intro(story);

        knight.getStats();
        mage.getStats();
        thief.getStats();

        knight.updateDays(1);
        story.tenDayStory(knight, story);

    }
}