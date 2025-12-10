package characters;

public abstract class GameCharacter
{
    private int healthPoints;
    private int manaPoints;
    private int stealthPoints;
    private int strengthPoints;
    private int charismaPoints;
    private int days;

    public void setHP(int n) {}

    public int getHP() {return healthPoints;}

    public void updateHP(int upHP) {}

    public void setMP(int n) {}

    public int getMP() {return manaPoints;}

    public void updateMP(int upMP) {}

    public void setSP(int n) {}

    public int getSP() {return stealthPoints;}

    public void updateSP(int upSP) {}

    public void setStrP(int n) {}

    public int getStrP() {return strengthPoints;}

    public void updateStrP(int upStrP) {}

    public void setCharP(int n) {}

    public int getCharP() {return charismaPoints;}

    public void updateCharP(int upCharP) {}

    public void getStats() {}

    public void setDays() {}

    public int getDays() {return days;}

    public void updateDays(int upDays) {}
}
