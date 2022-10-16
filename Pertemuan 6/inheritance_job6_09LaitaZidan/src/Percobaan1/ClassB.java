package Percobaan1;

public class ClassB {
    
    public int z;

    ClassA obA = new ClassA();


    public void getNilaiZ(){
        System.out.println("nilai Z:" + z);
    }

    public void getJumlah(){
        System.out.println("jumlah:" + (obA.x+obA.y+z));
    }

   
    
}




