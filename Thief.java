
public class Thief extends GameCharacter
{
    private int healthPoints;
    private int manaPoints;
    private int stealthPoints;
    private int strengthPoints;
    private int charismaPoints;

    public Thief() {}
    @Override
    public void setHP()
    {
        this.healthPoints = 10;
    }
    @Override
    public void getHP()
    {
        System.out.println(healthPoints);
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
        System.out.println(manaPoints);
    }
    @Override
    public void setSP()
    {
        this.stealthPoints = 10;
    }
    @Override
    public void getSP()
    {
        System.out.println(stealthPoints);
    }
    @Override
     public void setStrPoints()
    {
        this.strengthPoints = 5;
    }
    @Override
    public void getStrPoints()
    {
         System.out.println(strengthPoints);
    }
    @Override
    public void setCharPoints()
    {
        this.charismaPoints = 8;
    }
    @Override
    public void getCharPoints()
    {
        System.out.println(charismaPoints);
    }
}
