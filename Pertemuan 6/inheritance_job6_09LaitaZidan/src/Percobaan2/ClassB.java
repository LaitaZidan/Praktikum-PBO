package Percobaan2;

public class ClassB {
    
    private int z;

    ClassA obA = new ClassA();

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ(){
        System.out.println("nilai Z:" + z);
    }

    public void getJumlah(){
        System.out.println("jumlah:" + (obA.getX()+obA.getY()+z));
    }

}
