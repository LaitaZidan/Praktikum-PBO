package Interface_LaitaZidan_09;
public class MainInterface {
    public static void main(String[] args) {
        //InterfaceAnimal IA = new InterfaceAnimal();
        Pig myPig = new Pig();
        Cow myCow = new Cow();
        Ayam myAyam = new Ayam();
        Ular myUlar = new Ular();
        
        // class pig
        System.out.println("======Pig======");
        myPig.animalSound();
        myPig.jenisAnimal();
        
        // class Cow
        System.out.println();
        System.out.println("======Cow======");
        myCow.animalSound();
        myCow.jenisAnimal();
        

        // class Ayam
        System.out.println();
        System.out.println("======Ayam======");
        myAyam.animalSound();
        myAyam.jenisAnimal();
        myAyam.makan();
        myAyam.run();

        // class Ular
        System.out.println();
        System.out.println("======Ular======");
        myUlar.animalSound();
        myUlar.jenisAnimal();
        myUlar.makan();
        myUlar.run();

      }
}
