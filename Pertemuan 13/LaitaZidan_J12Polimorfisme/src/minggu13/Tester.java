package minggu13;

public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();
        
        System.out.println(wz.getWalkingZombieInfo());
        System.out.println(jz.getJumpingZombieInfo());
        System.out.println(b.getBarrierInfo());
        System.out.println("-".repeat(29));
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(wz.getWalkingZombieInfo());
        System.out.println(jz.getJumpingZombieInfo());
        System.out.println(b.getBarrierInfo());
        System.out.println("-".repeat(29));
    }
}


