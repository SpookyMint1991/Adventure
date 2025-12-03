package characters;

import characters.GameCharacter;

public class Knight extends GameCharacter
{
    private int healthPoints;
    private int manaPoints;
    private int stealthPoints;
    private int strengthPoints;
    private int charismaPoints;

    public Knight() {}
    
    @Override
    public void setHP()
    {
        this.healthPoints = 10;
    }

    @Override
    public void getStats() 
    {
        System.out.println("The Knights stats: ");
        System.out.println("Health    = " + healthPoints);
        System.out.println("Mana      = " + manaPoints);
        System.out.println("Stealth   = " + stealthPoints);
        System.out.println("Strength  = " + strengthPoints);
        System.out.println("Charisma  = " + charismaPoints);
    }

    @Override
    public void getHP()
    {
        System.out.println("The Knight has " + healthPoints + " health.");
    }
    
    public void updateHP(int upHP)
    {
        this.healthPoints = healthPoints + upHP;
    }

    @Override
    public void setMP()
    {
        this.manaPoints = 3;
    }

    @Override
    public void getMP()
    {
        System.out.println("The Knight has " + manaPoints + " health.");
    }

    @Override
    public void setSP()
    {
        this.stealthPoints = 5;
    }

    @Override
    public void getSP()
    {
        System.out.println("The Knight has " + stealthPoints + " stealth.");
    }

    @Override
    public void setStrPoints()
    {
        this.strengthPoints = 10;
    }

    @Override
    public void getStrPoints()
    {
         System.out.println("The Knight has " + strengthPoints + " strength.");
    }

    @Override
    public void setCharPoints()
    {
        this.charismaPoints = 8;
    }

    @Override
    public void getCharPoints()
    {
        System.out.println("The Knight has " + charismaPoints + " charisma.");
    }
}
