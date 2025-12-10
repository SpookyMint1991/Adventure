package characters;

public class Knight extends GameCharacter
{
    private int healthPoints;
    private int manaPoints;
    private int stealthPoints;
    private int strengthPoints;
    private int charismaPoints;
    private int days;

    public Knight() {}

    public void setUPKnight(Knight kn)
    {
        kn.setHP(10);
        kn.setMP(3);
        kn.setSP(5);
        kn.setStrP(10);
        kn.setCharP(8);
        kn.setDays();
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
        System.out.println();
    }

    @Override
    public void setHP(int n) {this.healthPoints = n;}

    @Override
    public int getHP() {return healthPoints;}
    
    @Override
    public void updateHP(int upHP) {this.healthPoints = healthPoints + upHP;}

    @Override
    public void setMP(int n) {this.manaPoints = n;}

    @Override
    public int getMP() {return manaPoints;}

    @Override
    public void updateMP(int upMP) {this.manaPoints = manaPoints + upMP;}

    @Override
    public void setSP(int n) {this.stealthPoints = n;}

    @Override
    public int getSP() {return stealthPoints;}

    @Override
    public void updateSP(int upSP) {this.stealthPoints = strengthPoints + upSP;}

    @Override
    public void setStrP(int n) {this.strengthPoints = n;}

    @Override
    public int getStrP() {return strengthPoints;}

    @Override
    public void updateStrP(int upStrP) {this.strengthPoints = strengthPoints + upStrP;}

    @Override
    public void setCharP(int n) {this.charismaPoints = n;}

    @Override
    public int getCharP() {return charismaPoints;}

    @Override
    public void updateCharP(int upCharP) {this.charismaPoints = charismaPoints + upCharP;}

    @Override
    public void setDays() {this.days = 0;}

    @Override
    public int getDays() {return days;}

    @Override
    public void updateDays(int upDays) {this.days = days + upDays;}
}
