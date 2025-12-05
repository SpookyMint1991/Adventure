package characters;

public class Thief extends GameCharacter
{
    private int healthPoints;
    private int manaPoints;
    private int stealthPoints;
    private int strengthPoints;
    private int charismaPoints;
    private int days;

    public Thief() {}

    public void setUPThief(Thief tf)
    {
        tf.setHP();
        tf.setMP();
        tf.setSP();
        tf.setStrP();
        tf.setCharP();
        tf.setDays();
    }

    @Override
    public void getStats() 
    {
        System.out.println("The Thiefs stats: ");
        System.out.println("Health    = " + healthPoints);
        System.out.println("Mana      = " + manaPoints);
        System.out.println("Stealth   = " + stealthPoints);
        System.out.println("Strength  = " + strengthPoints);
        System.out.println("Charisma  = " + charismaPoints);
        System.out.println();
    }

    @Override
    public void setHP() {this.healthPoints = 10;}

    @Override
    public int getHP() {return healthPoints;}
    
    @Override
    public void updateHP(int upHP) {this.healthPoints = healthPoints + upHP;}

    @Override
    public void setMP() {this.manaPoints = 3;}

    @Override
    public int getMP() {return manaPoints;}

    @Override
    public void updateMP(int upMP) {this.manaPoints = manaPoints + upMP;}

    @Override
    public void setSP() {this.stealthPoints = 10;}

    @Override
    public int getSP() {return stealthPoints;}

    @Override
    public void updateSP(int upSP) {this.stealthPoints = strengthPoints + upSP;}

    @Override
     public void setStrP() {this.strengthPoints = 5;}

    @Override
    public int getStrP() {return strengthPoints;}

    @Override
    public void updateStrP(int upStrP) {this.strengthPoints = strengthPoints + upStrP;}

    @Override
    public void setCharP() {this.charismaPoints = 8;}
    
    @Override
    public int getCharP() {return charismaPoints;}

    @Override
    public void updatecharP(int upCharP) {this.charismaPoints = charismaPoints + upCharP;}

    @Override
    public void setDays() {this.days = 0;}

    @Override
    public int getDays() {return days;}

    @Override
    public void updateDays(int upDays) {this.days = days + upDays;}
}
