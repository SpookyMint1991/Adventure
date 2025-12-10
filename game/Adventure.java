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

        knight.updateDays(1);      // Threads go here when story is finally finished and ready for all characters to go through.
        story.tenDayStory(knight, story);  // currently hard coded to only take one character at a time. will fix later.

    }
}