package minggu13;

public abstract class Zombie implements Destroyable {
    protected int health;
    protected int level;
    
    public abstract void heal();
    
    public abstract void destroyed();
    
    public String getZombieInfo(){
        return "Health\t= " + health +"\nLevel\t= " + level+"\n";
    }
}
