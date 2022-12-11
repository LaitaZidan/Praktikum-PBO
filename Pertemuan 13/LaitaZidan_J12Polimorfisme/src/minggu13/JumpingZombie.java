package minggu13;

public class JumpingZombie extends Zombie implements Destroyable{

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health = (int) (health * (1 + 0.3));
                break;
            case 2:
                health = (int) (health * (1 + 0.4));
                break;
            case 3:
                health = (int) (health * (1 + 0.5));
                break;
        }
    }

    @Override
    public void destroyed() {                
        health = (int) (health * (1-0.01));
    }
    
    public JumpingZombie(int health, int level)
    {
        this.health = health;
        this.level = level;
    }    
    
    public String getJumpingZombieInfo(){
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
    
}


