package Interface_LaitaZidan_09;
public class Ayam implements InterfaceAnimal, InterfaceBehaviour{
    @Override
    public void animalSound() {
       System.out.println("Bunyi Ayam: kukuruyuk..");
        
    }

    @Override
    public void jenisAnimal() {
        System.out.println("Termasuk hewan Ovipar");
        
    }

    @Override
    public void makan() {
        System.out.println("Ayam makan: Jagung, Dedak Padi ");
        
    }

    @Override
    public void run() {
        System.out.println("Ayam berjalan dengan dua kaki");
        
    }
}
