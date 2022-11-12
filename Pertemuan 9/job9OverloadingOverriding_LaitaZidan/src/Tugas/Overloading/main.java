package Tugas.Overloading;

public class main {
    
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        
        System.out.println(sg.totalSudut(10));
        System.out.println(sg.totalSudut(10, 30));
        System.out.println(sg.keliling(5, 30, 30));
        System.out.println(sg.keliling(20, 30));
    }
}
