package characters;

public class Mage extends GameCharacter
{
    private int healthPoints;
    private int manaPoints;
    private int stealthPoints;
    private int strengthPoints;
    private int charismaPoints;
    private int days;

    public Mage() {}

    public void setUPMage(Mage mg)
    {
        mg.setHP(10);
        mg.setMP(10);
        mg.setSP(8);
        mg.setStrP(3);
        mg.setCharP(5);
        mg.setDays();
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
