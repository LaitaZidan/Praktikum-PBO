package Latihan;

public class Perakalianku {

   void perkalian(int a, int b){

        System.out.println(a * b);
    }
    
    void perkalian(int a, int b, int c){

        System.out.println(a * b * c);
    }

    public static void main(String[] args) {

        Perakalianku objek = new Perakalianku();

        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }

}
