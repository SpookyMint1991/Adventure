package characters;

public abstract class GameCharacter
{
    private int healthPoints;
    private int manaPoints;
    private int stealthPoints;
    private int strengthPoints;
    private int charismaPoints;

    public void setHP() {}

    public int getHP() {return healthPoints;}

    public void updateHP(int upHP) {}

    public void setMP() {}

    public int getMP() {return manaPoints;}

    public void updateMP(int upMP) {}

    public void setSP() {}

    public int getSP() {return stealthPoints;}

    public void updateSP(int upSP) {}

    public void setStrP() {}

    public int getStrP() {return strengthPoints;}

    public void updateStrP(int upStrP) {}

    public void setCharP() {}

    public int getCharP() {return charismaPoints;}

    public void updatecharP(int upCharP) {}

    public void getStats() {}
}
