

public class Mage extends GameCharacter
{
    private int healthPoints;
    private int manaPoints;
    private int stealthPoints;
    private int strengthPoints;
    private int charismaPoints;

    public Mage()
    {}

    @Override
    public void getStats() 
    {
        System.out.println("The Mages stats: ");
        System.out.println("Health    = " + healthPoints);
        System.out.println("Mana      = " + manaPoints);
        System.out.println("Stealth   = " + stealthPoints);
        System.out.println("Strength  = " + strengthPoints);
        System.out.println("Charisma  = " + charismaPoints);
    }

    @Override
    public void setHP()
    {
        this.healthPoints = 10;
    }

    @Override
    public void getHP()
    {
        System.out.println("The Mage has " + healthPoints + " health.");
    }
    
    public void updateHP(int upHP)
    {
        this.healthPoints = healthPoints + upHP;
    }

    @Override
    public void setMP()
    {
        this.manaPoints = 10;
    }

    @Override
    public void getMP()
    {
        System.out.println("The Mage has " + manaPoints + " mana.");
    }

    @Override
    public void setSP()
    {
        this.stealthPoints = 8;
    }

    @Override
    public void getSP()
    {
        System.out.println("The Mage has " + stealthPoints + " stealth.");
    }

    @Override
    public void setStrPoints()
    {
        this.strengthPoints = 3;
    }

    @Override
    public void getStrPoints()
    {
         System.out.println("The Mage has " + strengthPoints + " strength.");
    }

    @Override
    public void setCharPoints()
    {
        this.charismaPoints = 5;
    }
    
    @Override
    public void getCharPoints()
    {
        System.out.println("The Mage has " + charismaPoints + " charisma.");
    }
}
