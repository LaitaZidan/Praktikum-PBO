package minggu13;

public class WalkingZombie extends Zombie implements Destroyable{

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health = (int) (health * (1 + 0.1));
                break;
            case 2:
                health = (int) (health * (1 + 0.3));
                break;
            case 3:
                health = (int) (health * (1 + 0.4));
                break;
        }
    }

    @Override
    public void destroyed() {
        health = (int) (health * (1-0.02));
    }
    
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    
    public String getWalkingZombieInfo(){
        return "Walking Zombie Data =\n" + super.getZombieInfo();
    }
    
}


