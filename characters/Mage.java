package characters;

public class Mage extends GameCharacter
{
    private int healthPoints;
    private int manaPoints;
    private int stealthPoints;
    private int strengthPoints;
    private int charismaPoints;

    public Mage()
    {}

    public void setUPMage(Mage mg)
    {
        mg.setHP();
        mg.setMP();
        mg.setSP();
        mg.setStrP();
        mg.setCharP();
    }

    @Override
    public void getStats() 
    {
        System.out.println("The Mages stats: ");
        System.out.println("Health    = " + healthPoints);
        System.out.println("Mana      = " + manaPoints);
        System.out.println("Stealth   = " + stealthPoints);
        System.out.println("Strength  = " + strengthPoints);
        System.out.println("Charisma  = " + charismaPoints);
        System.out.println();
    }

    @Override
    public void setHP()
    {
        this.healthPoints = 10;
    }

    @Override
    public int getHP()
    {
        return healthPoints;
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
    public int getMP()
    {
        return manaPoints;
    }

    @Override
    public void updateMP(int upMP) 
    {
        this.manaPoints = manaPoints + upMP;
    }

    @Override
    public void setSP()
    {
        this.stealthPoints = 8;
    }

    @Override
    public int getSP()
    {
        return stealthPoints;
    }

    @Override
    public void updateSP(int upSP) 
    {
        this.stealthPoints = strengthPoints + upSP;
    }

    @Override
    public void setStrP()
    {
        this.strengthPoints = 3;
    }

    @Override
    public int getStrP()
    {
        return strengthPoints;
    }

    @Override
    public void updateStrP(int upStrP) 
    {
        this.strengthPoints = strengthPoints + upStrP;
    }

    @Override
    public void setCharP()
    {
        this.charismaPoints = 5;
    }
    
    @Override
    public int getCharP()
    {
        return charismaPoints;
    }

    @Override
    public void updatecharP(int upCharP) 
    {
        this.charismaPoints = charismaPoints + upCharP;
    }
}
